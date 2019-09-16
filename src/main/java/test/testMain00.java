package test;
import java.util.*;
public class testMain00 {


    public static String createStringOfFibonnaciUpToMax(int maxnumber) {
        String output = "0, 1";
        int sum = 0;
        int startZero = 0;
        int startOne = 1;
        for(int i = 2; sum < maxnumber-1; ++i){
            System.out.println("s0:    "+startZero);
            System.out.println("s1:   "+startOne);
            sum = startZero + startOne;
            System.out.println("SUM:    " +sum);
            if(sum > maxnumber){
                break;
            }
            output += ", " + sum;
            startZero = startOne;
            startOne = sum;
        }

        return output;
    }







        public static void main(String[] args) {
            System.out.println(createStringOfFibonnaciUpToMax(18));

        }
}
