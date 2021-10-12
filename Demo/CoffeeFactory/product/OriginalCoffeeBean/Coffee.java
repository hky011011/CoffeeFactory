package Demo.CoffeeFactory.product.OriginalCoffeeBean;

import Demo.CoffeeFactory.product.Product;

public abstract class Coffee extends Product {
    public double content;
    protected CoffeeBeverage beverage;

    protected Coffee(String name, int shelfLife, int weight, double content, CoffeeBeverage beverage) {
        super(name, shelfLife, weight);
        this.content = content;
        this.beverage = beverage;
    }

    protected Coffee(String name, int shelfLife, int weight, double content) {
        super(name, shelfLife, weight);
        this.content = content;
        this.beverage = new Americano();
    }


    /**
     * this method to show class is some Chocolate , To subclass implementation
     */
    public abstract void dispaly();

    /**
     * return the coffee's name with the sandwich it contains
     * @return
     */
    public abstract String getNameWithSandwich();
}



}
