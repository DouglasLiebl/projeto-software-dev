package io.github.service.impl;

import io.github.dto.MovieDTO;
import io.github.entities.Movie;
import io.github.repository.MovieRepository;
import io.github.service.MovieService;
import lombok.SneakyThrows;

import java.util.List;

public class MovieServiceImpl implements MovieService {

    private final MovieRepository repository = new MovieRepository();

    @Override
    public void register(MovieDTO request) throws Exception {
        repository.insertMovie(Movie.of(request));
    }

    @SneakyThrows
    @Override
    public List<MovieDTO> getAllLikeName(String name) {
        return repository.getAll();
    }


    @Override
    public MovieDTO getMovieById(Long id) throws Exception {
        return repository.getMovieById(id);
    }


    @Override
    public void update(MovieDTO request) throws Exception {
        var movie = Movie.of(request);
        movie.setId(request.getId());
        repository.updateMovie(movie);
    }

    @Override
    public void delete(Long id) throws Exception {
        repository.deleteMovie(id);
    }

    @Override
    public void updateMovieStatus(Long id, Boolean isAvailable) throws Exception {
        repository.updateMovieStatus(id, isAvailable);
    }


}
