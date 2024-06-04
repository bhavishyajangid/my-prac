package com.basic;

import java.sql.SQLOutput;
import java.util.Scanner;

public class loops {
    public static void main(String args[]) {

        //  print even number 20 to 0
//        int i = 0;
//        for (i = 0; i <= 20; i++) {
//            if (i % 2 == 0) {
////                System.out.println("even number " + i);
//            }
//
//        }


//        print factorial of any number using for loop

//        int factorial = 1 ;
//        for (i=1; i<=5 ; i++){
//           factorial *= i ;
//            System.out.println(factorial);
//        }
//        System.out.println(factorial);


        // PRINT TABLE OF GIVEN NUMBER
//        int table = 24 ;
//
//        for (i=1 ; i<=10; i++){
//            int name  = table *  i ;
//            System.out.println(name);
//
//        }


//        for (int i = 1 ; i<= 3 ; i++){
////            System.out.println(i);
//            for (int j = 1 ; j <= 3 ; j++){
////                System.out.println(j);
//                System.out.println(i + " " + j );
//            }
//
//        }

//        for(int i=1;i<=3;i++){
////loop of j
//            for(int j=1;j<=3;j++){
//                System.out.println(i+" "+j);
//            }//end of i
//        }


//for (int i = 1 ; i<=5 ; i++){
//    for (int j = 1; j<=i ; j++){
//        System.out.print(" * ");
//    }
//    System.out.println();
//}

//        for (int i = 1 ; i<=5 ; i++){
//            for (int j = 5; j>=i ; j--){
//                System.out.print(" * ");
//            }
//            System.out.println();
//        }

        //        lets use for each loop in an array and print all array elements
//        int array[] = new int [5];
//        array[0] = 20 ;
//        array[1] = 20 ;
//        array[2] = 30 ;
//        array [3] = 40 ;
//        for (int i : array){
//            System.out.println(i);
//        }


        // MAKING A 6 STAR PATTERN IN JAVA

//        for (int i = 0 ; i<6 ; i++){
//            for (int j = 0 ; j<=i ; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//     * * * * *
//     *       *
//     *       *
//     * * * * *  making this pattern with the for loops


//                  int r = 4 ;
//                  int c = 5 ;
//        for (int i = 1 ;i<=4 ; i++){
//            for (int j = 1 ; j<=5 ; j++)
//                if (i == 1 || j == 1 || i==r || j==4 ) {
//                    System.out.print("*");
//                }
//            else{
//                    System.out.print(" ");
//                }
//            System.out.println();
//        }

//        * * * *
//        * * *
//        * *
//        *            print this pattern

//        int n = 4 ;
//        for (int i=1 ; i<=n ;i++){
//            for (int j=4 ; j>=i ; j--){
//                System.out.print(" * ");
//            }
//            System.out.println();
//        }


//              *
//            * *
//          * * *
//        * * * *   print this pattern


        int n = 4;

//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=n-i;j++){
//                System.out.print(" ");
//            }
//            for (int j =1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        String s = "Hello Woeld";
//        System.out.println(s);
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number");
//        int a = sc.nextInt();
//        System.out.println(a);
//        System.out.println("ENter a String");
//        String s = sc.nextLine();
//        System.out.println(s);



//        Scanner s = new Scanner(System.in);
//        System.out.println("Enter your age ");
//        int a = sc.nextInt();
//
//        if (a<=10 && a>1){
//            System.out.println("you are a litte boy ");
//        } else if (a>10 && a<=20) {
//            System.out.println("you are a teenager ");
//        } else if (a>20 && a<30) {
//            System.out.println("you are a young man ");
//
//        } else if (a>30 && a<45) {
//            System.out.println("you are very old");
//        }
//        else{
//            System.out.println("you are senior citizen");
//


      // how to swap two variable valueint
        int a = 15 ;
        int b = 20 ;
        int t = a ;
        a = b ;
        b= t ;


        System.out.println("a = " + a);
        System.out.println("b = " + b);
//now see the value are totaly changed


//        * * * * * *
//          * * * * *
//            * * * *
//             * * *
//               * *
//                 *   print this pattern

        int z = 6 ;
        for (int i = 0 ; i<=6 ; i++){
            for (int j = 6 ; j>=i ; j--){
                System.out.print("*");
            }
            System.out.println();
        }

//                  *
//                * *
//              * * *
//            * * * *
//          * * * * *
//        * * * * * *    print this
        int no = 6 ;

        for (int i = 1 ; i<=n; i++){
            for (int j=0 ; j<=i ; j++){
                System.out.print("");
            }
        }
    }
}
