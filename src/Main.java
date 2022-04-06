public class Main {
    public static void main(String[] args) {
//        String firstName="Arman";
//        String lastName="Shatu";
//        String fullName=firstName+" "+lastName;
//        System.out.println(fullName);
//        System.out.println(fullName.length());
        double random = Math.random();
        int min = 100;
        int max = 500;
        double randomNumber = random*(max-min)+min;
        System.out.println((int) randomNumber);
    }
}
