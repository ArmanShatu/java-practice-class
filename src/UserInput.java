import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        try {
            System.out.println("Input a number");
            Scanner scanner = new Scanner(System.in);
//        String name = scanner.nextLine();
            int number = scanner.nextInt();
            System.out.println("Your name is " + number);
            scanner.close();
        }
        catch (Exception error){
            System.out.println("Please insert only number value\n"+ error);
        }
    }
}
