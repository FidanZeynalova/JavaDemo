public class Main {
    public static void main(String[] args) {

        int number = 20;

        if (number > 13) {
            System.out.println("The number is less than 20");
        }else{
            System.out.println("The number is greater than 20");
        }
        if (number < 21) {
            System.out.println("The number is greater than 20");
        }
        if (number == 20) {
            System.out.println("The number is equal to 20");
        }




        int year = 15;

        if(year < 17){
            System.out.println("Year is less than " + year);
        }else if (year > 17){
            System.out.println("Year is greater than " + year);
        }else {
            System.out.println("Year is equal to " + year);
        }



        int number1 = 15;
        int number2 = 20;
        int number3 = 25;
        int bigNumber = number3;

        if(bigNumber < number1){
            bigNumber = number1;
        }
        if (bigNumber < number2){
            bigNumber = number3;
        }
        System.out.println("The biggest number " + bigNumber);
    }


}