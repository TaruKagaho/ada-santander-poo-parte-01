package aula04.exercicio.models;

public class OrderEntity {
    private static long countOrder = 0;
    private long id;
    private long clientId;
    private long restaurantId;
    // private String clientAddress;
    // private List<FoodEntity> foodChoosedList;
    private long foodId;

    public OrderEntity(
            long clientId,
            long restaurantId,
            // String clientAddress,
            // List<FoodEntity> foodChoosedList
            long foodId
    ) {
        this.id = ++countOrder;
        this.clientId = clientId;
        this.restaurantId = restaurantId;
        // this.clientAddress = clientAddress;
        // this.foodChoosedList = foodChoosedList;
        this.foodId = foodId;
    }

    public long getId() {
        return id;
    }

    public long getClientId() {
        return clientId;
    }

    public void setClientId(long clientId) {
        this.clientId = clientId;
    }

    public long getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(long restaurantId) {
        this.restaurantId = restaurantId;
    }

    /*public String getClientAddress() {
        return clientAddress;
    }

    public void setClientAddress(String clientAddress) {
        this.clientAddress = clientAddress;
    }*/

    public long getFoodId() {
        return foodId;
    }

    public void setFoodId(long foodId) {
        this.foodId = foodId;
    }

    @Override
    public String toString() {
        return // "OrderEntity { " +
                "\n{ id = " + id +
                ", clientId = " + clientId +
                ", restaurantId = " + restaurantId +
                ", foodId = " + foodId +
                " }";
    }
}
