package io.github.service.impl;

import io.github.entities.Movie;
import io.github.repository.MovieRepository;
import io.github.service.MovieService;
import lombok.SneakyThrows;

import java.util.List;

public class MovieServiceImpl implements MovieService {

    @Override
    public Movie register(Movie request) throws Exception {
        MovieRepository repository = getMovieRepository();
        repository.insertMovie(request);

        return repository.getMovieByName(request.getName());
    }

    @SneakyThrows
    @Override
    public List<Movie> getAll() {
        MovieRepository repository = getMovieRepository();
        return repository.getAll();
    }

    @Override
    public Movie findByName(String name) throws Exception {
        MovieRepository repository = getMovieRepository();
        return repository.getMovieByName(name);
    }


    @Override
    public Movie getMovieById(Long id) throws Exception {
        MovieRepository repository = getMovieRepository();

        return repository.getMovieById(id);
    }

    @Override
    public Movie getMovieByIdAndIsAvailable(Long id) throws Exception{
        MovieRepository repository = getMovieRepository();

        return repository.getMovieByIdAndIsAvailable(id);
    }

    private static MovieRepository getMovieRepository() {
        return new MovieRepository();
    }

}
