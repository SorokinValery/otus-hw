package ru.sorokin;

public class Main {
    public static void main(String[] args) {
        MyClassInterface myClass = Ioc.createMyClass();
        myClass.secureAccess("Security Param");
        myClass.secure1();
        myClass.secure2("Hello", 19);
    }
}

