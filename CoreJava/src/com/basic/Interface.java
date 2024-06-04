package com.basic;
interface M {
     void A();
     void B();

}
  interface N{
    void C();
    void D();


  }

  abstract  class O implements M , N{
     public  void A(){
         System.out.println("this is A method and O abstract class");
     }

  }
  class P extends O{
     public void B(){
         System.out.println("this is b method of m class");
     }
     public void C(){
         System.out.println("this is C method of N class");
     }
     public void D(){
         System.out.println("this is D method of O class");
     }
  }


public class Interface {
    public static void main(String[] args) {
         P obj = new P();
         obj.B();

        M obj3 = new P();
        obj3.A();

         N obj2 = new P();
         obj2.C();

         O obj4 = new P();
         obj4.D();
    }
}
