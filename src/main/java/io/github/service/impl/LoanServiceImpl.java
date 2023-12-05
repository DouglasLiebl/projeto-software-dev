package io.github.service.impl;

import io.github.entities.Loan;
import io.github.repository.LoanRepository;
import io.github.service.ClientService;
import io.github.service.LoanService;
import io.github.service.MovieService;

public class LoanServiceImpl implements LoanService {

    @Override
    public void createLoan(Long movieId, String email) throws Exception {
        MovieService movieService = new MovieServiceImpl();
        ClientService clientService = new ClientServiceImpl();
        LoanRepository repository = new LoanRepository();

        var movie = movieService.getMovieById(movieId);
        var client = clientService.getClientByEmail(email);

        Loan request = Loan.builder()
                .movieId(movie)
                .clientId(client)
                .build();

        repository.createLoan(request);
    }
}
