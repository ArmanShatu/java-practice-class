import java.util.HashMap;

public class MyHashmap {
    public static void main(String[] args) {
        HashMap<String, String> hashMap=new HashMap();
        hashMap.put("Bangladesh","Dhaka");
        hashMap.put("India","Delhi");
        hashMap.put("Japan","Tokyo");
        System.out.println(hashMap.get("Bangladesh"));
    }
}
