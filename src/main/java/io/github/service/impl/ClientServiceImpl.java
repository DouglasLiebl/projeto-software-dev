package io.github.service.impl;

import io.github.dto.ClientDTO;
import io.github.entities.Client;
import io.github.repository.ClientRepository;
import io.github.service.ClientService;
import lombok.SneakyThrows;

import java.sql.SQLException;

public class ClientServiceImpl implements ClientService {

    private final ClientRepository repository = new ClientRepository();

    @Override
    public void registerClient(ClientDTO client) throws Exception {
        repository.registerClient(Client.of(client));
    }

    @Override
    public ClientDTO getClientByEmail(String email) throws Exception {
        return repository.getClientByEmail(email);
    }
}
