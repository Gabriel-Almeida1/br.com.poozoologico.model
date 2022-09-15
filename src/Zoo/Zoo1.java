package Zoo;

public class Zoo1 {

    private String specie;
    String name;
    boolean canFly;
    boolean canSwim;
    boolean hasTail;
    int legs;
    private int numberOfAnimals;

    public Zoo1(String specie, String name, boolean canFly, boolean canSwim, boolean hasTail, int legs, int numberOfAnimals) {
        this.specie = specie;
        this.name = name;
        this.canFly = canFly;
        this.canSwim = canSwim;
        this.hasTail = hasTail;
        this.legs = legs;
        this.numberOfAnimals = numberOfAnimals;
    }

    public String getSpecie() {
        return specie;
    }

    public void setSpecie(String specie) {
        this.specie = specie;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    public boolean isCanSwim() {
        return canSwim;
    }

    public void setCanSwim(boolean canSwim) {
        this.canSwim = canSwim;
    }

    public boolean isHasTail() {
        return hasTail;
    }

    public void setHasTail(boolean hasTail) {
        this.hasTail = hasTail;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public int getNumberOfAnimals() {
        return numberOfAnimals;
    }

    public void setNumberOfAnimals(int numberOfAnimals) {
        this.numberOfAnimals = numberOfAnimals;
    }

    @Override
    public String toString() {
        return "Zoo1{" +
                "specie='" + specie + '\'' +
                ", name='" + name + '\'' +
                ", canFly=" + canFly +
                ", canSwim=" + canSwim +
                ", hasTail=" + hasTail +
                ", legs=" + legs +
                ", numberOfAnimals=" + numberOfAnimals +
                '}';
    }
}
