package io.github.service;

public interface LoanService {

    void createLoan(Long movieId, String email) throws Exception;

    void updateStatus(String code) throws Exception;
}
