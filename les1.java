package com.company;

public static void pause(int ms) {
    try {
        Thread.sleep(ms);
    } catch (InterruptedException e) {
        System.err.format("IOException: %s%n", e);
    }
}

class begin() {
    public static void StaticMethod() {
        System.out.print("loop started"); 
    }
}

class midden() {
    public static void StaticMethod() {
        for (i = 0; i < 10; i++) {
            System.out.print("loop ", i); 
        }
    }   
}

class eind() {
    public static void StaticMethod() {
        System.out.print("loop finished"); 
    }
}

public class main() {
    public static void main(String[] args) {
        begin();
        midden();
        eind();
    }
}
