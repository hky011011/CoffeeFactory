package Settings.CoffeeFactory.product.production;

import Settings.CoffeeFactory.product.Product;

public class Produced extends ProductionStage{
    @Override
    public void nextState(Product product) {
        product.setStage(new Packaging());
        System.out.println("The product has been produced.");
    }

    @Override
    public String toString() {
        return "Produced";
    }
}
