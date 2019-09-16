/*
package sciCalc;
import java.sql.SQLOutput;
import java.util.Scanner;
public class main {
    static int currentNumber = 0;
    public static void main(String[] args) {
        startUp();

    }
    public static void startUp(){
        System.out.println("##########################");
        System.out.println("######## FIN CALC ########");
        System.out.println("##########################");
        System.out.println("PRESS ZERO( 0 ) = RESET to ZERO");
        System.out.println("PRESS ONE( 1 ) = SHOW CURRENT NUMBER");
        System.out.println("PRESS TWO( 2 ) = ENTER A BASIC EQUATION ( +, - , * , /)");
        System.out.println("PRESS THREE (3) = CALCULATE THE SQUARE OR SQUARE ROOT");
        System.out.println("PRESS 8 TO SEE OPTIONS AGAIN || PRESS 9 TO EXIT ");
    }

    public static void resetNumber(){
        currentNumber = 0;
        System.out.println("The Number has been Reset to Zero: " + currentNumber);
    }

    public static void ShowCurrrentNumber(){
        System.out.println("The current number is: " + currentNumber);
    }
    public static void basicEq(){
        System.out.println("EXAMPLE:5 + 5 or in other word NUMBER SPACE SIGN SPACE NUMBER");
        Scanner numInputOne = new Scanner(System.in);
        Scanner  numInputTwo  = new Scanner(System.in);
        Scanner operatorInput = new Scanner(System.in);
        System.out.println("Enter the first number");
        int numInput1 = numInputOne.nextInt();
        System.out.println("Enter the second number");
        int numInput2 = numInputTwo.nextInt();
        System.out.println("Enter the math operation");
        String operatorIn = operatorInput.nextLine();

        if(operatorIn == "+"){
            currentNumber = numInput1 + numInput2;
        }else if(operatorIn == "-"){
            currentNumber = numInput1 - numinput2;
        }else if(operatorIn == "*"){
            currentNumber = numInput1 * numInput2;
        }else if(operatorIn == "/"){

        }




        return null;

    }
}
*/
