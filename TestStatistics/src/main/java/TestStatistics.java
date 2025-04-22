public class TestStatistics {

    public static void main(String[] args) {
        int[] testScores = {84, 52, 65, 98, 85, 77, 42, 82, 94, 83};

        //Variable holders for the sum, highest, and lowest score
        int sumOfScores = 0;
        int highestScore = testScores[0];
        int lowestScore = testScores[0];

        // for loop to go through all scores in the array
        for (int i = 0; i < testScores.length; i++) {
            sumOfScores = sumOfScores + testScores[i];

            //if statements to determine the highest and lowest scores
            if(testScores[i] > highestScore){
                highestScore = testScores[i];
            }
            if(testScores[i] < lowestScore){
                lowestScore = testScores[i];
            }

        }
        //Calculate the average score
        int averageScore = sumOfScores / testScores.length;

        //Print out average, highest, and lowest score.
        System.out.println("Average Score: " + averageScore);
        System.out.println("Highest Score: " + highestScore);
        System.out.println("Lowest Score: " + lowestScore);
    }

}
