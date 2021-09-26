package Demo.CoffeeFactory.machine;

import Demo.CoffeeFactory.product.Product;

public abstract class Machine {
    private String usage;
    private String ID;
    private int age = 0;
    private int lifespan = 0;
    private float maxCapacity = 0;
    private boolean isFunctional = false;

    protected abstract int work(Product product);

}
