package ru.mirea.lab1;

import java.util.Scanner;

public class program1 {
    public static void main(String[] args) {
        /* 1. Написать программу, в результате которой массив чисел создается с
        помощью инициализации (как в Си), вводится и считается в цикле сумма
        элементов целочисленного массива, а также среднее арифметическое его
        элементов результат выводится на экран. Использовать цикл for. */
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 10 элементов массива");
        int[] array = new int[10];
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
            sum += array[i];
        }
        double middle = sum / array.length;
        System.out.printf("Сумма элементов массива: %s\nСреднее арифметическое: %s", sum, middle);
    }
}
