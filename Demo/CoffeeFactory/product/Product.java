package Demo.CoffeeFactory.product;

import Demo.CoffeeFactory.product.production.ProductionStage;

public abstract class Product {
    private String productName;
    private String productionDate;
    private int shelfLife;
    private float weight;

    protected abstract void initIngredientList();



}
