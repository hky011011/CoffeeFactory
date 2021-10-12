package Demo.CoffeeFactory.product.production;

import Demo.CoffeeFactory.product.Product;
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
