public class CheckKthBit {
    public static void main(String[] args) {
        int n = 10;
        int k = 3;
        System.out.println(checkKthBit(n,k));
    }

    static boolean checkKthBit(int n, int k)
    {
        return ((1<<k) & n) == 1<<k;
    }
}
