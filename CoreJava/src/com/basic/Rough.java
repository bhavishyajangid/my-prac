package com.basic;



import java.util.Arrays;
import java.util.Scanner;

interface Animal {
    public void eat();
    public void aimalsound();
}
abstract class sameproperties implements Animal{
    String name ;
    int age ;

    public sameproperties(String name , int age){
        this.name = name ;
        this .age  = age;
    }
   abstract public void eat();

   abstract public void aimalsound();


}

class Mammels extends sameproperties{
    public Mammels(String name , int age){
       super(name , age);
    }
     public void eat(){
         System.out.println(name + "this mammle is eating");
     };


     public void aimalsound(){
         System.out.println(name + " is making sound");
     };
}

class Birds extends sameproperties{
    public Birds(String name , int age){
        super(name , age);
    }
    public void eat(){
        System.out.println(name + "this birds is eating");
    };


    public void aimalsound(){
        System.out.println(name + " is making sound");
    };
}
class reptiles extends sameproperties{
    public reptiles(String name , int age){
        super(name , age);
    }
    public void eat(){
        System.out.println(name + "this reptiles is eating");
    };


    public void aimalsound(){
        System.out.println(name + " is making sound");
    };
}



public class Rough {
    public static void main(String[] args) {
        //lets multiply two two element of an array
        Scanner sc = new Scanner(System.in);

        // take first array row or coloum as input

//        System.out.println("enter the number of rows");
//        int rows = sc.nextInt();
//        System.out.println("Enter the number of coloums");
//        int coloums = sc.nextInt();

//         take second array row and coloum as input

        //System.out.println("enter the second array   of rows");
//        int rows2 = sc.nextInt();
        //System.out.println("enter the second array   of rows");
        //int coloums2 = sc.nextInt();

        // making two array

//        int arr1[][] = new int[rows][coloums];
//        int arr2[][] = new int[rows2][coloums2];

        // take first array element as input

//        for (int i =0 ; i<arr1.length ; i++){
//            for (int j =0 ; j<arr1.length ; j++){
//                //System.out.println("Enter the first array element");
//                arr1[i][j]  = sc.nextInt();
//            }
//
//
//        }

        // take second array element as input

//        for (int i =0 ; i<arr2.length ; i++){
//            for (int j =0 ; j<arr2.length ; j++){
//                System.out.println("Enter the second array element");
//                arr2[i][j]  = sc.nextInt();
//            }
//
//        }

        // print there multiplication

//        System.out.println(arr1[0][0] * arr2[0][0]);
//
//        // print all elements present in first array
//         for(int [] i : arr1){
//            for (int j : i){
//                System.out.println(j);
//     }
//             System.out.println();
// }
//        // print all elements present in second array
//          for(int [] i : arr2){
//             for (int j : i){
//               System.out.println(j);







//      }
// }






//        doing a class question in this rough file

Animal mammels = new Mammels("cow" , 20);
Animal birds = new Birds("crow" , 20);
Animal reptiles = new reptiles("crocodile" , 20);

mammels.eat();
mammels.aimalsound();

birds.eat();
birds.aimalsound();

reptiles.eat();
reptiles.aimalsound();











    }


}
