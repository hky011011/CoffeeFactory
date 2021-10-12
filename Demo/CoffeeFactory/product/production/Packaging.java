package Demo.CoffeeFactory.product.production;

import Demo.CoffeeFactory.product.Product;

public class Packaging extends ProductionStage {
    @Override
    public void nextState(Product product) {
        product.setStage(new Packed());
        System.out.println("The product is being packaged.");
    }

    @Override
    public String toString() {
        return "Packaging";
    }
}
