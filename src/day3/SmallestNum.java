package day3;

public class SmallestNum {
    public static void main(String[] args) {
        int a = 9;
        int b = 5;
        int c = 8;

       if(a<b && a<c){
           System.out.println("Smallest number is:" +a);
       }
       else if(b<c){
           System.out.println("Smallest number is:" +b);
       }
       else{
           System.out.println("Smallest number is:" +c);
       }

    }
}
