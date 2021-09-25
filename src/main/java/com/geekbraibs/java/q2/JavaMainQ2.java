package com.geekbraibs.java.q2;

public class JavaMainQ2 {
    public static void main(String[] args) {
        /*Домашнее задание
1.Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
2.Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
3.Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
4.Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
5.** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
6.** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны. Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true, граница показана символами ||, эти символы в массив не входят.
7.**** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным), при этом метод должен сместить все элементы массива на n позиций. Элементы смещаются циклично. Для усложнения задачи нельзя пользоваться вспомогательными массивами. Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ]. При каком n в какую сторону сдвиг можете выбирать сами.
*/
        System.out.println("Задание №1:");
        int arrayBoolean[] = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0, 1};
        convert(arrayBoolean);

        System.out.println("Задание №2:");
        int arrayNull[] = new int[8];
        addArray(arrayNull);

        System.out.println("Задание №3:");
        int arrayUpdate[] = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        updateX2(arrayUpdate);

        System.out.println("Задание №4:");
        int n = 9;
        int m = n;
        int quadrate[][] = new int[n][m];
        arrayQuadrate(quadrate);

        System.out.println("Задание №5:");
        int minMax[] = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, -1};
        arrayMinMax(minMax);

        System.out.println("Задание №6:");
        int centre[] = {2, 2, 2, 2, 2, 2, 10, 2};
        System.out.println(arrayCentre(centre));

        System.out.println("Задание №7:");
        n = -11;
        int offset[] = {1,12,-3,5,-17};
        arrayOffset(offset, n);

    }

    public static void convert(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("");
        for (int i = 0; i < array.length; i++) {
            switch (array[i]) {
                case 0:
                    array[i] = 1;
                    break;
                default:
                    array[i] = 0;
            }
            System.out.print(array[i] + " ");
        }
        System.out.println("");
    }

    public static void addArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            array[i] = 3 * i;
            System.out.print(array[i] + " ");
        }
        System.out.println("");
    }

    public static void updateX2(int array[]) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6)
                array[i] *= 2;
            System.out.print(array[i] + " ");
        }
        System.out.println("");
    }

    public static void arrayQuadrate(int array[][]) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i == j) {
                    array[i][j] = 1;
                    System.out.print(array[i][j] + " ");
                } else if (i + 1 == array.length - j) {
                    array[i][j] = 1;
                    System.out.print(array[i][j] + " ");
                } else {
                    array[i][j] = 0;
                    System.out.print(array[i][j] + " ");
                }
            }
            System.out.println("");
        }
    }

    public static void arrayMinMax(int array[]) {
        int min = 0;
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) max = array[i];
            else if (array[i] < min) min = array[i];
        }
        System.out.println("Максимальное число: " + max);
        System.out.println("Минимальное число: " + min);
    }

    public static boolean arrayCentre(int[] array) {
        int x = 0;
        while (x < array.length) {
            int sumLeft = 0;
            int sumRight = 0;
            for (int i = array.length - 1; i > x; i--) {
                sumRight += array[i];
            }
            for (int i = 0; i <= x; i++) {
                sumLeft += array[i];
            }
            if (sumLeft == sumRight) return true;
            else if (sumLeft < sumRight) x++;
            else if (sumLeft > sumRight) return false;
        }
        return false;
    }
    public static void arrayOffset(int array[], int x){
        int cash = 0;
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("");
        int n = x % array.length;
        if(n > 0) {
            for (int k = 0; k < x; k++) {
                for (int i = array.length - 1; i >= 0; i--) {
                    if (i - 1 >= 0) {
                        cash = array[i];
                        array[i] = array[i - 1];
                        array[i - 1] = cash;
                    }
                }
            }
        }
        else if (n < 0){ // движение влево
            for (int k = x; k < 0 ; k++) {
                for (int i = 0; i < array.length; i++) {
                    if (i + 1 < array.length) {
                        cash = array[i];
                        array[i] = array[i + 1];
                        array[i + 1] = cash;
                    }
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");
    }
}

