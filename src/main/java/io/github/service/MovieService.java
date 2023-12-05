package io.github.service;

import io.github.entities.Movie;

import java.sql.SQLException;
import java.util.List;

public interface MovieService {

    void register(Movie request) throws Exception;

    List<Movie> getAll();

    Movie findByName(String name) throws Exception;

    Movie getMovieById(Long id) throws SQLException, Exception;

    Movie getMovieByIdAndIsAvailable(Long id) throws Exception;
}
