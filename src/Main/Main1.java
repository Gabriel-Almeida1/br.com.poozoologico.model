package Main;

import Zoo.Environment1;
import Zoo.HyacinthMacaw;
import Zoo.Lion;
import Zoo.Swordfish;

public class Main1 {

    public static void main(String[] args) {

        Environment1 enviroment = new Environment1(3);

        Lion lion = new Lion(
                "Panthera leo",
                "Simba",
                false,
                true,
                true,
                4,
                1,
                "carnivore",
                "Neck hair");

        HyacinthMacaw macaw = new HyacinthMacaw(
                "Anodorhynchus hyacinthinus",
                "Blue",
                true,
                false,
                true,
                2,
                1,
                "Blue color and long feathers",
                "It uses its peak");

        Swordfish swordfish = new Swordfish(
                "Xiphias gladius",
                "Zack",
                false,
                true,
                true,
                0,
                1,
                "Long peak that looks like a sword",
                "Long fin on the top");

        enviroment.setAnimalList(0, lion);
        enviroment.setAnimalList(1, macaw);
        enviroment.setAnimalList(2, swordfish);

        System.out.println(enviroment);

    }
}
