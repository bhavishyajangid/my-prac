package com.basic;

import java.sql.SQLOutput;
import java.util.Queue;
import java.util.Scanner;

public class Array {



//    public static int[] multiply(int a , int b ) {
//        Scanner sc = new Scanner(System.in);
//        int arr1[] = new int[a];
//        int arr2[] = new int[b];
//
//        //   input the elements of first  array
//        for (int i = 0; i < arr1.length; i++) {
//            System.out.println("Enter the first array elements");
//            arr1[i] = sc.nextInt();
//        }
//        //   input the elements of second array
//        for (int i = 0; i < arr1.length; i++) {
//            System.out.println("Enter the second array elements");
//            arr2[i] = sc.nextInt();
//        }
//
//        // multiply the both array elements
//        // making a new array because the value
//        // we get after the multiplication is stored in an array
//        int newvalue[] = new int[arr1.length];
//
//        for (int i = 0 ; i<arr1.length;i++) {
//            newvalue[i] = arr1[i] * arr2[i];
//
//        }
//
//        // here we return the array which i have stored multipliyed value
//        return newvalue ;
//
//    }

//    public static int[] arraydivide(int a ) {
//
//
//        for (int i = 0 ; i<a.length; i++){
//
//        }
//    };

//    public static int[] allmethod(int arr1[][], int arr2[][]) {
//        Scanner sc = new Scanner(System.in);
//        for (int i = 0; i < arr1.length; i++) {
//            for (int j = 0; j < arr1.length; j++) {
//                System.out.println("Enter the elements of arr1");
//                arr1[i][j] = sc.nextInt(arr1[i][j]);
//                System.out.println();
//            }
//
//        }
//
//        for (int i = 0; i < arr2.length; i++) {
//            for (int j = 0; j < arr2.length; j++) {
//                System.out.println("Enter the elements of arr2");
//                arr2[i][j] = sc.nextInt();
//                System.out.println(arr2[i][j]);
//            }
//
//        }
//        return new int[0] ;
//    }

    // function of factorial number
//    public static int factorial(int num) {
////        int finalfactorial = 0 ;
//        int j = 1 ;
//        for (int i = 2; i <= num; i++) {
//            j *= i ;
//
//        }
//        return j;
//    }

    // MAKING FUNCTION TO FIND LARGEST NUMBER IN AN ARRAY

//    public static int findLargestNumber(int arr[]){
//        int largest = arr[0];
//
//         for (int i =  1 ; i<arr.length ; i++){
//             System.out.println(largest);
//             if (arr[i] > largest) {
//                 largest = arr[i];
//                 System.out.println(arr[i]);
//
//             }
//
//         }
//
//        return largest;
//    }


    // parameter of rectangle programm

//    public static int rectangle(int length , int width){
//        int parameter = 2 * (length + width) ;
//        return parameter ;
//    }


    // remove duplicate elements in an array




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        array is collection of data

//        'synatax of an array in java'

//        type arrayname[] = new type[size of array]
//        now we stored fata in this array like
//         int myarray[] = new int[5]; // this is my array
//         myarray[0] = 20;
//         myarray[1] = 20;   //store data in an array like this
//         myarray[2] = 20;
//         myarray[3] = 20;
//         myarray[4] = 20;


//         print this array by for loop
//        for (int i = 0 ; i<3 ; i++){
//            System.out.println(myarray[i]);
//        }


//        tyep two to declare a array in java
//    syntax int array[] = {20, 50, 60} ;


//        lets take input from user and make the array of user giving size
//       Scanner sc = new Scanner(System.in);
//        System.out.println("enter a size of the array");
//        int size = sc.nextInt();
//
//
//
//        int number[] = new int[size];
//
//        for (int i =0 ;i<size; i++ ){
//            number[i] = sc.nextInt();
//        }

//        for (int i =0 ;i<size; i++ ){
//            System.out.println(number[i]);
//        }


//        finding a element from an array using for loop

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the size of the array");
//        int size = sc.nextInt();
//
//        int array1 [] = new int[size];
//
//        for (int i = 0 ; i<size; i++ ) {
//            System.out.println("enter array value");
//            array1[i] = sc.nextInt();
//        }
//       int x = sc.nextInt();
//        for (int i = 0 ; i<array1.length; i++ ) {
//            if (array1[i] == 2){
//                System.out.println("2 is found of index no" + i);
//            }


//        lets use for each loop in an array and print all array elements
//        int array[] = new int [5];
//        array[0] = 20 ;
//        array[1] = 20 ;
//        array[2] = 30 ;
//        array [3] = 40 ;
//        for (int i : array){
//            System.out.println(i);
//        }

        //Take an array of names as input from the user and print them on the screen.

//        System.out.println("Enter the size of array");
//        int size = sc.nextInt();
//
//        // making array and take input element
//
//        String arr[] = new String[size];
//         for (int i = 0; i<size ; i++){
//             System.out.println("Enter the array element");
//              arr[i] = sc.next();
//         }
//            // print the array
//         for (int i = 0 ; i<arr.length ; i++){
//             System.out.println(arr[i]);
//         }


