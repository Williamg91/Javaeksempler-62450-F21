package org.example;

public class ThreadClass extends Thread{

    @Override
    public void run(){

        System.out.println("hello from"+Thread.currentThread().getName());

    }
}
