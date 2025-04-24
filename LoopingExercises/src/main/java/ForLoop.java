public class ForLoop {

    public static void main(String[] args) throws InterruptedException {

        //for loop to count down
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
            //pause between each number
            Thread.sleep(1000);
        }
        //Print launch after countdown
        System.out.println("Launch!");
    }
}
