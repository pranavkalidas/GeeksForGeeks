package medium;

public class GeekAndNumberString {
    public static void main(String[] args) {
        String S = "3446565321";
        System.out.println(geekAndNumberString(S));
    }

    public static int geekAndNumberString(String s){
        int n = s.length();
        int i = 0;
        int count = 0;
        while(i<n) {
            if((i+2)>n) {
                count++;
                break;
            }
            int num = s.charAt(i) - 48;
            int comp = s.charAt(i+1) - 48;
            if(num == 0 && comp == 9) {
                i = i + 2;
            }
            else if(num == 9 && comp == 0) {
                i = i + 2;
            }
            else if(comp == num-1 || comp == num + 1 || num == comp) {
                i++;
            }
            else {
                i++;
                count++;
            }
        }
        return count;
    }
}
