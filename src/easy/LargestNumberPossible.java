package easy;

public class LargestNumberPossible {
    static String findLargest(int N, int S){
        String str = "";
        if(S==0 && N>1){
            return String.valueOf(-1);
        }
        while(N>0){
            if(S/9>0){
                str = str + "9".repeat(S/9);
                N = N - S/9;
                S = S%9;
                continue;
            }
            str = str + S;
            S = 0;
            N--;
        }
        if(N<0 || S!=0){
            return String.valueOf(-1);
        }
        return str;
    }
}
