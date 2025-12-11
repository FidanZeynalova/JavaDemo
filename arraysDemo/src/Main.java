public class Main {
    public static void main(String[] args) {

        String[] students = new String[5];
        students[0] = "Fidan";
        students[1] = "Aynur";
        students[2] = "Məhəmməd";
        students[3] = "Orxan";
        students[4] = "Nübar";

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }

        System.out.println("---------------------------------");

        for (String student : students){
            System.out.println(student);
        }


    }
}