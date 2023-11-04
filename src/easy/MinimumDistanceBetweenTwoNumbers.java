package easy;

public class MinimumDistanceBetweenTwoNumbers {
    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        int[] a = {1,3,4,2,1};
        int ans = minDist(a,a.length,x,y);
        System.out.println(ans);
    }

    static int minDist(int[] a, int n, int x, int y) {
        int distance = Integer.MAX_VALUE;
        int pos_x = -1;
        int pos_y = -1;
        boolean found = false;
        for(int i=0; i<n; i++){
            if(a[i]==x){
                pos_x = i;
            }
            else if(a[i]==y){
                pos_y = i;
            }
            if(pos_x!=-1 && pos_y!=-1 && distance > Math.abs(pos_x-pos_y)){
                found = true;
                distance = Math.abs(pos_x-pos_y);
            }
        }
        return found ? distance : -1;
    }
}
