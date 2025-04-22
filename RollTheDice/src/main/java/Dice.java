import org.w3c.dom.css.Counter;

public class Dice {

    public static void main(String[] args) {

        roll();

        Dice dice = new Dice();

        int roll1;
        int roll2;

        int twoCounter = 0;
        int fourCounter = 0;
        int sixCounter = 0;
        int sevenCounter = 0;

        for (int i = 0; i <= 100; i++) {

            roll1 = dice.roll();
            roll2 = dice.roll();
            int sum = roll1 + roll2;

            System.out.println("Roll " + i);
            System.out.println(roll1 + " - " + roll2 + " Sum: " + sum + "\n");

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

        System.out.println("Number of sum of 2's: " + twoCounter);
        System.out.println("Number of sum of 4's: " + fourCounter);
        System.out.println("Number of sum of 6's: " + sixCounter);
        System.out.println("Number of sum of 7's: " + sevenCounter);

    }

    //Method to roll the dice and return a random number
    static int roll() {
        int randNumber = (int) (Math.random() * 6) + 1;
        return randNumber;
    }

}
