public class DoWhileLoop {

    public static void main(String[] args) {

        int i = 0;
        int m = 1; //<--- m is to display the number of "I love java"'s

        do{
            System.out.println(m + ". I love Java!");
            i++;
            m++;
        } while (i < 5);

    }

}
