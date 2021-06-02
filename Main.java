package com.company;

public class Main {

    public static void main(String[] args) {

        //FirstOne firstOne = new FirstOne();//error - no object creation

        FirstOne firstOne = FirstOne.CreateInstance();

        firstOne.SomeFunction();

        FirstOne SecondOne = FirstOne.CreateInstance();//null

        SecondOne.SomeFunction();//error

    }
}
