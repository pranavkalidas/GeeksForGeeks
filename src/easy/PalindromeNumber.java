package easy;

public class PalindromeNumber {
    public static void main(String[] args) {
        String s = "malayalam";
        System.out.println(isPalindrome(s));
        System.out.println(isPalindromeWithoutInbuilt(s));
    }

    //Returns 1 if palindrome else 0
    private static int isPalindrome(String s) {
        StringBuilder sb = new StringBuilder(s);
        if(sb.reverse().toString().equals(s)){
            return 1;
        }
        return 0;
    }

    //Returns 1 if palindrome else 0 without inbuilt methods
    private static int isPalindromeWithoutInbuilt(String s){
        int i=0, j=s.length()-1;
        while(i < j){
            if(s.charAt(i)!=s.charAt(j)){
                return 0;
            }
            i++;j--;
        }
        return 1;
    }
}
