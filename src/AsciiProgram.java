import java.util.Scanner;

public class AsciiProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String var = scanner.next();
        int asciiValue=(int)var.charAt(0);
        if (asciiValue>=65 && asciiValue<=91){
            System.out.println("This is capital letter");
        }
        else {
            System.out.println("This is small letter");
        }
    }
}
