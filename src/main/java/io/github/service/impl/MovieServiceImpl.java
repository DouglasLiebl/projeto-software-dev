package io.github.service.impl;

import io.github.entities.Movie;
import io.github.repository.MovieRepository;
import io.github.service.MovieService;
import lombok.SneakyThrows;

import java.util.List;

public class MovieServiceImpl implements MovieService {

    @Override
    public void register(Movie request) throws Exception {
        MovieRepository repository = getMovieRepository();
        stringValidation(request.getName());
        stringValidation(request.getDirector());
        repository.insertMovie(request);

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

    private static void stringValidation(String request) throws Exception {
        if (request.isEmpty()) throw new Exception("Nomes não podem estar em branco.");
        if (request.isBlank()) throw new Exception("Nomes não podem ser vazios.");
        if (request.equals("null")) throw new Exception("Nomes não podem ser nulos");
    }

}
