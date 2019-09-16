package talkingPets;
import java.util.Scanner;

public class mainpet {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What kind of pet do you have?");
        String pet = scan.nextLine();
        System.out.println("What is your pet's name ?");
        String petName = scan.nextLine();
      //  pet.speak(pet);
        pet newpet = new pet(petName,pet);
        System.out.println(newpet );
    }
}
