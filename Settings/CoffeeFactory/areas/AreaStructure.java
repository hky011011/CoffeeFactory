package Settings.CoffeeFactory.areas;

import java.util.ArrayList;
import java.util.List;

public class AreaStructure {
    /**
     * all areas in the factory
     */
    private List<Area> areas;

    /**
     * constructor of the class AreaStructure
     */
    public AreaStructure() {
        areas = new ArrayList<Area>();
    }

    /**
     * Add a area to the collection list
     *
     * @param s new area object
     */
    public void addArea(Area s) {
        areas.add(s);
    }

    /**
     * worker maintains all areas in the list
     *
     * @param worker the worker to maintain the area
     */
    public void accept(UtilityWorker worker) {
        for (Object obj : areas) {
            ((Area) obj).accept(worker);
        }
    }

    /**
     * get a area object from the scene list by its name
     *
     * @param name name of the area to be found
     * @return object of the area found (return null if not found)
     */
    public Area getAreaByName(String name) {
        for (Area item : areas) {
            if (item.toString().equals(name)) {
                return item;
            }
        }
        return null;
    }

}
