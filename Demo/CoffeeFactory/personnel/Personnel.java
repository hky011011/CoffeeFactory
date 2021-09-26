package Demo.CoffeeFactory.personnel;

import Demo.CoffeeFactory.areas.Area;

public abstract class Personnel {

    private String identity;
    private String name;
    private int age;

    private enum Gender {male, female};
    private Gender gender;

    private float asset;//???
    private Area area;

    public Personnel(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName(){return this.name;}
    public int getAge(){return this.age;}

    public abstract String toString();
    public abstract void transfer(Area dest);


}
