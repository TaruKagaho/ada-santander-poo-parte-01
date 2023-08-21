package aula04.exercicio.models;

import java.util.ArrayList;
import java.util.List;

public class RestaurantEntity {
    private static long countRestaurant = 0;
    private long id;
    private String name;
    private String address;
    private List<FoodEntity> foodList;
    private List<OrderEntity> orderList;

    public RestaurantEntity(
            String name,
            String address// ,
            // List<FoodEntity> foodList
    ) {
        // ++id;
        this.id = ++countRestaurant;
        this.name = name;
        this.address = address;
        // this.foodList = foodList;
        this.foodList = new ArrayList<>();
        this.orderList = new ArrayList<>();
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<FoodEntity> getFoodList() {
        return foodList;
    }

    public void setFoodList(List<FoodEntity> foodList) {
        this.foodList = foodList;
    }

    public List<OrderEntity> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<OrderEntity> orderList) {
        this.orderList = orderList;
    }

    @Override
    public String toString() {
        return // "Restaurant { " +
                "{ id = " + id +
                ", \nname= '" + name + '\'' +
                ", \naddress = '" + address + '\'' +
                ", \nfoodList = " + foodList +
                ", \norderList = " + orderList +
                " }\n";
    }
}
