package aula04.exercicio.repositories;

import aula04.exercicio.models.OrderEntity;

import java.util.ArrayList;
import java.util.List;

public class OrdersRepository {
    private final List<OrderEntity> orderList;

    public OrdersRepository() {
        this.orderList = new ArrayList<>();
    }

    public void add(OrderEntity newOrder) {
        this.orderList.add(newOrder);
    }

    public List<OrderEntity> getAllOrderByRestaurantId(Long restaurantId) {
        List<OrderEntity> ordersFromRestaurant = new ArrayList<>();

        for ( OrderEntity order : orderList ) {
            if (order.getRestaurantId() == restaurantId) {
                ordersFromRestaurant.add(order);
            }
        }

        return ordersFromRestaurant;
    }

    public List<OrderEntity> getAllOrderByClientId(Long clientId) {
        List<OrderEntity> ordersFromClient = new ArrayList<>();

        for ( OrderEntity order : orderList ) {
            if (order.getClientId() == clientId) {
                ordersFromClient.add(order);
            }
        }

        return ordersFromClient;
    }
}
