package aula04.exercicio.services;

import aula04.exercicio.models.FoodEntity;
import aula04.exercicio.models.OrderEntity;
import aula04.exercicio.models.RestaurantEntity;
import aula04.exercicio.repositories.RestaurantsRepository;

import java.util.List;

public class RestaurantsService {
    private static RestaurantsRepository restaurantRepository;
    private FoodsService foodsService;
    private OrdersService ordersService;

    public RestaurantsService() {
        restaurantRepository = new RestaurantsRepository();
        this.foodsService = new FoodsService();
        this.ordersService = new OrdersService();
    }

    public void addRestaurant(RestaurantEntity newRestaurant) {
        restaurantRepository.add(newRestaurant);
    }

    public List<RestaurantEntity> getAll() {
        List<RestaurantEntity> restaurantList = restaurantRepository.getAll();

        for ( RestaurantEntity restaurant : restaurantList ) {
            List<FoodEntity> foodsList = this.foodsService.getAllFoodByRestaurantId(
                    restaurant.getId()
            );
            List<OrderEntity> ordersList = this.ordersService.listOfOrderFromRestaurant(
                    restaurant.getId()
            );

            restaurant.setFoodList(foodsList);
            restaurant.setOrderList(ordersList);
        }

        return restaurantList;
        // return restaurantRepository.getAll();
    }

    public RestaurantEntity getOneById(Long id) {
        return restaurantRepository.getById(id);
    }

    public RestaurantEntity getOneByName(String name) {
        return restaurantRepository.getByName(name);
    }

    public void removeRestaurant(Long id) {
        restaurantRepository.remove(id);
    }
}
