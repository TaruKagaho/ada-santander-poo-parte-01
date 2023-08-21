package aula04.exercicio.controllers;

import aula04.exercicio.dtos.OrdersClientResponseDto;
import aula04.exercicio.dtos.OrdersRestaurantResponseDto;
import aula04.exercicio.models.ClientEntity;
import aula04.exercicio.models.FoodEntity;
import aula04.exercicio.models.OrderEntity;
import aula04.exercicio.models.RestaurantEntity;
import aula04.exercicio.services.OrdersService;

import java.util.ArrayList;
import java.util.List;

public class OrdersController {
    private final OrdersService ordersService;
    private final ClientsController clientsController;
    private final RestaurantsController restaurantsController;
    private final FoodsController foodsController;

    public OrdersController() {
        this.ordersService = new OrdersService();
        this.clientsController = new ClientsController();
        this.restaurantsController = new RestaurantsController();
        this.foodsController = new FoodsController();
    }

    public void addNewOrderView() {
        long clientId = this.clientsController.addClientView().getId();
        RestaurantEntity restaurant = this.restaurantsController.getRestaurantByNameView();

        if (restaurant == null) {
            System.out.println("Restaurante informado não cadastrado!");

            return;
        }

        long restaurantId = restaurant.getId();
        FoodEntity food = this.foodsController.getFoodByNameAndRestaurantIdView(restaurantId);

        if (food == null) {
            System.out.println("Prato informado não cadastrado!");

            return;
        }

        long foodId = food.getId();
        OrderEntity newOrder = new OrderEntity(clientId, restaurantId, foodId);

        this.ordersService.addOrder(newOrder);

        System.out.println("\nPedido cadastrado com sucesso!\n");
    }
    public void addNewOrder(
            long clientId,
            long restaurantId,
            long foodId
    ) {
        OrderEntity newOrder = new OrderEntity(clientId, restaurantId, foodId);

        this.ordersService.addOrder(newOrder);

        System.out.println("\n Pedido cadastrado com sucesso! \n");
    }

    public void listOrdersByRestaurantNameView() {
        RestaurantEntity restaurant = this.restaurantsController.getRestaurantByNameView();

        List<OrderEntity> ordersFromRestaurantChoosed = this.ordersService.listOfOrderFromRestaurant(restaurant.getId());
        List<ClientEntity> listOfClients = this.clientsController.getAllClients();
        List<FoodEntity> listOfFoods = this.foodsController.getAllFoodInRestaurant(restaurant.getId());
        List<OrdersRestaurantResponseDto> listOfOrders = getRestaurantOrdersResponseDtos(
                ordersFromRestaurantChoosed,
                listOfClients,
                listOfFoods
        );

        System.out.println("Listas dos pedidos do restaurante " + restaurant.getName() + ":");

        for ( OrdersRestaurantResponseDto orderDto : listOfOrders ) {
            System.out.println(orderDto);
        }
    }

    private List<OrdersRestaurantResponseDto> getRestaurantOrdersResponseDtos(
            List<OrderEntity> ordersFromRestaurantChoosed,
            List<ClientEntity> listOfClients,
            List<FoodEntity> listOfFoods
    ) {
        List<OrdersRestaurantResponseDto> listOfOrders = new ArrayList<>();

        for ( OrderEntity order : ordersFromRestaurantChoosed) {
            // OrdersResponseDto newOrderDTO;
            String clientName = "";
            String foodName = "";

            for ( ClientEntity client : listOfClients) {
                if (client.getId() == order.getClientId()) {
                    clientName = client.getName();
                }
            }

            for ( FoodEntity food : listOfFoods) {
                if (food.getId() == order.getFoodId()) {
                    foodName = food.getName();
                }
            }

            OrdersRestaurantResponseDto newOrderDTO = new OrdersRestaurantResponseDto(clientName, foodName);

            listOfOrders.add(newOrderDTO);
        }

        return listOfOrders;
    }

    public void listOrdersByRestaurantName(String restaurantName) {
        // this.ordersService.listOfOrderFromRestaurant();

    }

    public void listOrdersByClientNameView() {
        ClientEntity client = this.clientsController.getClientByNameView();

        List<OrderEntity> ordersFromClientChosen = this.ordersService.listOfOrderFromClient(client.getId());
        List<RestaurantEntity> listOfRestaurants = this.restaurantsController.getAllRestaurant();
        List<FoodEntity> listOfFoods = this.foodsController.getAllFood();
        List<OrdersClientResponseDto> listOfOrders = getClientOrdersResponseDtos(
                ordersFromClientChosen,
                listOfRestaurants,
                listOfFoods
        );

        System.out.println("Listas dos pedidos do cliente " + client.getName() + ":");

        for ( OrdersClientResponseDto orderDto : listOfOrders ) {
            System.out.println(orderDto);
        }
    }

    private List<OrdersClientResponseDto> getClientOrdersResponseDtos(
            List<OrderEntity> ordersFromClientChosen,
            List<RestaurantEntity> listOfRestaurants,
            List<FoodEntity> listOfFoods
    ) {
        List<OrdersClientResponseDto> listOfOrders = new ArrayList<>();

        for ( OrderEntity order : ordersFromClientChosen) {
            String restaurantName = "";
            String foodName = "";

            for ( RestaurantEntity restaurant : listOfRestaurants) {
                if (restaurant.getId() == order.getRestaurantId()) {
                    restaurantName = restaurant.getName();
                }
            }

            for ( FoodEntity food : listOfFoods) {
                if (food.getId() == order.getFoodId()) {
                    foodName = food.getName();
                }
            }

            OrdersClientResponseDto newOrderDTO = new OrdersClientResponseDto(restaurantName, foodName);

            listOfOrders.add(newOrderDTO);
        }

        return listOfOrders;
    }
}
