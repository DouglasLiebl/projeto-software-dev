package io.github.repository;


import io.github.configuration.DatabaseConnection;
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

    public Movie getMovieByName(String name) throws SQLException {
        String sql = "SELECT * FROM tb_movies WHERE name = ?";

        Connection conn = getConnection();
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, name);

        ResultSet rs = pstmt.executeQuery();
        if (!rs.next()) throw new SQLException("Not Found");

        return getBuild(rs);
    }

    public Movie getMovieById(Long id) throws Exception {
        String sql = "SELECT * FROM tb_movies WHERE id = ?";

        Connection conn = getConnection();
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setLong(1, id);

        ResultSet rs = pstmt.executeQuery();
        if (!rs.next()) throw new Exception(String.format("Filme não encontrado com o id: %d", id));

        return getBuild(rs);
    }

    public Movie getMovieByIdAndIsAvailable(Long id) throws Exception {
        String sql = "SELECT * FROM tb_movies WHERE id = ? AND is_available = true";

        Connection conn = getConnection();
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setLong(1, id);

        ResultSet rs = pstmt.executeQuery();
        if (!rs.next()) throw new Exception(String.format("Filme não encontrado com o id: %d", id));
        if (!rs.getBoolean("is_available")) throw new Exception("Filme já alugado");

        return getBuild(rs);
    }

    public List<Movie> getAll() throws Exception {
        String sql = "SELECT * FROM tb_movies";

        Connection conn = getConnection();
        PreparedStatement pstmt = conn.prepareStatement(sql);

        ResultSet rs = pstmt.executeQuery();

        List<Movie> response = new ArrayList<>();
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

    private static Movie getBuild(ResultSet rs) throws SQLException {
        return Movie.builder()
                .id(rs.getLong("id"))
                .name(rs.getString("name"))
                .duration(rs.getDouble("duration"))
                .director(rs.getString("director"))
                .releaseDate(rs.getString("release_date"))
                .genre(Genre.valueOf(rs.getString("genre")))
                .rating(Rating.valueOf(rs.getString("rating")))
                .description(rs.getString("description"))
                .isAvailable(rs.getBoolean("is_available"))
                .build();
    }
}
