package ru.mirea.lab1;

import java.util.Scanner;

public class Pract1 {
    public static void main(String[] args) {
        program4();
    }

    static void program1() {
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

    static void program2() {
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

    static void program4() {
        /* 4. Написать программу, в результате работы которой выводятся на экран
        первые 10 чисел гармонического ряда (форматировать вывод).*/
        System.out.print(1);
        for (int n = 2; n < 11; n++) {
            System.out.print(" + " + "1/" + n);
        }
    }

    static void program5() {
        /* 5. Написать программу, которая с помощью метода класса, вычисляет
        факториал числа (использовать управляющую конструкцию цикла), проверить
        работу метода.*/
    }
}
