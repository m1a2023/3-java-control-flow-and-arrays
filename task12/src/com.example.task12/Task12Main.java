package com.example.task12;

public class Task12Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        int[] arr = {9, 11, 7, 8};
        selectionSort(arr);
        System.out.println(java.util.Arrays.toString(arr));
         */
    }

    static void selectionSort(int[] arr) {
        if (arr == null || arr.length == 0) return;

        int i = 0;

        while (i < arr.length) {
            int index = indexMinNumber(arr, i);
            int minValue = arr[index];

            int tmp = arr[i];
            arr[i] = minValue;
            arr[index] = tmp;

            i++;
        }

    }

    public static int indexMinNumber(int[] arr, int offset) {
        int indexMin = 0, minv = Integer.MAX_VALUE;

        for (int i = offset; i < arr.length; i++) {
            if (minv >= arr[i]) {
                minv = arr[i];
                indexMin = i;
            }
        }
        return indexMin;
    }

}