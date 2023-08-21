package medium;

import java.util.ArrayList;

public class FactorialOfLargeNumber {
    public static void main(String[] args) {
        FactorialOfLargeNumber obj = new FactorialOfLargeNumber();
        obj.Driver();
    }
    public void Driver(){
        int N = 897;
        System.out.println(factorial(N));
    }

    public ArrayList<Integer> factorial(int N){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        for(int i=2; i<=N; i++){
            int size = list.size();
            multiply(list,i,size);
        }
        return list;
    }

    private void multiply(ArrayList<Integer> list, int fact, int size) {
        int carry = 0;
        for(int i =0; i<size; i++){
            int temp = (list.get(i)*fact + carry);
            list.set(i,temp%10);
            carry = temp/10;
        }
        while(carry > 0){
            list.add(carry%10);
            carry=carry/10;
        }
        
    }


}
