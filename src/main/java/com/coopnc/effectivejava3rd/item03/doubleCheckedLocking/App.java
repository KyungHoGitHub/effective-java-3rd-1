package com.coopnc.effectivejava3rd.item03.doubleCheckedLocking;

public class App {

    public static void main(){
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton);
    }
}
