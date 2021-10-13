package Settings.CoffeeFactory.areas.StaffArea;

import areas.Area;
import areas.WorkerIterator.Aggregate;
import areas.WorkerIterator.Iterator;
import areas.WorkerIterator.WorkerListIterator;

import java.util.ArrayList;

public abstract class StaffArea extends Area implements Aggregate {

    /**
     * 区域经理
     **/
    protected Manager manager;

    /**
     * 区域员工列表
     **/
    protected ArrayList<Worker> workerList = null;


    public StaffArea() {
        super();
    }

    /**
     * 指定经理的构造函数
     */
    public StaffArea(String location, double cost, double area, Manager newManager) {
        super(location, cost, area);
        workerList = new ArrayList<Worker>();
        manager = newManager;
        GeneralManager.getInstance().addManager(manager);
    }

    /**
     * 获取本区域的经理
     */
    public Manager getManager() {
        return manager;
    }

    /**
     * 设置本区域的新经理
     */
    public void setManager(Manager newManager) {
        manager = newManager;
    }

    /**
     * 在工人列表中添加一个新员工
     */
    public void addWorker(Worker workerObj) {
        if (!workerList.contains(workerObj)) {
            workerList.add(workerObj);
        } else {
            System.out.println("The worker is in the scene");
        }
    }

    /**
     * 删除该区域的单个员工（如果要删除的员工在该区域）
     */
    public void removeWorker(Worker workerObj) {
        if (workerList.contains(workerObj)) {
            workerList.remove(workerObj);
        } else {
            System.out.println("Worker object doesn't exist.");
        }
    }

    /**
     * 从工厂中查找并删除某个员工
     */
    public void removeWorker(String name) {
        workerList.removeIf(worker -> worker.getName().equals(name));
        System.out.println("Worker object doesn't exist.");
    }

    /**
     * 获取本区域的员工列表
     */
    public ArrayList<Worker> getWorkerList() {
        return workerList;
    }

    /**
     * 展示本区域的所有员工
     */
    public void displayAllStaffs() {
        System.out.printf("%-10s%-20s%-5s%-10s%s%n", "Id", "Name", "Age", "Sex", "Department");
        manager.display();
        for (Worker obj : workerList) {
            obj.display();
        }
    }

    /**
     * 通过id查找和展示员工信息
     */
    public void searchStaffById(String id) {
        if (manager.getId().equals(id)) {
            manager.display();
            return;
        }
        for (Worker obj : workerList) {
            if (obj.getId().equals(id)) {
                obj.display();
                return;
            }
        }
        (new EmptyStaff()).display();
    }

    /**
     * @return 一个复制WorkerList的迭代器
     */
    @Override
    public Iterator getIterator() {
        return new WorkerListIterator(workerList);
    }

    /**
     * Visitor Pattern: accept a utility worker to maintain the scene
     *
     * @param worker the utility worker
     */
    public abstract void accept(UtilityWorker worker);

    @Override
    public String toString() {
        return SceneNameConst.STAFF_AREA;
    }

}