        // Q-2  Find the maximum & minimum number in an array of integers.
//        System.out.println("Enter the size of the array");
//       int size = sc.nextInt();
//
//       int array[] = new int[size];
//
//       for (int i = 0 ; i<size ; i++){
//           System.out.println("Enter the array element");
//           array[i] = sc.nextInt();
//       }
//
//        int max = Integer.MIN_VALUE;
//        int min = Integer.MAX_VALUE;
//
//       for (int i = 0 ; i<array.length; i++){
//          if (array[i] < min){
//                   min = array[i];
//          }
//
//           if (array[i] < min){
//               min = array[i];
//           }
//       }
//        System.out.println(min);
//        System.out.println(max);


        //   Write a program that calculates the sum of all elements in an array of integers.

//        System.out.println("Enter the size of the array");
//       int size = sc.nextInt();
//
//       int array[] = new int[size];
//
//       for (int i = 0 ; i<size ; i++){
//           System.out.println("Enter the array element");
//           array[i] = sc.nextInt();
//       }
//        int sum = 0 ;
//       for (int i =0 ; i<array.length ; i++){
//
//           sum += array[i];
//
//        }
//        System.out.println("sum of all number is " +sum );

        //   Write a program that calculates the average of all elements in an array of integers.

//        System.out.println("Enter the size of array ");
//        int size = sc.nextInt();
//
//        int arr[] = new int[size];
//
//        for (int i =0 ; i<size ; i++){
//            System.out.println("Enter the element of array");
//            arr[i]  = sc.nextInt();
//        }
//        int sum = 0 ;
//        int div = 0 ;
//        for (int i = 0 ; i<arr.length ; i++){
//            sum += arr[i];
//
//        }
//
//        for (int i = 0 ; i<arr.length ; i++){
//
//            div =  sum / arr[arr.length-1];
//
//        }
//        System.out.println(div);

//      Write a Java program to reverse the elements of an array without using any additional array.
//
//        System.out.println("Enter the size of array ");
//        int size = sc.nextInt();
//
//        int arr[] = new int[size];
//
//        for (int i =0 ; i<size ; i++){
//            System.out.println("Enter the element of array");
//            arr[i]  = sc.nextInt();
//        }
//
//        for (int i = arr.length-1; i<arr.length ; i--){
//            System.out.println(arr[i]);
//        }


        // MULTIPLY THE TWO ARRAY ELEMENTS I


        // let make  two array and mul all the elements of it
//        System.out.println("Enter the size of the first array ");
//        int size = sc.nextInt();
//        System.out.println("Enter the size of second the array ");
//        int size2 = sc.nextInt();


        // here we call the function and stored in an varible
//        int multipliyedArray[] = multiply( size , size2);

        // after we use for each loop to print the value of this array
//        for (int num : multipliyedArray){
//            System.out.println(num);
//        }


        ///  NOW MAKE ARRAY AND SEPRATE ITS ELEMENT BY EVEN OR ODD
        // STORE A EVEN NUMBER IN DIFFRENT ARRAY AND ODD IN DIFFRENT ARRAY


//        System.out.println("Enter the size of the array ");
//        int size = sc.nextInt();
//
//        int array[] = new int[size];
//        for (int i = 0 ; i<array.length; i++){
//            System.out.println("Enter a elements of array ");
//            array[i] = sc.nextInt();
//        }


//        System.out.println("Enter the row number in first array");
//        int row = sc.nextInt();
//        System.out.println("Enter the coloum number in first array");
//        int coloum = sc.nextInt();
//        System.out.println("Enter the row number of second  array");
//        int row2 = sc.nextInt();
//        System.out.println("Enter the coloum number of second array");
//        int coloum2 = sc.nextInt();

//        int arr1[][] = new int[row][coloum];
//        int arr2[][] = new int[row2][coloum2];


//        allmethod(arr1, arr2);

     // programm to find a factorial number
//        System.out.println("Enter a factorial number");
//        int factorialNumber = sc.nextInt();
//        System.out.println(factorial(factorialNumber));


//        Create a Java method that takes an array of integers as a parameter
//        and returns the largest number in the array.

//        System.out.println("Enter the array size");
//        int size = sc.nextInt();
//        int arr[] = new int[size] ;
//        for (int i = 0 ; i<arr.length ; i++){
//            System.out.println("Enter the array elements of " + size);
//            arr[i]  = sc.nextInt();
//        }
//
//       int result =  findLargestNumber(arr);
//        System.out.println(result);


//        Write a Java method to calculate the area of a rectangle, given its length and width
//        as parameters.
//        System.out.println("Enter the lenght of rectangle");
//        int lenght = sc.nextInt();
//        System.out.println("Enter the width of rectangle");
//        int width = sc.nextInt();
//
//
//      int result  =   rectangle(lenght , width);
//        System.out.println(result);


//        Write a Java function to remove duplicate elements from an array of integers.

        System.out.println("Enter the size of array");
        int size = sc.nextInt();

//        int arr[] = new int[size] ;
//        for (int i = 0 ; i<arr.length ; i++){
//            System.out.println("Enter the elements of array");
//            arr[i]  = sc.nextInt();
        }

//         duplicateElement(arr);

    }
