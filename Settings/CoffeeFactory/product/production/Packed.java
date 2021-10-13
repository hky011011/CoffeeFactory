package Settings.CoffeeFactory.product.production;

import Settings.CoffeeFactory.product.Product;

public class Packed extends ProductionStage {
    @Override
    public void nextState(Product product) {
        if(product.getStage() instanceof Packed){
            product.setStage(new Stored());
            System.out.println("The produce is packed.");
        }
        else{
            System.out.println("The product CAN NOT be stored since it's not packed.");
        }
    }

    @Override
    public String toString() {return "Packed";}
}
