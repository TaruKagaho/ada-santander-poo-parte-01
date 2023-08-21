package aula04.exercicio.controllers;

import aula04.exercicio.models.FoodEntity;
import aula04.exercicio.services.FoodsService;

import java.util.List;

import static aula04.exercicio.utils.InputHandler.*;

public class FoodsController {
    private final FoodsService foodsService;

    public FoodsController() {
        this.foodsService = new FoodsService();
    }

    public void addNewFoodView(Long restaurantId) {
        String name = getStringNextLine("Digite o nome do prato: ");

        List<FoodEntity> foodsInRestaurant = getAllFoodInRestaurant(restaurantId);
        FoodEntity foodFound = null;

        for ( FoodEntity food : foodsInRestaurant ) {
            if (food.getName().equalsIgnoreCase(name)) {
                foodFound = food;
            }
        }

        if (foodFound == null) {
            System.out.println("Prato já cadastrado!");

            return;
        }

        // double price = getDouble("Digite o preço do prato: ");
        double price = Double.parseDouble(getStringNextLine("Digite o preço do prato: "));
        String description = getStringNextLine("Digite a descrição do prato: ");

        FoodEntity newFood = new FoodEntity(name, price, description, restaurantId);

        this.foodsService.addFood(newFood);

        // getStringNextLine("Prato adicionado com sucesso! \n");
        System.out.println("\nPrato adicionado com sucesso!");
    }
    public void addNewFood(FoodEntity newFood) {
        this.foodsService.addFood(newFood);
    }

    public List<FoodEntity> getAllFood() {
        return this.foodsService.getAllFood();
    }

    public List<FoodEntity> getAllFoodInRestaurantView(Long id) {
        List<FoodEntity> listOfFoodsAtRestaurant = this.foodsService.getAllFoodByRestaurantId(id);

        if (listOfFoodsAtRestaurant.isEmpty()) {
            System.out.println("A lista de pratos do referido restaurante está vazia!");
        }

        System.out.println("Lista de pratos do restaurente " + id);

        for ( FoodEntity food : listOfFoodsAtRestaurant ) {
            System.out.println(food);
        }

        return listOfFoodsAtRestaurant;
    }
    public List<FoodEntity> getAllFoodInRestaurant(Long id) {
        return this.foodsService.getAllFoodByRestaurantId(id);
    }

    public FoodEntity getFoodByNameAndRestaurantIdView(long restaurantId) {
        List<FoodEntity> listOfFoodsAtRestaurant = this.getAllFoodInRestaurantView(restaurantId);
        FoodEntity foodChoosed = null;

        String foodName = getStringNextLine("Digite o nome do prato escolhido:");

        for ( FoodEntity food : listOfFoodsAtRestaurant ) {
            if (food.getName().equalsIgnoreCase(foodName)) {
                foodChoosed = food;
            }
        }
        // this.foodsService.getFoodByName(foodName);

        return foodChoosed;
    }
    public void getFoodByNameAndRestaurantId(long restaurantId, String foodName) {}
}
