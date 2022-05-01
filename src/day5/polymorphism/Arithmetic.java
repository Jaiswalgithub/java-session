package day5.polymorphism;

public class Arithmetic {
    public static void main(String args[]){

        //int a = 2;
        //int b = 3;
        addNumbers(2,3);
        addNumbers(1.5f, 2.5f);

    }
    public static void addNumbers(int a, int b){
        int c = a + b;
        System.out.println(c);
    }
    public static void addNumbers(float a, float b){
        float c = a + b;
        System.out.println(c);
    }

}
