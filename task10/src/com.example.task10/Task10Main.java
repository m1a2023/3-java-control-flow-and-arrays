package com.example.task10;

import java.util.Arrays;

public class Task10Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        int[] arr = {7, 5, 9};
        System.out.println(numMin(arr));
         */
    }

    static int numMin(int[] arr) {
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