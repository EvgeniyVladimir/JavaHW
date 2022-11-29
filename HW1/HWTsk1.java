
// package HW1;
// public class HWTsk1 {
// import java.util.Scanner;
// Задача 1. Вычислить n-ое треугольного число(сумма чисел от 1 до n), 
// n! (произведение чисел от 1 до n)
// ________________________________________________________________
//2. Написать метод, принимающий на вход два целых числа и проверяющий, 
// что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
// package HW1;
// import java.util.Scanner;
// public class HWTsk1 {
//     public static void main(String[] args) {
//         Scanner iScanner = new Scanner(System.in);
//         System.out.println("Enter number x: ");
//         int x = iScanner.nextInt();
//         System.out.println("Enter number y: ");
//         int y = iScanner.nextInt();
//         System.out.println(expressionCheck(x , y) + "\n");
//         iScanner.close();       
//     }
//     public static boolean expressionCheck(int x , int y) {
//         return x >= 10 && y <= 20;
//     }
// }
// // ________________________________________________________________
// 3.Написать метод, которому в качестве параметра передается целое число, 
// метод должен напечатать в консоль, положительное ли число передали или отрицательное. 
// Замечание: ноль считаем положительным числом.
// package HW1;
// import java.util.Scanner;
// public class HWTsk1 {
//     public static void main(String[] args) {
//         Scanner iScanner = new Scanner(System.in);
//         System.out.printf("Enter number: ");
//         int a = iScanner.nextInt();
//         checkPositiveNegative(a);
//         iScanner.close();
//     }
//     public static void checkPositiveNegative (int a) {
//         System.out.println(a >= 0 ? "Positive" : "Negative");
//         }
// }
// ________________________________________________________________
// 4.Написать метод, которому в качестве параметра передается целое число. 
// Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
// package HW1;
// public class HWTsk1 {
//     public static void main(String[] args) {
//         System.out.println(checkNegative(25));
//         }
//     public static boolean checkNegative(int a){

//         return a < 0;
//     }
// }
// ________________________________________________________________
// 5.Написать метод, которому в качестве аргументов передается строка и число, 
// метод должен отпечатать в консоль указанную строку, указанное количество раз;
// package HW1;
// public class HWTsk1 {
//     public static void main(String[] args) {
//         printWord("Task", 5);
//     }

// public static void printWord(String str, int n){
//     for (int i = 1; i <= n; i++){
//         System.out.println(" " + i + " " + str);
//         }
//     }
// }
// ________________________________________________________________
// 6.Написать метод, который определяет, является ли год високосным, 
// и возвращает boolean (високосный - true, не високосный - false). 
// Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
// 
// package HW1;
// public class HWTsk1 {
//     public static void main(String[] args) {
//         System.out.println(checkLeapYear(400));
//     }
//     public static boolean checkLeapYear (int year){
//         if (year % 400 == 0){
//             return true;
//         } else if (year % 100 == 0) {
//             return false;
//         } else {
//             return year % 4 == 0;
//         }
//     }
// }
// ________________________________________________________________
// 7.Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. 
// С помощью цикла и условия заменить 0 на 1, 1 на 0;
// package HW1;
// public class HWTsk1 {
// public static void main(String[] args) {
//     int[] arr1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
//     integerArray(arr1);
//     System.out.println();
//     }
//     public static void integerArray(int[] arr) {
//         for (int x = 0; x < arr.length; x++) {
//             if (arr[x] == 0) {
//                 arr[x] = 1;
//             } else {
//                 arr[x] = 0;
//             }
//             System.out.print(arr[x] + " ");

//         }
//     }
// }
// ________________________________________________________________
// 8.Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
// package HW1;
// public class HWTsk1 {
// public static void main(String[] args) {
//     System.out.println(" ");
//     emptyArray(100);}
//     public static void emptyArray ( int size) {
//         int[] arr = new int[size];
//         for (int i = 0; i < arr.length; i++) {
//             arr[i] = i + 1;
//             System.out.print(arr[i] + " ");
//         }
//     }          
// }

// ________________________________________________________________

// 9.Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;

// package HW1;
//     public class HWTsk1 {
//     public static void main(String[] args) {
//         int[] arr = {1, 5, 3, 2 ,11, 4, 5, 2, 4, 8, 9, 1};
//             smallArray(arr);
//             System.out.println();
//     }
//             public static void smallArray(int[] arr) {       
//                 for (int i = 0; i < arr.length; i++){
//                     if (arr[i] < 6) {
//                         arr[i] = arr[i] * 2;
//                     }       
//                 System.out.print(arr[i] + " ");
//                 }
//             }
//     }
    
// ________________________________________________________________

// 10.Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), 
// и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
//  Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, 
// то есть [0][0], [1][1], [2][2], …, [n][n];

// package HW1;
//     public class HWTsk1 {
//     public static void main(String[] args) {
//         squareArray();
//         System.out.println();
//     }
//         public static void  squareArray () {
//             int [] [] arr = {
//                     {1, 2, 3}, {4, 5, 6}, {7, 8, 9}
//                 };
//             for (int i = 0; i < 3; i++) {
//                 for (int j = 0; j < 3; j++) {
//                     if (i == j) {
//                         arr[i][j] = 1;
//                     }
//                     System.out.print(arr[i][j] + " ");
//             }
//             System.out.println();             
//             }
//         }
//     }

// 11.Написать метод, принимающий на вход два аргумента: len и initialValue, 
// и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;

// package HW1;
//     public class HWTsk1 {
//         public static void main(String[] args) {
//             twoArguments(5, 77);
//             System.out.println();
//         }
//         public static void twoArguments(int len, int initialValue) {
//             int[] arr = new int[len];
//             for (int i = 0; i < len; i++){
//                 arr[i] = initialValue;
//                 System.out.println("["+ i +"]" + arr[i] + " ");
//             }
//         }
        
//     }
///________________________________________________________________

// 12.Задать одномерный массив и найти в нем минимальный и максимальный элементы ;

// package HW1;
//     public class HWTsk1 {
//         public static void main(String[] args) {
//             int[] arr = {19, 7, 0, 5, 1, 6, 11, 18, 3, 145, 2, -3};
//             maxminArray(arr);
//         }
//         public static void maxminArray(int[] arr) {
//             int max = arr[0];
//             int min = arr[0];
//             for (int i = 0; i < arr.length; i++){
//                 if (arr[i] > max){
//                     max = arr[i];
//                 }
//             }
//             for (int i = 0; i < arr.length; i++){
//                 if (arr[i] < min){
//                     min = arr[i];
//                 }
//             }
//             System.out.println(max);
//             System.out.println(min);
//         }
//     }
// _______________________
