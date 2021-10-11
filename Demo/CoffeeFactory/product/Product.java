package Demo.CoffeeFactory.product;

import Demo.CoffeeFactory.product.production.ProductionStage;

import java.util.ArrayList;

public abstract class Product {
    private String productName;
    private String productionDate;
    private int shelfLife;
    private float weight;
    public ProcessMachine produceMachine, wrapperMachine;
    protected ProductionStage stage;
    protected PackageMaterial pack;
    public ArrayList<RawMaterial> ingredientList;
    protected abstract void initIngredientList();

    public Product(String name, int shelfLife, int weight) {
        this.productName = name;
        this.shelfLife = shelfLife;
        this.productionDate = null;
        this.stage = new ProductionStage();
        this.weight = weight;
        this.ingredientList = new ArrayList<RawMaterial>();
        this.produceMachine = new BasicProductMachine("PR", "220");
        this.wrapperMachine = new WrapperMachine("PA", "118", 40, 1, 500);
    }

    protected void setName(String name) {
        this.productName = name;
    }



}
