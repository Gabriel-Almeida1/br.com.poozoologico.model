package Zoo;

public class Swordfish extends Zoo1 {

    String biggestrTrait;
    String finTrait;

    public Swordfish(String specie,
                     String name,
                     boolean canFly,
                     boolean canSwim,
                     boolean hasTail,
                     int legs,
                     int numberOfAnimals,
                     String biggestrTrait,
                     String finTrait) {
        super(specie, name, canFly, canSwim, hasTail, legs, numberOfAnimals);
        this.biggestrTrait = biggestrTrait;
        this.finTrait = finTrait;
    }

    public String getBiggestrTrait() {
        return biggestrTrait;
    }

    public void setBiggestrTrait(String biggestrTrait) {
        this.biggestrTrait = biggestrTrait;
    }

    public String getFinTrait() {
        return finTrait;
    }

    public void setFinTrait(String finTrait) {
        this.finTrait = finTrait;
    }

    @Override
    public String getSpecie() {
        return super.getSpecie();
    }

    @Override
    public void setSpecie(String specie) {
        super.setSpecie(specie);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public boolean isCanFly() {
        return super.isCanFly();
    }

    @Override
    public void setCanFly(boolean canFly) {
        super.setCanFly(canFly);
    }

    @Override
    public boolean isCanSwim() {
        return super.isCanSwim();
    }

    @Override
    public void setCanSwim(boolean canSwim) {
        super.setCanSwim(canSwim);
    }

    @Override
    public boolean isHasTail() {
        return super.isHasTail();
    }

    @Override
    public void setHasTail(boolean hasTail) {
        super.setHasTail(hasTail);
    }

    @Override
    public int getLegs() {
        return super.getLegs();
    }

    @Override
    public void setLegs(int legs) {
        super.setLegs(legs);
    }

    @Override
    public int getNumberOfAnimals() {
        return super.getNumberOfAnimals();
    }

    @Override
    public void setNumberOfAnimals(int numberOfAnimals) {
        super.setNumberOfAnimals(numberOfAnimals);
    }

    @Override
    public String toString() {
        return "Swordfish{" +
                "biggestrTrait='" + biggestrTrait + '\'' +
                ", finTrait='" + finTrait + '\'' +
                ", name='" + name + '\'' +
                ", canFly=" + canFly +
                ", canSwim=" + canSwim +
                ", hasTail=" + hasTail +
                ", legs=" + legs +
                '}';
    }
}
