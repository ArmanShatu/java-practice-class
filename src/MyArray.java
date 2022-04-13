import java.util.Arrays;

public class MyArray {
    public static void main(String[] args) {
//        int num[] = {1,2,3,4,5,6,7};
//        int num[] = new int[5];
//        num[0]=1;
//        num[1]=2;
//        num[2]=3;
//        System.out.println(numbers[1]);
//        System.out.println(numbers.length);
//        System.out.println(numbers[numbers.length-1]);
//        for (int i=0;i<num.length;i+=2){
//            System.out.println(num[i]);
//        }
//        for (int i:num) {
//            System.out.println(i);
//        }
        int num[]={11,21,37,54,57,16,71};
        Arrays.sort(num);
//        for (int i:num) {
//            System.out.println(i);
//        }
        for (int i=num.length-1;i>=0;i--){
            System.out.println(num[i]);
        }
    }
}
