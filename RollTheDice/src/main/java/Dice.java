import org.w3c.dom.css.Counter;

public class Dice {

    public static void main(String[] args) {

        //Create new dice
        Dice dice = new Dice();

        //Variables for 1st and second roll
        int roll1;
        int roll2;

        //Counters for number of times the sum was 2, 4, 6, and 7
        int twoCounter = 0;
        int fourCounter = 0;
        int sixCounter = 0;
        int sevenCounter = 0;

        //For loop to roll the dice i times
        for (int i = 0; i <= 100; i++) {

            //Roll each dice and add the sum
            roll1 = dice.roll();
            roll2 = dice.roll();
            int sum = roll1 + roll2;

            //Print out dice results and sum of dice for each roll
            System.out.println("Roll " + i);
            System.out.println(roll1 + " - " + roll2 + " Sum: " + sum + "\n");

            // if/else if statements that increase number of times the sum was 2, 4, 6, and 7
            if (sum == 2) {
                twoCounter++;
            } else if (sum == 4) {
                fourCounter++;
            } else if (sum == 6) {
                sixCounter++;
            } else if (sum == 7) {
                sevenCounter++;
            }
        }

        //Print out number of times the sum was 2, 4, 6, and 7
        System.out.println("Number of sum of 2's: " + twoCounter);
        System.out.println("Number of sum of 4's: " + fourCounter);
        System.out.println("Number of sum of 6's: " + sixCounter);
        System.out.println("Number of sum of 7's: " + sevenCounter);
    }

    static int roll() {
        //get and return random number
        int randNumber = (int) (Math.random() * 6) + 1;
        return randNumber;
    }
}
