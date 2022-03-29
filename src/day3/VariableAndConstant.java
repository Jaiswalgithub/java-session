package day3;

public class VariableAndConstant {
    public static void main(String[] args) {
        String videoId = "nfbdffbbj"; //variables value can be changed
        videoId = "mjferrj";

        final String TITLE = "Some Title";
       // TITLE = "changed title"; //constant value cannot be changed

        //constant
        final String SMALL = "S";
        final String MEDIUM = "M";
        final String LARGE = "L";
        final String EXTRA_LARGE = "XL";

        //enum replaces multiple constant
        enum size{
            SMALL,MEDIUM,LARGE,EXTRA_LARGE
        }

        //Assignment Operator
        int x = 6;
        x += 3; //x= x+3;
        System.out.println(x);
        x -= 2; //x= x-2;
        System.out.println(x);
        x *= 5; //x= x-5;
        System.out.println(x);
        x /= 2; //x= x/2;
        System.out.println(x);



    }

}
