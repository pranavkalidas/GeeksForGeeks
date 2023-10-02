package hard;

import java.util.Arrays;

public class MergeWithoutSpace {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {0, 2, 6, 8, 9};
        merge(arr1, arr2, arr1.length, arr2.length);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }

    private static void merge(int[] arr1, int[] arr2, int n, int m) {
        for (int i = 0; i < n; i++) {
            if (arr1[i] > arr2[0]) {
                int temp = arr1[i];
                arr1[i] = arr2[0];
                arr2[0] = temp;
                //Arrays.sort(arr2);
                bubbleSort(arr2);
            }
        }
    }


    private static void bubbleSort(int[] arr2) {
        int i = 1;
        while (i < arr2.length && arr2[i - 1] > arr2[i]) {
            int temp = arr2[i - 1];
            arr2[i - 1] = arr2[i];
            arr2[i] = temp;
            i++;
        }
    }
}
