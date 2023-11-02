package easy;

public class MinimumOperations {
    public int minOperation(int n)
    {
        int count = 1;
        while(n>1){
            if(n%2==0){
                n=n/2;
            }
            else{
                n -= 1;
            }
            count++;
        }
        return count;
    }
}
