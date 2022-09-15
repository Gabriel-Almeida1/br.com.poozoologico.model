package Zoo;

public class Lion extends Zoo1 {

    String diet;
    String furTrait;

    public Lion(String specie,
                String name,
                boolean canFly,
                boolean canSwim,
                boolean hasTail,
                int legs,
                int numberOfAnimals,
                String diet,
                String furTrait) {
        super(specie, name, canFly, canSwim, hasTail, legs, numberOfAnimals);
        this.diet = diet;
        this.furTrait = furTrait;
    }

    public String getDiet() {
        return diet;
    }

    public void setDiet(String diet) {
        this.diet = diet;
    }

    public String getFurTrait() {
        return furTrait;
    }

    public void setFurTrait(String furTrait) {
        this.furTrait = furTrait;
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
        return "Lion{" +
                "diet='" + diet + '\'' +
                ", furTrait='" + furTrait + '\'' +
                ", name='" + name + '\'' +
                ", canFly=" + canFly +
                ", canSwim=" + canSwim +
                ", hasTail=" + hasTail +
                ", legs=" + legs +
                '}';
    }
}
