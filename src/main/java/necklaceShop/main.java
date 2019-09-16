package necklaceShop;
import javax.swing.text.DateFormatter;
import java.time.LocalDate;
import java.util.Random;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class main {
    static necklace[] inventory = new necklace[20];
    public static void main(String[] args) {
        System.out.println("Welcome to the fancy necklace shop!");
       fillUp();
        for(int i = 0; i < inventory.length; i++){
            System.out.println(inventory[i]);
        }
        System.out.println("Would you like to buy a necklace type a number from 1-20 \n or if you would like to buy them all press 0");

        Scanner s = new Scanner(System.in);
        int input = s.nextInt();
        if(input == 0){
            for(int i= 0; i < inventory.length;i++){
                buy(inventory[i]);
                System.out.println("You bought out the store!!!");
                fillUp();
            }
        }else{
            input -=1;
            System.out.println(buy(inventory[input]));
        }




    }



    public static void fillUp(){
        System.out.println("New inventory has arrived!!");
        Random rand = new Random();
        int r = rand.nextInt(10000);
        int r2 = rand.nextInt(1000000000);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDate localDate = LocalDate.now();
        for(int i = 0; i < inventory.length; i++){
            String brand = "Necklace" + i;

            String td = dtf.format(localDate);
            inventory[i] = new necklace(brand,r,r2,td);

        }

    }
    public static String buy(necklace n){
        n.setBrand("BOUGHT");
        n.setPrice(-0.00);
        String bought = "Congrats you have bought it";
        return bought;
    }


}