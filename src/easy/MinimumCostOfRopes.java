package easy;

import java.util.PriorityQueue;

public class MinimumCostOfRopes {
    public static void main(String[] args) {
        int n = 4;
        long[] arr = {4, 3, 2, 6};
        System.out.println(minCost(arr,n));
    }
    public static long minCost(long[] arr, int n)
    {
        long cost = 0;
        PriorityQueue<Long> ss = new PriorityQueue<>();
        for(Long l : arr ) {
            ss.add(l);
        }
        if(n == 0 || n == 1)
            return 0;
        while(n!=1) {
            long a = ss.poll();
            long b = ss.poll();
            cost = cost + a + b;
            long sum = a + b;
            ss.add(sum);
            n--;
        }
        return cost;

    }
}
