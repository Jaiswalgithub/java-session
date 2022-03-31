package day3;

public class LargestNum {
    public static void main(String[] args) {
        int a = 13;
        int b = 15;
        int c = 18;

        if(a>b && a>c){
            System.out.println("Largest number is:" +a);
        }
        else if(b>c){
            System.out.println("Largest number is:" +b);
        }
        else{
            System.out.println("Largest number is:" +c);
        }
    }
}
