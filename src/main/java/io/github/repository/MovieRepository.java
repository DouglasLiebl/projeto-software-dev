package io.github.repository;


import io.github.configuration.DatabaseConnection;
import io.github.dto.MovieDTO;
import io.github.entities.Movie;
import io.github.enums.Genre;
import io.github.enums.Rating;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MovieRepository {

    public void insertMovie(Movie movie) throws SQLException {
        String sql = "INSERT INTO tb_movies(name, duration, director, release_date, genre, rating, description, is_available) " +
                "VALUES(?, ?, ?, ?, ?, ?, ?, ?)";

        Connection conn = getConnection();
        PreparedStatement pstmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        pstmt.setString(1, movie.getName());
        pstmt.setDouble(2, movie.getDuration());
        pstmt.setString(3, movie.getDirector());
        pstmt.setString(4, movie.getReleaseDate());
        pstmt.setString(5, movie.getGenre().name());
        pstmt.setString(6, movie.getRating().name());
        pstmt.setString(7,  movie.getDescription());
        pstmt.setBoolean(8, true);

        pstmt.executeUpdate();
    }

    public MovieDTO getMovieByName(String name) throws SQLException {
        String sql = "SELECT * FROM tb_movies WHERE name = ?";

        Connection conn = getConnection();
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, name);

        ResultSet rs = pstmt.executeQuery();
        if (!rs.next()) throw new SQLException("Not Found");

        return getBuild(rs);
    }

    public MovieDTO getMovieById(Long id) throws Exception {
        String sql = "SELECT * FROM tb_movies WHERE id = ?";

        Connection conn = getConnection();
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setLong(1, id);

        ResultSet rs = pstmt.executeQuery();
        if (!rs.next()) throw new Exception(String.format("Filme não encontrado com o id: %d", id));

        return getBuild(rs);
    }

    public MovieDTO getMovieByIdAndIsAvailable(Long id) throws Exception {
        String sql = "SELECT * FROM tb_movies WHERE id = ? AND is_available = true";

        Connection conn = getConnection();
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setLong(1, id);

        ResultSet rs = pstmt.executeQuery();
        if (!rs.next()) throw new Exception(String.format("Filme não encontrado com o id: %d", id));
        if (!rs.getBoolean("is_available")) throw new Exception("Filme já alugado");

        return getBuild(rs);
    }

    public List<MovieDTO> getAll() throws Exception {
        String sql = "SELECT * FROM tb_movies";

        Connection conn = getConnection();
        PreparedStatement pstmt = conn.prepareStatement(sql);

        ResultSet rs = pstmt.executeQuery();

        List<MovieDTO> response = new ArrayList<>();
        while (rs.next()) {
            response.add(getBuild(rs));
        }

        return response;
    }

    public void deleteMovie(Long id) throws Exception {
        String sql = "DELETE FROM tb_movies WHERE id = ?";
        
        Connection conn = getConnection();

        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setLong(1, id);
        pstmt.executeQuery();

    }

    public void updateMovieStatus(Long id, Boolean isAvailable) throws Exception {
        String sql = """
                UPDATE tb_movies
                SET is_available = ?
                WHERE id = ?
                """;

        Connection conn = getConnection();
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setBoolean(1, isAvailable);
        pstmt.setLong(2, id);

        try {
            pstmt.executeQuery();
        } catch (SQLException e) {

        }
    }

    public void updateMovie(Movie request) throws Exception {
        String sql = """
                UPDATE tb_movies
                SET name = ?,
                    director = ?,
                    genre = ?,
                    release_date = ?,
                    rating = ?,
                    duration = ?,
                    description = ?
                WHERE id = ?
                """;

        Connection conn = getConnection();
        PreparedStatement pstmt = conn.prepareStatement(sql);

        pstmt.setString(1, request.getName());
        pstmt.setString(2, request.getDirector());
        pstmt.setString(3, request.getGenre().name());
        pstmt.setString(4, request.getReleaseDate());
        pstmt.setString(5, request.getRating().name());
        pstmt.setDouble(6, request.getDuration());
        pstmt.setString(7, request.getDescription());
        pstmt.setLong(8, request.getId());

        pstmt.executeQuery();
    }

    private static Connection getConnection() {
        return new DatabaseConnection().getConnection();
    }

    private static MovieDTO getBuild(ResultSet rs) throws SQLException {
        return MovieDTO.builder()
                .id(rs.getLong("id"))
                .name(rs.getString("name"))
                .duration(String.valueOf(rs.getDouble("duration")))
                .director(rs.getString("director"))
                .releaseDate(rs.getString("release_date"))
                .genre(rs.getString("genre"))
                .rating(rs.getString("rating"))
                .description(rs.getString("description"))
                .isAvailable(rs.getBoolean("is_available"))
                .build();
    }
}
