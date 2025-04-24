public class DoWhileLoop {

    public static void main(String[] args) {

        int i = 0;
        int m = 1; //<--- Counter

        //do loop to print out message i times
        do{
            System.out.println(m + ". I love Java!");
            i++;
            m++;
        } while (i < 5);
    }
}
