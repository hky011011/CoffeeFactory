package Demo.CoffeeFactory.product.production;

import Demo.CoffeeFactory.product.Product;

public abstract class ProductionStage {
    public abstract void nextState(Product product);
}
