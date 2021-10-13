package Settings.CoffeeFactory.areas.StaffArea;

import areas.AreaName;

public class Office extends StaffArea {


    public Office() {
        this("Default Office", 100, 100);
    }

    /**
     * 没指定经理的构造函数
     */
    public Office(String location, double cost, double area) {
        super(location, cost, area, Manager.getOfficeManager());
        Manager.getOfficeManager().addDepartment(this);
        GeneralManager.getInstance().addManager(Manager.getOfficeManager());
    }

    /**
     * Visitor Pattern: accept a utility worker to maintenance the scene
     *
     * @param worker the utility worker
     */
    @Override
    public void accept(UtilityWorker worker) {
        worker.visit(this);
    }

    /**
     * @return 区域名字字符串
     */
    @Override
    public String toString() {
        return AreaName.OFFICE;
    }
}
