package com.example.task11;

public class Task11Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        int[] arr = {7, 5, 9};
        swap(arr);
        System.out.println(java.util.Arrays.toString(arr));
         */
    }

    static void swap(int[] arr) {
        if (arr == null || arr.length == 0) return;
        int minIndexOfMinNumber = numMin(arr);

        int tmp = arr[minIndexOfMinNumber];
        arr[minIndexOfMinNumber] = arr[0];
        arr[0] = tmp;
    }

    public static int numMin(int[] arr) {
        int indexMin = 0, minv = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (minv >= arr[i]) {
                minv = arr[i];
                indexMin = i;
            }
        }
        return indexMin;
    }
}