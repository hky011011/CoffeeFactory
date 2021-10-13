package Settings.CoffeeFactory.material;

public abstract class Material {

    private float inventory;

    public Material(float inventory){this.inventory = inventory;}
    public Material(){this(0.00f);}

    public float getInventory(){return this.inventory;}
    public void setInventory(float inventory){this.inventory = inventory;}

    public void addInventory(float increment){this.inventory += increment;}

    public abstract float inventoryConsumption();

}
