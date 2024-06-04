package com.oops;

public class CloneEx {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student s1 = new Student("Rahul");
        Student s2 = (Student)s1.clone();
        System.out.println(s1.name);
        System.out.println((s2.name));
    }
}

class Student implements  Cloneable{
    String name;

    public Student(String name){
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
