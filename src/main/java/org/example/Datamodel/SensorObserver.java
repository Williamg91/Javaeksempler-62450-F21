package org.example.Datamodel;

import org.example.Datamodel.DTOs.Sensorparent;
import org.example.Datamodel.DTOs.TemperaturesensorDTO;

public interface SensorObserver {
    void notify(TemperaturesensorDTO sensorDTO);
}
