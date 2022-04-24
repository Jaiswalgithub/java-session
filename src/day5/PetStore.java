package day5;

public class PetStore {
    public static void main(String args[]) {

        Cat thor = new Cat();
        Cat rambo = new Cat();

        thor.name = "Thor";
        thor.age = 2;
        thor.color = "Black";
        thor.breed = "A";

        rambo.name = "Rambo";
        rambo.age = 3;
        rambo.color = "Grey";
        rambo.breed = "B";

        thor.sleep();
        rambo.play();

    }
}
