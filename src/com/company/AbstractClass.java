package com.company;

public  abstract class  AbstractClass {
    private String name;

    public AbstractClass() {
    }

    public AbstractClass(String name) {
        this.name = name;
    }
    public  void  in(){
        System.out.println("Khong phai ham tra ve");
    }

    public abstract  void count();
}
