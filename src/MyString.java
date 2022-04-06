public class MyString {
    public static void main(String[] args) {
        String sentence = "I live in Dhaka. My hometown is Birampur";
        String word = "Dhaka";
//        char c=sentence.charAt(0);
        char c=sentence.charAt(sentence.length()-1);
        System.out.println(c);
        int index=sentence.indexOf('D');
        System.out.println(index);
        boolean status = sentence.contains(word);
        System.out.println(status);
        String newSentence = sentence.replace("Dhaka", "Birampur");
        System.out.println(newSentence);
        boolean stat=sentence.startsWith("I");
        System.out.println(stat);
        String arr[]=sentence.split(" ");
        System.out.println(arr.length);

//        System.out.println(sentence.substring(0,5));
        index=sentence.indexOf("hometown");
        System.out.println(index);
        String myHometown=sentence.substring((sentence.indexOf("hometown")));
        System.out.println(myHometown);
//        System.out.println(sentence.substring(sentence.indexOf("hometown"),28));
        System.out.println(myHometown.split(" ")[0]);
        sentence=" Wow on the world ";
        System.out.println(sentence.trim());



    }
}
