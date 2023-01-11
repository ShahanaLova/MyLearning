package az.ikt.exercises.smallapp;

public class Main {

    public static void main(String[] args)  {
        System.out.println("=============> WELCOME TO USER REGISTRATION APP <=============");
        System.out.println("===>");
        System.out.println("======>");
        System.out.println("=========>");
        System.out.println("============>");


        try {
            Application.run();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("<============");
        System.out.println("<=========");
        System.out.println("<======");
        System.out.println("<===");
        System.out.println("=============> GOOD BYE <=============");
    }
}