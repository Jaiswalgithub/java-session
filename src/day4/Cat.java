package day4;

public class Cat {

    String name;
    int age;
    String color;
    String breed;

    public void sleep(){
       System.out.println("Sleeping");
    }
    public void play(){
        System.out.println("Playing");
    }
    public void feed(){
        System.out.println("Eating");
    }

    public static void main(String[] args){

        Cat thor = new Cat();
        Cat rambo = new Cat();

        thor.name = "Thor";
        thor.age = 2;
        thor.color = "black";
        thor.breed = "A";
        System.out.println("Name of cat1:" +thor.name);
        System.out.println("Age of cat1:" +thor.age);
        System.out.println("Color of cat1:" +thor.color);
        System.out.println("Breed of cat1:" +thor.breed);
        thor.sleep();
        System.out.println("============");

        rambo.name = "Rambo";
        rambo.age = 3;
        rambo.color = "grey";
        rambo.breed = "B";
        System.out.println("Name of cat2:" +rambo.name);
        System.out.println("Age of cat2:" +rambo.age);
        System.out.println("Color of cat2:" +rambo.color);
        System.out.println("Breed of cat2:" +rambo.breed);
        rambo.play();
        System.out.println("============");




    }
}
