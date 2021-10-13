package Settings.CoffeeFactory.product.production;

import Settings.CoffeeFactory.product.Product;

public class Producing extends ProductionStage{
    @Override
    public void nextState(Product product) {
        product.setStage(new Produced());
        System.out.println("The product is being produced.");
    }

    @Override
    public String toString() {
        return "Producing";
    }
}
