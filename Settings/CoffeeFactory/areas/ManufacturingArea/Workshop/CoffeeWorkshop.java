package Settings.CoffeeFactory.areas.ManufacturingArea.Workshop;

import areas.AreaName;

//这个车间生产coffee
public class CoffeeWorkshop extends Workshop{
    public CoffeeWorkshop() {

    }

    //生产coffee
    @Override
    public void produceCoffee() {}

    //返回区域名字
    @Override
    public String toString() {
        return AreaName.WORKSHOP;
    }
}
