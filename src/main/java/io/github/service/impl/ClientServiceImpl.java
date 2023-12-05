package io.github.service.impl;

import io.github.entities.Client;
import io.github.repository.ClientRepository;
import io.github.service.ClientService;
import lombok.SneakyThrows;

import java.sql.SQLException;

public class ClientServiceImpl implements ClientService {


    @Override
    public void registerClient(Client client) throws Exception {
        ClientRepository repository = new ClientRepository();
        repository.registerClient(client);
    }

    @Override
    public Client getClientByEmail(String email) throws Exception {
        ClientRepository repository = new ClientRepository();
        return repository.getClientByEmail(email);
    }
}
