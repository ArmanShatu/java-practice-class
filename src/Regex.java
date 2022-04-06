import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {
//        boolean isValid = isValid("1ssdf@fsf52");
//        System.out.println(isValid);
        getPrice();
    }
    public static boolean isValid(String password) {
        String regex = "^(?=.*[0-9])"
                + "(?=.*[a-z])(?=.*[A-Z])"
                + "(?=.*[@#$%^&+=])"
                + "(?=\\S+$).{8,20}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(password);
        return m.matches();
    }

    public static void getPrice() {
        String str="The price of this shirt is 500 tk and VAT is 75 Tk";
        str = str.replaceAll("[^\\d]", " ");
        str = str.trim();
        System.out.println(str);
        str = str.replaceAll(" +", " ");
        String[] arr=(str.split(" "));
        double shirt_price=Double.parseDouble(arr[0]);
        double vat=Double.parseDouble(arr[1]);
        double total=shirt_price+vat;
        System.out.println("Total price "+total);
    }


}
