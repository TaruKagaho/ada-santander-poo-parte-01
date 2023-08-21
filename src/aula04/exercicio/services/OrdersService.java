package aula04.exercicio.services;

import aula04.exercicio.models.OrderEntity;
import aula04.exercicio.repositories.OrdersRepository;

import java.util.List;

public class OrdersService {
    private static OrdersRepository ordersRepository;

    public OrdersService() {
        ordersRepository = new OrdersRepository();
    }

    public void addOrder(OrderEntity newOrder) {
        ordersRepository.add(newOrder);
    }

    public List<OrderEntity> listOfOrderFromRestaurant(Long restaurantId) {
        return ordersRepository.getAllOrderByRestaurantId(restaurantId);
    }

    public List<OrderEntity> listOfOrderFromClient(Long clientId) {
        return ordersRepository.getAllOrderByClientId(clientId);
    }
}
