package io.github.service.impl;

import io.github.entities.Client;
import io.github.entities.Loan;
import io.github.entities.Movie;
import io.github.repository.LoanRepository;
import io.github.service.ClientService;
import io.github.service.LoanService;
import io.github.service.MovieService;

import java.time.OffsetDateTime;

public class LoanServiceImpl implements LoanService {

    private final MovieService movieService = new MovieServiceImpl();
    private final ClientService clientService = new ClientServiceImpl();
    private final LoanRepository repository = new LoanRepository();

    @Override
    public void createLoan(Long movieId, String email) throws Exception {

        var client = clientService.getClientByEmail(email);
        var movie = movieService.getMovieById(movieId);

        if (!movie.isAvailable()) throw new Exception("Filme indisponível no momento.");

        var loan = Loan.builder()
                .clientId(Client.of(client))
                .movieId(Movie.of(movie))
                .returned(false)
                .createdAt(OffsetDateTime.now())
                .build();

        loan.getClientId().setId(client.getId());
        loan.getMovieId().setId(movie.getId());

        movieService.updateMovieStatus(movieId, false);
        repository.createLoan(loan);
    }

    @Override
    public void updateStatus(String code) throws Exception {
        movieService.updateMovieStatus(repository.getMovieId(code),
                true);
        repository.updateStatus(code);

    }
}
