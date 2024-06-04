package com.basic;

public class Poly {
    public static void main(String[] args) {
//        A1 a = new A1();
//        System.out.println(a.add(1,2));
////        System.out.println(a.add(1,2,3));
//        System.out.println(a.add(1.3f,8.9f));
//        a.greet();
//        A1 a1 = new B1();
//        a1.greet();

        Shapes shapes = new Shapes();
        shapes.calculateArea(10 , 12);
        Shapes rectangele  = new Rectangele();
        Shapes square  = new Square();
        rectangele.calculateArea(10 , 12)  ;
//        square.

    }


}






class A1{
    public int add(int a, int b){
        return a+b;
    }

    public int add(int a, int b, int c){
        return a+b+c;
    }

    public float add(float a,float b){
        return a+b;
    }

    public void greet(){
        System.out.println("Hello from A1");
    }
}

class B1 extends A1{
    @Override
    public void greet() {
        System.out.println("Hello from B1");
    }
}

class Shapes{
    public int calculateArea(int a , int b){
        return a + b;
    }
}

class Rectangele extends Shapes{
    @Override
    public int calculateArea(int a , int b){
        return a * b ;
    }
}

class Square  extends Shapes{

    public int calculateArea(int side){
        return side * side ;
    }
}