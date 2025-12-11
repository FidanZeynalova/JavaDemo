public class Main {
    public static void main(String[] args) {
        double[] myList = {1.3, 2, 3.6, 4, 5, 6};
        double total = 0;
        double max = myList[0];
        double min = myList[0];
        for (double number : myList) {

            if (max < number) {
                max = number;
            }
            if (min > number) {
                min = number;
            }


            total = total + number;
            System.out.println(total);
//            System.out.println(number);
        }
        System.out.println("Result: " + total);
        System.out.println("Max Number: " + max);
        System.out.println("Min Number: " + min);

    }
}