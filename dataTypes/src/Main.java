public class Main {
    public static void main(String[] args) {
        char character = 'A'; // 1 byte
        byte number1 = 12; // -128 to 127 (1 byte)
        short number2 = 24;  //-32768 to 32767 (2 bytes)
        int number3 = 48;  // -2147483648 to 2147483647(4 bytes)
        long number4 = 96; // 8 bytes
        float number5 = -1.4f; //double → default ondalıqlıdır   float → sonunda f istəyir
        double number6 = 1.4; // 8 bytes
        // mainly used = double and int
        System.out.println("Welcome");
        System.out.println(character);
        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);
        System.out.println(number4);
        System.out.println(number5);
        System.out.println(number6);
    }
}
