package nineninebottles;

/*
public class Main99b {
    public static void main(String[] args) {
        System.out.println("99 bottles");
    }
}
*/

public class Main99b{
    public static void main(String[] args) {
        int finNum = 99;
        String word = "Serafins";

        while(finNum > 0){

            if(finNum == 1){
                word = "Just One Lonely Serafin";
                System.out.println(word + " now and he decides to leave :( ");
            } else if(finNum > 1 ){
                System.out.println("\n\t"+ finNum + " " + word + " hanging out together and being awesome");
                System.out.println("\n\t"+finNum + " " + word + " hanging out");
                System.out.println("\n\t"+"One makes fun of another ");
                System.out.println("\n\t"+"That one gets jumped and kicked out \n");
            }
            else{
                System.out.println("No more Serafins around");
                break;
            }
            --finNum;

        }
    }
}
