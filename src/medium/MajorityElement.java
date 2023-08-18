package medium;

import java.util.*;

public class MajorityElement {
    public static void main(String[] args) {
        int[] a = {3,1,2,3,3};
        int size = 5;
        System.out.println(majorityElement(a,size));
        System.out.println(majorityElementByHashMap(a,size));
    }

    static int majorityElement(int[] a, int size){
        Arrays.sort(a);
        int ele = a[0];
        int count = 0;
        for(int i=0; i<size;i++){
            if(ele == a[i]){
                count++;
            }
            else{
                count = 1;
                ele = a[i];
            }
            if(count>size/2){
                return ele;
            }
        }
        return -1;
    }

    static int majorityElementByHashMap(int[] a, int size){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i : a){
            map.merge(i, 1, Integer::sum);
        }

        for(int i : map.keySet()){
            if(map.get(i)>size/2){
                return i;
            }
        }
        return -1;
    }
}

