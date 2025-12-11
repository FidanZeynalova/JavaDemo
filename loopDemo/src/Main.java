public class Main {
    public static void main(String[] args) {

        //For
        for (int i = 1; i <= 10; i++) {
            System.out.println("i = " + i);
        }
        System.out.println("The loop is over.");

        //While
        int f = 1;
        while (f < 10) {
            System.out.println("f = " + f);
            f += 2;
        }
        System.out.println("The while's loop is over.");


        //Do-While
        int j = 1;
        do {
            System.out.println("j = " + j);
            j += 2;
        } while (j < 10);
        System.out.println("The do-while's loop is over");
    }
}