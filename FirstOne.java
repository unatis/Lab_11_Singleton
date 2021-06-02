package com.company;

public class FirstOne {

    private static boolean flgExist = false;

    private FirstOne (){}//lock cunstructor using We will not be able to create an object of the class Only inner function can see and call private function

    public static FirstOne CreateInstance(){

        if(!flgExist){
            flgExist = true;

            FirstOne Instance = new FirstOne();

            return Instance;
        }else{

            System.out.println("Object already exists");
            return null;
        }

    }

    public void SomeFunction(){

        System.out.println("Hello Singleton");

    }

}
