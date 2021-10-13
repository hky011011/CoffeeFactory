package Settings.CoffeeFactory.areas.ManufacturingArea.Warehouse.Delegate;

//展示层
public class WarehouseShow {
    WarehouseDelegate warehouseDelegate;

    public WarehouseShow(WarehouseDelegate warehouseDelegate) {
        this.warehouseDelegate = warehouseDelegate;
        showServiceList();
    }

    //通过调用此方法，将应用仓库的服务
    public void doTask(Material Material) {
        warehouseDelegate.doTask(Material);
    }

    public static void showServiceList() {
        System.out.println("");
        System.out.println("----Warehouse Service List----");
        System.out.println("**  1. pickup               **");
        System.out.println("**  2. storage              **");
        System.out.println("");
    }
}
