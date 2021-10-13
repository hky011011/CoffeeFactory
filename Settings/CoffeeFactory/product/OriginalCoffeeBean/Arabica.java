package Settings.CoffeeFactory.product.OriginalCoffeeBean;

public class Arabica extends Coffee{
    public Arabica(){super(null,0,0,0.0);}
    public AlmondCoffee(String name, int shelfLife, int weight, double content, CoffeeBeverage beverage) {
        super(name, shelfLife, weight, content, beverage);
    }

    @Override
    public void dispaly() {
        System.out.println("This is Arabica coffee!");
    }

    @Override
    public String getBeverageName(){return null;}

    @Override
    protected void initIngredientList(){};

}
