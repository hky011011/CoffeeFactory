package Settings.CoffeeFactory.areas.ManufacturingArea.Warehouse;

import areas.AreaName;
import areas.ManufacturingArea.ManufacturingArea;

import java.util.HashMap;

//存放原料和产品的仓库
public class Warehouse extends ManufacturingArea{
    protected HashMap<String, Double> materialAmount;
    protected HashMap<String, Integer> productionAmount;

    public Warehouse() {
    }

    //返回区域的名字
    @Override
    public String toString() {
        return AreaName.WAREHOUSE;
    }

    //当其他类需要使用材料时，将调用该方法来修改材料的数量
    public void useMaterial(String type, Double amount) {}

    //增加材料的数量
    public void addMaterial(String type, Double amount) {}

    //在仓库里增加一种新的材料
    public void createMaterialKind(String kind) {}

    //删除仓库中的一种材料
    public void deleteMaterialKind(String kind) {}

    //得到每种材料的数量
    public HashMap<String, Double> getMaterialList() {
        return new HashMap<String, Double>(materialAmount);
    }

    //Visitor:接受公用事业工人维护区域
//    @Override
//    public void accept(UtilityWorker worker) {
//        worker.visit(this);
//    }
}
