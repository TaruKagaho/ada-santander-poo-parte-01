package aula04.exercicio.controllers;

import aula04.exercicio.models.ClientEntity;
import aula04.exercicio.services.ClientsService;

import java.util.List;

import static aula04.exercicio.utils.InputHandler.getStringNextLine;

public class ClientsController {
    private ClientsService clientsService;

    public ClientsController() {
        this.clientsService = new ClientsService();
    }

    public ClientEntity addClientView() {
        String name = getStringNextLine("Digite o nome do cliente:");

        ClientEntity clientFound = this.clientsService.getClientByName(name);

        if (clientFound != null) {
            return clientFound;
        }

        String address = getStringNextLine("Digite o endereço de entrega:");

        ClientEntity newClient = new ClientEntity(name, address);

        this.clientsService.addClient(newClient);

        return newClient;
    }
    public void addClient(ClientEntity newClient) {
        this.clientsService.addClient(newClient);
    }

    public List<ClientEntity> getAllClients() {
        return this.clientsService.getAllClients();
    }

    public ClientEntity getClientByNameView() {
        String clientName = getStringNextLine("Digite o nome do cliente:");

        return this.clientsService.getClientByName(clientName);
    }
    public void getClientByName(String clientName) {}
}
