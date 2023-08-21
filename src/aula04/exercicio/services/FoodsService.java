package aula04.exercicio.services;

import aula04.exercicio.models.FoodEntity;
import aula04.exercicio.repositories.FoodsRepository;

import java.util.ArrayList;
import java.util.List;

public class FoodsService {
    private static FoodsRepository foodsRepository;

    public FoodsService() {
        foodsRepository = new FoodsRepository();
    }

    public void addFood(FoodEntity newFood) {
        foodsRepository.add(newFood);
    }

    public List<FoodEntity> getAllFoodByRestaurantId(Long restaurantId) {
        List<FoodEntity> foodList = foodsRepository.getFoodList();
        List<FoodEntity> restaurantFoodList = new ArrayList<>();

        for ( FoodEntity food : foodList ) {
            if (food.getRestaurantId() == restaurantId) {
                restaurantFoodList.add(food);
            }
        }

        return restaurantFoodList;
    }

    public List<FoodEntity> getAllFood() {
        return foodsRepository.getFoodList();
    }

    /*public long getFoodByName(String foodName) {
    }*/
}
