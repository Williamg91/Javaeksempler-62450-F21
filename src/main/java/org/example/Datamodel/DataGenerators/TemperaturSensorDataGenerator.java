package org.example.Datamodel.DataGenerators;

import org.example.Datamodel.DTOs.Sensorparent;
import org.example.Datamodel.DTOs.TemperaturesensorDTO;
import org.example.Datamodel.SensorObservable;
import org.example.Datamodel.SensorObserver;

import java.util.ArrayList;

public class TemperaturSensorDataGenerator implements SensorObservable {

    //We made it implement the Observable so we can have more than one type of data, and others observe
    //the data being created.



    private ArrayList<SensorObserver> sensorObservers = new ArrayList<>();


    @Override
    public void run() {
        while(true){
            //create a
            Sensorparent temperaturesensorDTO = new TemperaturesensorDTO();


            if(sensorObservers!=null){
                for( SensorObserver o: sensorObservers){
                    o.notify(temperaturesensorDTO);
                    //
                }
            }

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }



    }

    @Override
    public void registerSensorObserver(SensorObserver sensorObserver) {
        sensorObservers.add(sensorObserver);

    }
}
