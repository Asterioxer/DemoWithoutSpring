package org.example;

public class Dev {

    //private Laptop laptop;
    private Computer comp;
    //private int age;

    public Dev() {
        System.out.println("Dev constructor");
    }



//    public Dev(int age) {
//        this.age = age;
//        System.out.println("Dev 1 constructor");
//    }

//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }

//    public Laptop getLaptop() {
//        return laptop;
//    }
//
//    public void setLaptop(Laptop laptop) {
//        this.laptop = laptop;
//    }


    public Computer getComp() {
        return comp;
    }

    public void setComp(Computer comp) {
        this.comp = comp;
    }

//    public Dev(Laptop laptop) {
//        this.laptop = laptop;
//        System.out.println("Dev 1 constructor");
//    }

    public void build() {
        System.out.println("working on Awesome Project");
        comp.compile();
    }
}