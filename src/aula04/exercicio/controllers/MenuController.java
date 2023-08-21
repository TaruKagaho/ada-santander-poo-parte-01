package aula04.exercicio.controllers;

import aula04.exercicio.models.RestaurantEntity;

import java.util.InputMismatchException;
import java.util.Scanner;

import static aula04.exercicio.utils.InputHandler.getInt;
import static aula04.exercicio.utils.InputHandler.getStringNextLine;

public class MenuController {
    private RestaurantsController restaurantsController;
    private FoodsController foodsController;
    private ClientsController clientsController;
    private OrdersController ordersController;
    // private Scanner sc;

    public MenuController() {
        this.restaurantsController = new RestaurantsController();
        this.foodsController = new FoodsController();
        this.clientsController = new ClientsController();
        this.ordersController = new OrdersController();
        // this.sc = new Scanner(System.in);
    }

    public void exibirMenu() {
        int option = 0;

        do {
            System.out.print("""
                    
                    Menu:
                    1. Cadastrar um restaurante
                    2. Listar todos os restaurantes
                    3. Adicionar um prato em um restaurante
                    4. Listar pratos de um restaurante
                    5. Fazer um pedido
                    6. Listar todos os pedidos de um restaurante
                    7. Listar todos os pedidos de um cliente
                    0. Encerrar
                    
                    """);
            try {
                option = getInt("Escolha uma opção: ");
                System.out.println();
                //option = sc.nextInt();

                // sc.nextLine();
            } catch (InputMismatchException e) {
                getStringNextLine("Opção inválida! Por favor, insira um número conforme o menu.");
                option = getInt("Escolha uma opção: ");
                //System.out.println("Opção inválida! Por favor, insira um número conforme o menu.");
                
                // sc.nextLine();
                
                continue;
            }

            executeOption(option);
        } while (option != 0);
    }

    private void executeOption(int option) {
        RestaurantEntity restaurant = null;

        switch (option) {
            case 1:
                this.restaurantsController.addNewRestaurantView();
                break;
            case 2:
                this.restaurantsController.listAllRestaurantsView();
                break;
            case 3:
                System.out.println("---- Cadastre um prato ---- \n");

                // RestaurantEntity restaurant = this.restaurantsController.getRestaurantByNameView();
                restaurant = this.restaurantsController.getRestaurantByNameView();

                this.foodsController.addNewFoodView(restaurant.getId());
                break;
            case 4:
                System.out.println("---- Lista pratos de um restaurante ---- \n");

                // RestaurantEntity restaurant = this.restaurantsController.getRestaurantByNameView();
                restaurant = this.restaurantsController.getRestaurantByNameView();

                this.foodsController.getAllFoodInRestaurantView(restaurant.getId());
                break;
            case 5:
                System.out.println("---- Cadastro de um pedido ---- \n");

                /*long clientId = this.clientsController.addClientView().getId();
                long restaurantId = this.restaurantsController.getRestaurantByNameView().getId();
                long foodId = this.foodsController.getFoodByNameAndRestaurantIdView(restaurantId).getId();

                this.ordersController.addNewOrder(clientId, restaurantId, foodId);*/
                this.ordersController.addNewOrderView();
                break;
            case 6:
                System.out.println("---- Lista de pedidos de um restaurante ---- \n");

                /*String restaurantName = this.restaurantsController.getRestaurantByNameView().getName();

                this.ordersController.listOrdersByRestaurantName(restaurantName);*/

                this.ordersController.listOrdersByRestaurantNameView();
                break;
            case 7:
                this.ordersController.listOrdersByClientNameView();
                break;
            case 0:
                return;
            default:
                System.out.println("Opção inválida!");
                System.out.println();
        }
    }
}

