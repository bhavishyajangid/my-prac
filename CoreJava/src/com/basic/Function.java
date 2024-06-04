package com.basic;

import java.util.Scanner;

public class Function {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // let make  two array and mul all the elements of it
        System.out.println("Enter the size of the first array ");
        int size = sc.nextInt();
        System.out.println("Enter the size of second the array ");
        int size2 = sc.nextInt();


        // here we call the function and stored in an varible
        if (size==size2){
            int multipliyedArray[] = multiply( size , size2);
            for (int num : multipliyedArray){
                System.out.println(num);
            }
        }
        else {
            System.out.println("Plese Enter the same size array ");
        }


        // after we use for each loop to print the value of this array


    }

// NOTE:- scope  function are only written in public function or call in main function

    // syntax of function in java
    //    accessmodifier non access modifier returntype functionname(paramenter){
    // scope
//} // this is the synatax of function

    // function are divide into 6 parts basically

    // type first  is void fucntion
    // viod mean its return type is void mean nothing in return
    // this is void function and its is basically used to print things
    // its does not  return any value
    public static void greet() {
        System.out.println("my name is bhavishay");

    }

// second function is return type function in this fuction we decalre return type of the fucntion
// which type of value are return by this function

    // syntax
    public static int add(int a, int b) {
        return a + b;
    }




//  let see some example of function

// making a function which return the sum of two varible a and b

    public static int sum(int a , int b ){
        return a+b ;
    }


    // let make a function which mul the two array element

    public static int[] multiply(int a , int b ) {


        Scanner sc = new Scanner(System.in);
        int arr1[] = new int[a];
        int arr2[] = new int[b];

        //   input the elements of first  array
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("Enter the first array elements");
            arr1[i] = sc.nextInt();
        }
        //   input the elements of second array
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("Enter the second array elements");
            arr2[i] = sc.nextInt();
        }

        // multiply the both array elements
        // making a new array because the value
        // we get after the multiplication is stored in an array
      int newvalue[] = new int[arr1.length];

        for (int i = 0 ; i<arr1.length;i++) {
            newvalue[i] = arr1[i] * arr2[i];

        }

        // here we return the array which i have stored multipliyed value
        return newvalue ;

    }



}




