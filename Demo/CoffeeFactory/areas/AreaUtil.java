package Demo.CoffeeFactory.areas;

import java.util.ArrayList;
import java.util.List;

public class AreaUtil {
    private List<Area> areas;

    public AreaUtil(){this.areas = new ArrayList<Area>();}
    public void addArea(Area area){areas.add(area);}
}
