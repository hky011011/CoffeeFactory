package Settings.CoffeeFactory.product.OriginalCoffeeBean;

import Settings.CoffeeFactory.product.Product;

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

    public abstract void dispaly();

    public abstract String getBeverageName();
}



}
