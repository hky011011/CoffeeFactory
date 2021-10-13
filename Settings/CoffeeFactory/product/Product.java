package Settings.CoffeeFactory.product;

import Settings.CoffeeFactory.product.production.Packed;
import Settings.CoffeeFactory.product.production.Producing;
import Settings.CoffeeFactory.product.production.ProductionStage;

import java.util.ArrayList;

public abstract class Product {
    private String productName;
    private String productionDate;
    private int shelfLife;
    private int weight;
    public ProcessMachine produceMachine, wrapperMachine;
    protected ProductionStage stage;
    protected PackageMaterial pack;
    public ArrayList<RawMaterial> ingredientList;
    protected abstract void initIngredientList();

    public Product(String name, int shelfLife, int weight) {
        this.productName = name;
        this.shelfLife = shelfLife;
        this.productionDate = null;
        this.stage = new Producing();
        this.weight = weight;
        this.ingredientList = new ArrayList<RawMaterial>();
        this.produceMachine = new BasicProductMachine("PR", "220");
        this.wrapperMachine = new WrapperMachine("PA", "118", 40, 1, 500);
    }

    protected void setProductNameName(String name) {
        this.productName = name;
    }
    public String getProductName() {
        return this.productName;
    }

    public ProductionStage getStage() {
        return stage;
    }
    public void setStage(ProductionStage stage) {
        this.stage = stage;
    }
    public void nextStage() {
        stage.nextState(this);
    }

    public void setProductionDate(String date) {
        if (this.productionDate == null) {
            this.productionDate = date;
        }
        else {
            System.out.println("Warning! The production date CAN NOT be modified!");
        }
    }
    public String getProductionDate() {
        return this.productionDate;
    }

    protected void setShelfLife(int shelfLife) {
        this.shelfLife = shelfLife;
    }
    public int getShelfLife() {
        return this.shelfLife;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    public int getWeight() {
        return this.weight;
    }

    public void setPackage(PackageMaterial pack) {this.pack = pack;}

    public void setWrapperMachine(ProcessMachine wrapperMachine) {
        this.wrapperMachine = wrapperMachine;
    }
    public void setProduceMachine(ProcessMachine produceMachine) {
        this.produceMachine = produceMachine;
    }

    public void produce() {
        this.produceMachine.process(this, 1);
    }
    public void pack() {
        this.wrapperMachine.process(this, 1);
    }
    public void store() {
        if (!(this.stage instanceof Packed)) {
            System.out.println("The product has not been packaged!");
            return;
        }
        System.out.println("Transporting " + getProductName() + " to the warehouse.");
        this.nextStage();
    }











}
