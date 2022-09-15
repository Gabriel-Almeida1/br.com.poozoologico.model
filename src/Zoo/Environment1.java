package Zoo;

import java.util.Arrays;

public class Environment1 {

    Zoo1[] animalList;  // mudar as classes

    public Environment1(int animalsCapacity) {
        animalList = new Zoo1[animalsCapacity];  // por que utilizou o Zoo1 pra criar a lista

    }

    public void getAnimalsList() {
        for (int i = 0; i < this.animalList.length; i++) {
            System.out.println(animalList[i]);
        }
    }

    public void setAnimalList(int position, Zoo1 zoo1) {
        this.animalList[position] = zoo1;
    }

    @Override
    public String toString() {
        return "Environment1{" +
                "animalList=" + Arrays.toString(animalList) +
                "}";
    }
}
