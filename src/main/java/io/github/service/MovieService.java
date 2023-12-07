package io.github.service;

import io.github.dto.MovieDTO;

import java.sql.SQLException;
import java.util.List;

public interface MovieService {

    void register(MovieDTO request) throws Exception;

    List<MovieDTO> getAll();

    MovieDTO findByName(String name) throws Exception;

    MovieDTO getMovieById(Long id) throws SQLException, Exception;

    MovieDTO getMovieByIdAndIsAvailable(Long id) throws Exception;

    void update(MovieDTO request) throws Exception;

    void delete(Long id) throws Exception;
}
