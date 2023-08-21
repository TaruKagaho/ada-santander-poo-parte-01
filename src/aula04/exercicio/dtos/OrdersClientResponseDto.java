package aula04.exercicio.dtos;

public class OrdersClientResponseDto {
    // private String clientName;
    private String restaurantName;
    private String foodName;

    public OrdersClientResponseDto(
            // String clientName,
            String restaurantName,
            String foodName
    ) {
        // this.clientName = clientName;
        this.restaurantName = restaurantName;
        this.foodName = foodName;
    }

    /*public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }*/

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    @Override
    public String toString() {
        return // "OrdersResponseDto { " +
                // "{ clientName = '" + clientName + '\'' +
                // ", restaurantName = '" + restaurantName + '\'' +
                "{ restaurantName = '" + restaurantName + '\'' +
                ", foodName = '" + foodName + '\'' +
                " }";
    }
}
