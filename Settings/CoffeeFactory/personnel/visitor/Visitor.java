package Settings.CoffeeFactory.personnel.visitor;

import Settings.CoffeeFactory.areas.Area;
import Settings.CoffeeFactory.personnel.Personnel;

public class Visitor extends Personnel {


    public String identity = "Visitor";

    public boolean is_permitted = false;
    public int visitCode;//maybe string

    private Context visitLimit;


    public Visitor(String name, int age, Personnel.Gender gender, String Phone_num) {


        super(name, age, gender, Phone_num);
        String[] persons = {this.identity};
        String[] publicAreas = {"publicArea", "experienceRoom", "exhibitionRoom"};
        this.visitLimit = new Context(persons, publicAreas);
    }


    public Visitor(String name, int age, Personnel.Gender gender, String Phone_num, int visitCode) {


        super(name, age, gender, Phone_num);
        String[] persons = {this.identity};
        String[] publicAreas = {"publicArea", "experienceRoom", "exhibitionRoom"};
        this.visitLimit = new Context(persons, publicAreas);
        this.visitCode = visitCode;
    }

    public void get_visit_permission() {
        //获取进入权限
        //可使用visitor实现

    }

    /**
     * visit a public area
     * However, a visitor can only be allowed to visit some place when it is not full.
     *
     * @param dest destination
     */
    public boolean visit(PublicArea dest) {
        if (!dest.isFull()) {
            System.out.println("Visitor " + this.name + "visits" + dest.toString());
            this.Goto(dest);
            return true;
        } else {
            System.out.println("Sorry, the" + dest.toString() + "is already full.");
            return false;
        }
    }

    public boolean canEnter(String dest) {
        String move = this.identity + " enter " + dest;
        if (this.visitLimit.canEnter(move)) {
            System.out.println(this.name + " can enter" + dest);
            return true;
        } else {
            System.out.println("Sorry! " + this.name + " cannot enter " + dest);
            return false;
        }
    }


    public void transfer(Area dest) {
        if (this.canEnter(dest.toString())) {
            this.location = dest;
            System.out.println(this.identity + " " + this.name + " moves to " + dest.toString());
        } else {
            System.out.println("Sorry, " + this.identity + " " + this.name + "can 't go to" + dest.toString());
        }
    }

    @Override
    public void Goto(Area dest) {

        if (this.canEnter(dest.toString())) {
            this.location = dest;
            System.out.println(this.identity + " " + this.name + " moves to " + dest.toString());
        } else {
            System.out.println("Sorry, " + this.identity + " " + this.name + "can 't go to" + dest.toString());
        }
    }

    public int getVisitCode() {
        return visitCode;
    }

    public void Show_all_accessible_areas() {
        //待实现
        //for loop
        //System.out.print(this.visitLimit.canEnter(uniarea));
    }

    /**
     * set the initial asset of the visitor;
     */
    @Override
    protected void setInitialAsset() {
        this.asset = 1000;
    }

    @Override
    public String toString() {
        return "class Visitor extends Person";
    }
}
