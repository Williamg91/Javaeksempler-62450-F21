package org.example.Datamodel;

public interface SensorObservable extends Runnable {
     //Extend Runnable to make a Thread
     public void registerSensorObserver(SensorObserver sensorObserver);




}
