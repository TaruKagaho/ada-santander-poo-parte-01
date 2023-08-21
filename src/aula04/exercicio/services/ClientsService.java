package aula04.exercicio.services;

import aula04.exercicio.models.ClientEntity;
import aula04.exercicio.repositories.ClientsRespository;

import java.util.List;

public class ClientsService {
    private ClientsRespository clientsRespository;

    public ClientsService() {
        this.clientsRespository = new ClientsRespository();
    }

    public void addClient(ClientEntity newClient) {
        this.clientsRespository.add(newClient);
    }

    public List<ClientEntity> getAllClients() {
        return this.clientsRespository.getAll();
    }

    public ClientEntity getClientByName(String clientName) {
        return this.clientsRespository.getClientByName(clientName);
    }
}
