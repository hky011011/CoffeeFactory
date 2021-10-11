package Demo.CoffeeFactory.product;


import Demo.CoffeeFactory.product.production.ProductionStage;

/**
 * @param <String>
 */
public abstract class Product<String> {
    private String productName;
    private String productionDate;
    private int shelfLife;
    private float weight;

    protected abstract void initIngredientList();



}
