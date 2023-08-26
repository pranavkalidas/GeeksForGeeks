package medium;

import java.util.HashMap;

public class LongestkSubstring {
    public static void main(String[] args) {
        String s = "isakmekfjbxawfqgaseveukzvshufwmwcwckzxntlclfpaxstzctewvjqauqtnudzkddtqcukkyfhqqumztgghbbdmlmecuelzuzqvdsepsvecjvkjvpgygrkrejgqszhso";
        int k = 24;
        System.out.println(s.length());
        System.out.println(longestkSubstr(s,k));
    }

    private static int longestkSubstr(String s, int k) {
        int max = -1;
        HashMap<Character,Integer> map = new HashMap<>();
        int i = 0, j = 0;
        int length = 0;
        while (j<s.length()){
            char c = s.charAt(j);
            if(map.size()<=k){
                map.merge(c,1,Integer::sum);
                j++;
            }
            if(map.size()>k){
                length = j - i - 1;
                if(length > max){
                    max = length;
                }
                while(i<j){
                    char d = s.charAt(i);
                    if(map.containsKey(d) && map.get(d)-1 == 0){
                        map.remove(d);
                        i++;
                        break;
                    }
                    else{
                        map.merge(d,-1,Integer::sum);
                        i++;
                    }
                }
            }
        }
        length = j - i;
        if(map.size()==k && length > max){
            max = length;
        }
        return max;
    }
}
