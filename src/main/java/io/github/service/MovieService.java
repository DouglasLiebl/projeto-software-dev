package io.github.service;

import io.github.dto.MovieDTO;

import java.sql.SQLException;
import java.util.List;

public interface MovieService {

    void register(MovieDTO request) throws Exception;

    List<MovieDTO> getAllLikeName(String name);

    MovieDTO getMovieById(Long id) throws SQLException, Exception;

    void update(MovieDTO request) throws Exception;

    void delete(Long id) throws Exception;

    void updateMovieStatus(Long id, Boolean isAvailable) throws Exception;
}
