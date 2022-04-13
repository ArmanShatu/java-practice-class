public class D2Array {
    public static void main(String[] args) {
        int[][] num={{1,2,3},{4,5,6},{7,8,9}};
//        int res =num.length;
//        System.out.println(res);
        for (int i=0;i<num.length;i++){
            for (int j=0;j<num.length;j++){
                System.out.println(num[i][j]);
            }
        }
    }
}
