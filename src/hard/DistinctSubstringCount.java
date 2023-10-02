package hard;

import java.util.Arrays;
import java.util.HashMap;

public class DistinctSubstringCount {
    public static void main(String[] args) {
        String s = "abca";
        System.out.println(distinctSubsequences(s));
    }

    static int distinctSubsequences(String S) {
        int[] dp = new int[S.length()+1];
        dp[0]=1;
        int MOD = 1000000007;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0; i<S.length(); i++){
            int count = ( dp[i]%MOD *2)%MOD;
            char c = S.charAt(i);
            if(map.containsKey(c)){
                count = (count%MOD - dp[map.get(c)]%MOD + MOD)%MOD;
            }
            dp[i+1] = count;
            map.put(c,i);
        }
        return dp[S.length()]%MOD;
    }

}
