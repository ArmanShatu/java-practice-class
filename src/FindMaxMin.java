public class FindMaxMin {
    public static void main(String[] args) {
        int num[]={45,36,44,12,29};
        int max = findMax(num);
        int min = findMin(num);
        System.out.println(max);
        System.out.println(min);

    }
    static int findMax(int[] arr){
        int max=arr[0];
        for (int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }

        }
        return max;
    }

    static int findMin(int[] arr){
        int min=arr[0];
        for (int i=0;i<arr.length;i++){
            if (arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
}
