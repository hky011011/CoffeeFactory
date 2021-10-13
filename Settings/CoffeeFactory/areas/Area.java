package Settings.CoffeeFactory.areas;

public abstract class Area {

    /*
    * 某个区域的位置
    **/
    protected String location;

    /*
    * 某个区域每年的花费
    **/
    protected double cost;

    protected double area;

    public Area(String location, double cost, double area) {
        this.location = location;
        this.cost = cost;
        this.area = area;
    }

    public Area() {
        this("Default Location", 10000, 100);
    }

    public Area(double cost) {
        this("Default Location", cost, 100);
    }

    @Override
    public abstract String toString();

    public String getLocation() {
        return this.location;
    }

    public double getCost() {
        return this.cost;
    }

    public void setCost(double newCost) {
        this.cost = newCost;
    }

    public double getArea() {
        return this.area;
    }

    public void setArea(double newArea) {
        this.area = newArea;
    }

    public boolean relocate(Person executor, String newLocation) {return true;}

}
