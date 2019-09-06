package dayOne;

public class test {
    static int disCalc(int price, int discount){
        discount = discount/100 * price;
        price = price - discount;

        return price;
    }
    public static void main(String[] args) {
        int valInt = 10;
        String valString = "fin";
        boolean isItRaining = true;
        char valChar = 'y';
        short valShort = 988;
        double valDouble = 1.23d;
        System.out.println("\n" + "\t"+ valString);
        System.out.println(valInt);
        System.out.println(valChar);
        System.out.println("Is it raining: " + isItRaining);
        System.out.println("\t\t\t" + valShort );
        System.out.println("\nThis burger is not a dollar. its $" + valDouble);

        System.out.println(valInt * 789);
        System.out.println("\n \n " + ++valInt);


        System.out.println(disCalc(90,10));
    }


}
