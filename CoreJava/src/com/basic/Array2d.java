package com.basic;

import java.util.Scanner;

public class Array2d {
    public static void main(String[] args) {
        //        lets making 2d array 2d array mean array in array and its take both rows and coloum
//        and store data in the form of matrix
//        ex :     [ [] , [] , [] , ] this is the syntax of 2d arrray

//        lets make 2d array
//     This is the syntax of making 2d array and print all the elements of an array
//           int newarray[][] = new int [2][2];
//        newarray[0][0] = 20 ;  // [0] [0] mean 0row or 0 coloum
//        newarray[0][1] = 10 ;  // [0] [1] mena  0 row and 1 coloum
//        newarray[1][0] = 5 ;   // [1] [0] mena  1 row and 0 coloum
//        newarray[1][1] = 40 ; // [1] [1] mena  1 row and 1 coloum
//    //            these two [] bracket define array present in the array
//           for (int i = 0 ; i< newarray.length; i++){
//               for (int j = 0 ; j<newarray[i].length ; j++){
//                   System.out.println(newarray[i][j]);
//               }
//           }


        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number of element");
//        System.out.println("Enter the row number");
//        int row = sc.nextInt();
//        System.out.println("Enter the coloum number");
//        int col = sc.nextInt();
//
//        int array[][] = new int[2][2] ;
//
//
//        for (int i = 0 ; i< array.length; i++){
//            for (int j = 0 ; j<array[i].length; j++){
//                System.out.println("enter the coloum element");
//                array[i][j] = sc.nextInt();
////                System.out.println(array[i][j]);
//            }
//        }
//        for (int i = 0 ; i<array.length ; i++){
//            for(int j = 0 ; j<array.length ; j++){
//                System.out.println(array[i][j] + " ");
//            }
//            System.out.println();
//        }
// for(int [] i : array){
//     for (int j : i){
//         System.out.println(j);
//     }
// }




        //lets multiply two two element of an array
//        Scanner sc = new Scanner(System.in);

        // take first array row or coloum as input

        System.out.println("enter the number of rows");
        int rows = sc.nextInt();
        System.out.println("Enter the number of coloums");
        int coloums = sc.nextInt();

        // take second array row and coloum as input

        System.out.println("enter the second array   of rows");
        int rows2 = sc.nextInt();
        System.out.println("enter the second array   of rows");
        int coloums2 = sc.nextInt();

        // making two array

        int arr1[][] = new int[rows][coloums];
        int arr2[][] = new int[rows2][coloums2];

        // take first array element as input

        for (int i =0 ; i<arr1.length ; i++){
            for (int j =0 ; j<arr1.length ; j++){
                System.out.println("Enter the first array element");
                arr1[i][j]  = sc.nextInt();
            }


        }

        // take second array element as input

        for (int i =0 ; i<arr2.length ; i++){
            for (int j =0 ; j<arr1.length ; j++){
                System.out.println("Enter the second array element");
                arr2[i][j]  = sc.nextInt();
            }

        }

        // print there multiplication

        System.out.println(arr1[0][0] * arr2[0][0]);

        // print all elements present in first array
        for(int [] i : arr1){
            for (int j : i){
                System.out.println(j);
            }
            System.out.println();
        }
        // print all elements present in second array
        for(int [] i : arr2){
            for (int j : i){
                System.out.println(j);
            }
        }



    }
}
