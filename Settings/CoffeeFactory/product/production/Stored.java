package Settings.CoffeeFactory.product.production;

import Settings.CoffeeFactory.product.Product;
public class Stored extends ProductionStage{
    @Override
    public void nextState(Product product) {
        System.out.println("The product is stored.");
    }

    @Override
    public String toString() {
        return "Stored";
    }
}
