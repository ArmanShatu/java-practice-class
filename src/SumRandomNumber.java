import java.util.Scanner;

public class SumRandomNumber {
    public static void main(String[] args) {
        int min=10;
        int max=50;
        int randomNum1=(int) (Math.random()*(max-min)+min);
        int randomNum2=(int) (Math.random()*(max-min)+min);
        System.out.println("Num1 "+randomNum1);
        System.out.println("Num2 "+randomNum2);
        int sum = randomNum1+randomNum2;
        System.out.println(sum);
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if(sum==number){
            System.out.println("True");
        }
        else {
            System.out.println("false");
        }

    }
}
