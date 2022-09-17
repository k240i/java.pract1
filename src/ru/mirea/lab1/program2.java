package ru.mirea.lab1;

import java.util.Scanner;

public class program2 {
    public static void main(String[] args) {
       /* 2. Написать программу, в результате которой массив чисел вводится
        пользователем с клавиатуры, считается сумма элементов целочисленного
        массива с помощью циклов do while, while, также необходимо найти
        максимальный и минимальный элемент в массиве, результат выводится на экран*/
        int sum = 0;
        int c = 0;
        int max = 0, min = (int) Math.pow(10, 7);
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количесво элементов массива: ");
        int i = sc.nextInt();
        int[] array = new int[i];
        System.out.println("Введите элементы массива:");
        for (int a = 0; a < i; a++) {
            array[a] = sc.nextInt();
        }
        while (c != i) {
            sum += array[c];
            if (max < array[c]) max = array[c];
            if (min > array[c]) min = array[c];
            c++;
        }
        /*do{
            sum+=array[c];
            if (max < array[c]) max = array[c];
            if (min > array[c]) min = array[c];
            c++;
        }while (c!=array.length);*/
        System.out.printf("Сумма: %d\nМаксимальный элемент: %d\nМинимальный элемент: %d", sum, max, min);
    }
}
