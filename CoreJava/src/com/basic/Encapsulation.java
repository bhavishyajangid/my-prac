package com.basic;

class Student {
    private int rollnumber ;
    private String name ;

    public void setId(int rollnumber){
      this.rollnumber = rollnumber ;
    }
    public int getId(){
        return this.rollnumber;
    }

    public void setName(String name ){
         this.name = name ;
    }
    public String getName(){
        return this.name ;
    }



}

public class Encapsulation {
    public static void main(String[] args) {

        Student s = new Student();
        s.setName("bhavishya");
        System.out.println(s.getName());

    }
}
