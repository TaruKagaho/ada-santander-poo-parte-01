package aula04.exercicio.models;

public class FoodEntity {
    private static long countFood = 0;
    private long id;
    private String name;
    private double price;
    private String description;
    private long restaurantId;

    public FoodEntity(
            String name,
            double price,
            String description,
            Long restaurantId
    ) {
        this.id = ++countFood;
        // ++count;
        this.name = name;
        this.price = price;
        this.description = description;
        this.restaurantId = restaurantId;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(long restaurantId) {
        this.restaurantId = restaurantId;
    }

    @Override
    public String toString() {
        return // "Food { " +
                // "count=" + count +
                "\n{ id = " + id +
                ", name = '" + name + '\'' +
                ", price = " + price +
                ", description = '" + description + '\'' +
                ", restaurantId = " + restaurantId +
                " }";
    }
}
