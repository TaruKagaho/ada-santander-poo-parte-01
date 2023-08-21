package aula04.exercicio.repositories;

import aula04.exercicio.models.ClientEntity;

import java.util.ArrayList;
import java.util.List;

public class ClientsRespository {
    private final List<ClientEntity> clientList;

    public ClientsRespository() {
        this.clientList = new ArrayList<>();
    }

    public void add(ClientEntity newClient) {
        this.clientList.add(newClient);
    }

    public ClientEntity getClientById(Long id) {
        ClientEntity clientFound = null;

        for ( ClientEntity client : this.clientList ) {
            if (client.getId() == id) {
                clientFound = client;
            }
        }

        if (clientFound == null) {
            throw new RuntimeException("Cliente não encontrado!");
        }

        return clientFound;
    }

    public List<ClientEntity> getAll() {
        return this.clientList;
    }

    public ClientEntity getClientByName(String clientName) {
        ClientEntity clientFound = null;

        for ( ClientEntity client : this.clientList ) {
            if (client.getName().equalsIgnoreCase(clientName)) {
                clientFound = client;
            }
        }

        /*if (clientFound == null) {
            throw new RuntimeException("Cliente não encontrado!");
        }*/

        return clientFound;
    }
}
