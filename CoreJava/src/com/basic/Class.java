package com.basic;
 // class always making outer to public class
//class student {
////    String name ;
////     int age  ;
////     char section ;
//
//     // we can define class elements like this
//     String name = "ram";
//     int age = 25 ;
//     char section = 'A' ;
//
// }

class Boys{
    String name ;
    int rollnumber ;

//   public Boys (String name , int rollnumber){
//       this.name = name ;
//       this.rollnumber = rollnumber;
//
//   }
//   public void aclass(){
//       System.out.println("working");
//   }

}

class Girls extends Boys{

    int age ;
    String colour ;

   public Girls (String colour , int age , String name , int rollnumber){
       this.name = name ;
       this.age = age ;
       this.colour = colour;
       this.rollnumber = rollnumber;
   }

   public void main(){
       System.out.println(this.name);
       System.out.println(this.rollnumber);
       System.out.println(this.colour);
       System.out.println(this.age);
   }


}
public class Class  {
    public static void main(String[] args) {
        // now making a object when we make object always make class of the obj
        // syntax :-  className objName  = new className() ;
//            student obj = new student();
//            student obj2 = new student();
        // pass value to obj we define .class value = objvalue
//          obj.name  =  " bhavishya" ;
//          obj.age  = 21 ;
//          obj.section = 'A' ;
          // and we print an obj elements like this
//        System.out.println(obj.name);
//        System.out.println(obj2.name);
//        System.out.println(obj.section);
//     obj2.name = "bhavishya" ;
//        System.out.println(obj.name);
//        System.out.println(obj2.name);

        Boys obj = new Boys();
        Girls obj2 = new Girls("brown" , 20 , "bhavishya" , 50);
        obj2.main();








    }
}
