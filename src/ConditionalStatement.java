public class ConditionalStatement {
    public static void main(String[] args) {
        int number1 = 15;
        int number2 = 10;
        int number3 = 25;

        if(number1>number2 && number1>number3){
            System.out.println("Max is "+number1);
        }
        else if(number2>number1 && number2>number3){
            System.out.println("Max is "+number2);
        }
       else{
            System.out.println("Max is "+number3);
        }
    }
}
