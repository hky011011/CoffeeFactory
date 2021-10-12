package Demo.CoffeeFactory.product.production;

import Demo.CoffeeFactory.product.*;
public class Producing extends ProductionStage{
    @Override
    public void nextState(Product product) {
        product.setStage(new ProducedState());
        System.out.println("From Production State to Produced State, awaiting packaging.");
    }

    @Override
    public String toString() {
        return "Production state";
    }
}
