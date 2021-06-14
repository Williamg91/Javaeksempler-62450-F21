package org.example.Datamodel;



import org.example.SensorDataModel.DTOs.Sensorparent;
import org.example.SensorDataModel.DTOs.TemperaturesensorDTO;

public interface SensorObservable extends Runnable {
     //Extend Runnable to make a Thread

      void registerSensorObserver(SensorObserver sensorObserver);




}
