package Settings.CoffeeFactory.product.production;

import Settings.CoffeeFactory.product.Product;

public abstract class ProductionStage {
    public abstract void nextState(Product product);
}
