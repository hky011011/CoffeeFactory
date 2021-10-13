package Settings.CoffeeFactory.areas.PublicArea;

import areas.AreaName;

import java.util.ArrayList;

public class ExhibitionRoom extends PublicArea {


    /**
     * number of this exh-room
     *
     * @modified by Ray
     **/
    private int exhRoomNumber;

    /**
     * List of all exhibits
     **/
    protected ArrayList<String> exhibitList;

    public ExhibitionRoom(String location, double cost, double area, int maxNumber) {
        super(location, cost, area, maxNumber);
        exhibitList = new ArrayList<String>();
    }

    /**
     * @return name of the scene as a String
     */
    @Override
    public String toString() {
        return AreaName.EXHIBITION_AREA;
    }

    /**
     * tourists visit the exhibition room, print all exhibits in the room
     */
    public void visitExhibitionRoom() {
        if (exhibitList.size() > 0) {
            System.out.println("There are exhibits below in the room：");
        } else {
            System.out.println("There are no exhibits in the room.");
            return;
        }
        for (String item : exhibitList) {
            System.out.print(item);
            if (exhibitList.indexOf(item) < exhibitList.size() - 1) {
                System.out.print("、");
            } else {
                System.out.println(".");
            }
        }
    }

    public void addExhibits(String exhibitName) {
        if (exhibitList.contains(exhibitName)) {
            System.out.println("Exhibits are already in the room.");
        } else {
            exhibitList.add(exhibitName);
        }
    }

    public void removeExhibits(String exhibitName) {
        if (exhibitList.contains(exhibitName)) {
            exhibitList.remove(exhibitName);
        } else {
            System.out.println("Exhibits are not in the room.");
        }
    }

    public int getExhRoomNumber() {
        return exhRoomNumber;
    }

    public void setExhRoomNumber(int number) {
        exhRoomNumber = number;
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

}
