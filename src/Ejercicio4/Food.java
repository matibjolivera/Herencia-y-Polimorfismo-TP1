package Ejercicio4;

/**
 * The type Food.
 */
public class Food {

    private FoodType foodType;
    private int stock;

    /**
     * Instantiates a new Food.
     *
     * @param foodType the food type
     * @param stock    the stock
     */
    public Food(FoodType foodType, int stock) {
        this.foodType = foodType;
        this.stock = stock;
    }

    /**
     * Gets food type.
     *
     * @return the food type
     */
    public FoodType getFoodType() {
        return foodType;
    }

    /**
     * Sets food type.
     *
     * @param foodType the food type
     */
    public void setFoodType(FoodType foodType) {
        this.foodType = foodType;
    }

    /**
     * Gets stock.
     *
     * @return the stock
     */
    public int getStock() {
        return stock;
    }

    /**
     * Sets stock.
     *
     * @param stock the stock
     */
    public void setStock(int stock) {
        this.stock = stock;
    }
}
