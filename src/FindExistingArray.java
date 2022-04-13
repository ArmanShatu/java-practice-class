import java.util.Scanner;

public class FindExistingArray {
    public static void main(String[] args) {
        int num[]={1,2,3,4,5,6};
        boolean flag=false;
        Scanner scanner=new Scanner(System.in);
        int data = scanner.nextInt();
        for (int i=0;i<num.length;i++){
            if(data==num[i]){
                flag=true;
                System.out.println("Found");

            }

            }
            if(flag==false){
                System.out.println("Not Found");
        }
        scanner.close();
    }
}
