package Settings.CoffeeFactory.areas.PublicArea;

import areas.AreaName;

public class ExperienceRoom extends PublicArea {

    private HandmadeTool tool = HandmadeToolFactory.getHandMadeTool();

    /**
     * number of this exp-room
     **/
    private int expRoomNumber;

    /**
     * constructor of ExperienceRoom
     */
    public ExperienceRoom(String location, double cost, double area, int maxNumber) {
        super(location, cost, area, maxNumber);
    }

    public ExperienceRoom() {
        super();
    }

    /**
     * @return the tool
     */
    public HandmadeTool getTool() {
        return tool;
    }

    /**
     * Get description of tool in this room.
     *
     * @return description
     */
    public String getToolDescription() {
        return tool.getDescription();
    }

    /**
     * Set description of tool in this room. This is a part of COW pattern.
     *
     * @return description
     */
    public void setToolDescription(String description) {
        if (tool.getRefCount() > 1 || tool == HandmadeToolFactory.getDefaultHandmadeTool()) {
            tool.deref();
            tool = new HandmadeTool(tool);
        }
        tool.setDescription(description);
    }

    public int getExpRoomNumber() {
        return expRoomNumber;
    }

    public void setExpRoomNumber(int number) {
        expRoomNumber = number;
    }

    @Override
    public String toString() {
        return AreaName.COFFEE_EXPERIENCE_ROOM;
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
