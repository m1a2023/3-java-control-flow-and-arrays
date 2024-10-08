package com.example.task02;

import java.util.HashMap;

public class Task02Main {
    enum season {
        WINTER,
        SPRING,
        SUMMER,
        AUTUMN
    }

    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        System.out.println(getSeason(12));
         */
    }

    static String getSeason(int monthNumber) {
        monthNumber %= 12;

        switch (monthNumber) {
            case 0: case 1: case 2: return "зима";
            case 3: case 4: case 5: return "весна";
            case 6: case 7: case 8: return "лето";
            case 9: case 10: case 11: return "осень";
        }

        return "";
    }
}