package com.tw.codher.kotlin.codher03;

public class TypeSafetyJava {

    private String testStr;

    private void printFirstChar() {
        char firstChar = testStr.charAt(0);
        System.out.println("First char is: " + firstChar);
    }

    public static void main(String[] args){
        TypeSafetyJava obj = new TypeSafetyJava();
        obj.printFirstChar();
    }
}

//This would produce NPE

//Because
// 1. Missed initializing the value of testStr
// 2. Missed nullcheck before accessing testStr
// Kotlin takes care of null safety at compile time itself