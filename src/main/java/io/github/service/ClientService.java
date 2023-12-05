package io.github.service;

import io.github.entities.Client;

import java.sql.SQLException;

public interface ClientService {

    void registerClient(Client client) throws Exception;

    Client getClientByEmail(String email) throws Exception;
}
