package aula04.exercicio.repositories;

import aula04.exercicio.models.FoodEntity;

import java.util.ArrayList;
import java.util.List;

public class FoodsRepository {
    private final List<FoodEntity> foodList;

    public FoodsRepository() {
        this.foodList = new ArrayList<>();
    }


    public void add(FoodEntity newFood) {
        this.foodList.add(newFood);
    }

    public List<FoodEntity> getFoodList() {
        // System.out.println(foodList);
        return foodList;
    }
}
