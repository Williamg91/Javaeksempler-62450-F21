package org.example;

import javafx.beans.InvalidationListener;
import javafx.beans.Observable;

public class ThreadInterface implements Runnable, ObserverInterface {

    @Override
    public void run() {
        System.out.println(Math.random());
        System.out.println(sensorname);
        //tomstring ="";
    }


    @Override
    public double exampleMethod(int input, int andetInput) {
        return 0;

    }
}
