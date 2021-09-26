package Demo.CoffeeFactory.areas;

public abstract class Area {

    private String location;
    private float maintenanceCost;
    private float area;

    public Area(String location, float maintenanceCost, float area){
        this.location = location;
        this.maintenanceCost = maintenanceCost;
        this.area = area;
    }

    public Area(){this("Default", 0.00f, 0.00f);}

    @Override
    public abstract String toString();

    public void setArea(float area){this.area = area;}
    public void setMaintenanceCost(float maintenanceCost){this.maintenanceCost = maintenanceCost;}
    public void setLocation(String location){this.location = location;}

    public float getArea(){return this.area;}
    public float getMaintenanceCost(){return this.maintenanceCost;}
    public String getLocation(){return this.location;}


}
