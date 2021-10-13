package Settings.CoffeeFactory.areas.ManufacturingArea.Workshop;

import areas.ManufacturingArea.ManufacturingArea;

//产品生产车间
public abstract class Workshop extends ManufacturingArea {
    public ProductMachine productMachine;

    public Workshop() {
    }

    //返回区域名字
    @Override
    public abstract String toString();

    //Visitor:接受公用事业工人维护现场
    @Override
    public void accept(UtilityWorker worker) {
        worker.visit(this);
    }

    //生产coffee
    public abstract void produceCoffee();


}
