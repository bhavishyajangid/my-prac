package com.basic;

abstract class Cars {
    String carname ;
    abstract public void make();

    public void bmw(){
        System.out.println("this is bmw car");
    }

}

class Bikes extends Cars{
    String bikename ;
    public void make(){
        System.out.println("this is Cars class make function");
    }
    public void ninja(){
        System.out.println("this is ninja");
    }
}

class Auto extends Cars {
    public void make(){
        System.out.println("this is Cars class make function");
    }
}

interface Test{
    public void hello();
    default void hi(){
        System.out.println("default is running");
    }



}

class G implements Test{
    public void hello(){
        System.out.println("interface class");
    };

}



public class Abstract {
    public static void main(String[] args) {
        Bikes obj = new Bikes();
        obj.bikename = "ktm" ;
        obj.make();
        obj.ninja();
        obj.bmw();

        Cars obj2 = new Bikes() ; // transfer bikes class obj to card class
        // but its only use which methods which are present in cars class
        obj2.carname = "mercedese" ;
       obj2.make();
       obj2.bmw();

        G obj3 = new G();
       Test t = new G();
       t.hi();





    }
}
