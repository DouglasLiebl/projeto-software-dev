package io.github.service;

import io.github.dto.ClientDTO;
import io.github.entities.Client;

import java.sql.SQLException;

public interface ClientService {

    void registerClient(ClientDTO client) throws Exception;

    ClientDTO getClientByEmail(String email) throws Exception;
}
