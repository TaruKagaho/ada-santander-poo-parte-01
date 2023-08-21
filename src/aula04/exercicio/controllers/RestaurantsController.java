package aula04.exercicio.controllers;

import aula04.exercicio.models.RestaurantEntity;
import aula04.exercicio.services.RestaurantsService;

import java.util.List;

import static aula04.exercicio.utils.InputHandler.getStringNext;
import static aula04.exercicio.utils.InputHandler.getStringNextLine;

public class RestaurantsController {
    private final RestaurantsService restaurantsService;

    public RestaurantsController() {
        this.restaurantsService = new RestaurantsService();
    }

    public void addNewRestaurantView() {
        // getStringNextLine("---- Cadastro de Restaurante ---- \n");
        // getStringNextLine("");
        System.out.println("---- Cadastro de Restaurante ---- \n");
        // System.out.println();
        // System.out.print("");

        String name = getStringNextLine("Digite o nome: ");

        RestaurantEntity restaurantFound = this.restaurantsService.getOneByName(name);

        if (restaurantFound != null) {
            System.out.println("\nRestaurante já cadastrado!");

            return;
        }
        // TODO verificar se endereço já cadastrado
        String address = getStringNextLine("Digite o endereço do restaurante: ");
        /*String name = getStringNext("Digite o nome: ");
        String address = getStringNext("Digite o endereço: ");*/

        RestaurantEntity newRestaurant = new RestaurantEntity(name, address);

        this.restaurantsService.addRestaurant(newRestaurant);

        /*getStringNextLine("Restaurante cadastrado com sucesso!");
        getStringNextLine("");*/
        System.out.println("\nRestaurante cadastrado com sucesso!");
        // System.out.println();
    }
    public void addNewRestaurant(RestaurantEntity newRestaurant) {
        this.restaurantsService.addRestaurant(newRestaurant);
    }

    public void listAllRestaurantsView() {
        List<RestaurantEntity> listOfRestaurants = this.restaurantsService.getAll();

        if (listOfRestaurants.isEmpty()) {
            System.out.println("A lista de restaurante está vazia!");

            return;
        }

        System.out.println("--- Lista dos restaurantes cadastrados ---");

        for ( RestaurantEntity restaurant : listOfRestaurants ) {
            System.out.println(restaurant);
            // getStringNextLine(restaurant.toString());
            // getStringNextLine("");
            // System.out.println();
        }
    }
    public List<RestaurantEntity> listAllRestaurants() {
        return this.restaurantsService.getAll();
    }

    public RestaurantEntity getRestaurantByNameView() {
        String name = getStringNextLine("Digite o nome do restaurante: ");

        return this.restaurantsService.getOneByName(name);
    }
    public RestaurantEntity getRestaurantByName(String name) {
        // RestaurantEntity restaurant = this.restaurantsService.getOneByName(name);

        return this.restaurantsService.getOneByName(name);
    }

    public List<RestaurantEntity> getAllRestaurant() {
        return this.restaurantsService.getAll();
    }

    public void removeRestaurant(Long id) {
        this.restaurantsService.removeRestaurant(id);
    }
}
