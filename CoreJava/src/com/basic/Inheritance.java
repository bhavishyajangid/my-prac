package com.basic;
//class A {
//    String name ;
//    int age ;
//}
//
//class B extends A {
//    String lastname ;
//    String firstname ;
//
//    public void print(){
//        System.out.println(this.name);
//        System.out.println(this.lastname);
//        System.out.println(this.age);
//        System.out.println(this.firstname);
//    }
//    public B (String name , String lastname , int age , String firstname){
//        this.name = name;
//        this.lastname = lastname ;
//        this.age = age ;
//        this.firstname = firstname;
//    }
//
//}
//
//class C extends A {
//    String address ;
//
//    public C(String name , String address){
//        this.name = name ;
//        this.address = address ;
//    }
//
//    public void result(){
//        System.out.println(this.name);
//        System.out.println(this.address);
//    }
//}

 class Parent{
  String name ;

  public Parent(String name ){
      this.name = name ;
  }
  public void city(){

      System.out.println("i am from jaipur");
  }

}

class Child extends  Parent{
     String lastname ;


     public Child(String name , String lastname ){
         super(name);
         this.lastname = lastname ;
     }
     public void city(){
         System.out.println("i am from ratangarh ");
     }


}
class Grandchild extends Parent{
     int age  ;
     public Grandchild(String name ){
         super(name);
     }
}





public class Inheritance {
    public static void main(String[] args) {
        // this is the example of inheritance which mean parents value excess by this child class
//        B obj = new B("bhavishya", "jangid", 25, "ramu");
//        obj.print();

//        C obj2 = new C("ratangarh" , "bhavishya");
//        obj2.result();

        Parent obj = new Parent("bhavishya");
        Child obj2 = new Child("bhavishya" , "jangid");
        obj2.city();
        obj.city();
        obj2.name = "bhavishay" ;
        obj.name = "ram" ;
        System.out.println(obj.name);
        System.out.println(obj2.name);
        System.out.println(obj2.lastname);

        Grandchild obj3 = new Grandchild("ramu");
        System.out.println(obj3.age);



    }

}




