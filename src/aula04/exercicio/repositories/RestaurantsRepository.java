package aula04.exercicio.repositories;

import aula04.exercicio.models.FoodEntity;
import aula04.exercicio.models.RestaurantEntity;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class RestaurantsRepository {
    private final List<RestaurantEntity> restaurantList;
    // private List<RestaurantEntity> restaurantList;

    public RestaurantsRepository() {
        this.restaurantList = new ArrayList<>();
    }

    public void add(RestaurantEntity newRestaurant) {
        this.restaurantList.add(newRestaurant);
    }

    public List<RestaurantEntity> getAll() {
        return this.restaurantList;
    }

    public RestaurantEntity getById(Long id) {
        Optional<RestaurantEntity> restaurantOptional = this.restaurantList
                .stream()
                .filter(r -> r.getId() == id)
                .findFirst();

        /*if (restaurantOptional.isEmpty()) {
            throw new RuntimeException("Id informado é inválido!");
        }

        return restaurantOptional.get();*/
        return restaurantOptional.orElseThrow( () -> new RuntimeException("Id informado é inválido!") );
        // return restaurantOptional.orElseGet(restaurantOptional::get);
    }

    public RestaurantEntity getByName(String name) {
        Optional<RestaurantEntity> restaurantOptional = this.restaurantList
                .stream()
                .filter(r -> r.getName().equalsIgnoreCase(name))
                .findFirst();

        /*return restaurantOptional.orElseThrow( () ->
                new RuntimeException("Nome informado é inválido!")
        );*/
        return restaurantOptional.orElse(null);
    }

    public List<FoodEntity> getAllFood(Long id) {
        RestaurantEntity restaurant = getById(id);

        return restaurant.getFoodList();
    }

    public void update(Long id, RestaurantEntity restaurantToUpdate) {
        RestaurantEntity restaurant = null;
        Optional<RestaurantEntity> restaurantOptional = this.restaurantList.stream().filter(r -> r.getId() == id).findFirst();

        if (restaurantOptional.isPresent()) {
            restaurant = restaurantOptional.get();
        }
    }

    public void remove(Long id) {
        for ( RestaurantEntity restaurant : restaurantList ) {
            if( restaurant.getId() == id) {
                this.restaurantList.remove(restaurant);
            }
        }
    }
}
