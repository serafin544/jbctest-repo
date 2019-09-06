package slickTalkMachine;

public class slickMain {
    public static void main(String[] args) {
        String[] wordListOne = {"yer" ,"Thats Everyday", "sup fellas",
                "how u doin","Thats crazy", "pow pow", "*cries in spanish*",
                "I need ur credit card info" };
        String[] wordListTwo = {"gotta get this money" ,"stay strong", "I need to do my homework",
                "today is gonna be a new day","swagger man", "gotta get that rice with that",
                "i need to buy more waffles","I need ur credit card info" };
        String[] wordListThree ={"today", "and serafin shut up", "and you didnt bring food", "see ya"
        ,"we all good", "peace", "ight" };

        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        int rand1 = (int)(Math.random() * oneLength);
        int rand2 = (int)(Math.random() * twoLength);
        int rand3 = (int)(Math.random() * threeLength);

        String phrase = wordListOne[rand1] + " " +wordListTwo[rand2] + " " + wordListThree[rand3];
        System.out.println("listen well kid, " + phrase);
    }
}
