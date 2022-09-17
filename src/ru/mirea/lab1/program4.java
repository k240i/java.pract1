package ru.mirea.lab1;

public class program4 {
    public static void main(String[] args) {
       /* 4. Написать программу, в результате работы которой выводятся на экран
        первые 10 чисел гармонического ряда (форматировать вывод).*/
        System.out.print(1);
        for (int n = 2; n < 11; n++) {
            System.out.print(" + " + "1/" + n);
        }
    }
}
