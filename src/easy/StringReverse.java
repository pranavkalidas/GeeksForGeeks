package easy;

public class StringReverse {
    public static void main(String[] args) {
        String str = "pranavkalidas";
        System.out.println(reverseWord(str));
    }

    public static String reverseWord(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}
