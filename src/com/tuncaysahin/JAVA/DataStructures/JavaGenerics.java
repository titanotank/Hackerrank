package com.tuncaysahin.JAVA.DataStructures;

public class JavaGenerics {

    class Printer
    {
        //Write your code here
        public <E> void printArray(E[] array){
            for(E e: array){
                System.out.println(e);
            }
        }

    }

}
