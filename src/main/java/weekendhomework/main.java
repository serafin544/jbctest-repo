/*
Serafin Escobar


package weekendhomework;



public class main {
    public static void main(String[] args) {


        System.out.println("Random only odd number print");
        int randInt  = (int)(50 * Math.random());

        System.out.println("\n" + randInt + "\n");
        for(int i = 0; i < randInt; i++){

            if(i % 2 != 0){
                System.out.println(i);
            }
        }


        System.out.println("\n\n\nSquares : ");
        System.out.println(squares());

        String[] breakfast = {"Sausage","eggs","beans", "Bacon", "tomatoes","Mushrooms"};
        for(int i = 0; i < breakfast.length; i++)
            System.out.println(breakfast[i]);


        //EXTRA Work
        System.out.println(replaceChar("The Farmer went to the store to get 1 dollar's worth of fertilizer"));
    }
    public static String squares(){

        String result = " ";
        result.equalsIgnoreCase();
        for(int i = 1; i <= 10; i++ ){
            int x = i;
            System.out.println(x*x);
        }
        return result;
    }

    public static String replaceChar(String input){
        char[] lns = input.toCharArray();
        String newCharsString = " ";
        for(int i = 0; i < lns.length;i++){
            if(lns[i] == 'f' || lns[i] == 'F')
            {
                lns[i] = '7';
            }
            else if(lns[i] == 'S' || lns[i] == 's'){
                lns[i] = '$';
            } else if(lns[i] == '1' ) {
                lns[i] = '!';
            } else if(lns[i] == 'a' || lns[i] == 'A'){
                lns[i] = '@';
            }
        }

        return newCharsString = String.copyValueOf(lns);
    }
}
*/
