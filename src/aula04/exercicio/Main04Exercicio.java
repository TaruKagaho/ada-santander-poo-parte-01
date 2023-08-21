package aula04.exercicio;

import aula04.exercicio.controllers.MenuController;
import aula04.exercicio.models.FoodEntity;
import aula04.exercicio.models.RestaurantEntity;

import java.util.ArrayList;
import java.util.List;

public class Main04Exercicio {
    public static void main(String[] args) {
        System.out.println("=========== SISTEMA DE RESTAURANTES ==========");

        /*RestaurantEntity restaurant01 = new RestaurantEntity(
                "Restaurante 01",
                "Avenida 01"
        );
        List<FoodEntity> restaurantFoodList = new ArrayList<>();
        FoodEntity food01 = new FoodEntity(
                "Feijada",
                13.90,
                "Feijão com carne seca, costela de porco defumada, couve e laranja."
        );
        FoodEntity food02 = new FoodEntity(
                "Macarronada",
                23.90,
                "Macarrão ao molho pesto com carne ao molho mandeira."
        );

        restaurantFoodList.add(food01);
        restaurantFoodList.add(food02);
        restaurant01.setFoodList(restaurantFoodList);

        System.out.println(food01);
        System.out.println(food02);
        System.out.println(restaurant01);*/

        MenuController menu = new MenuController();

        menu.exibirMenu();
    }
}