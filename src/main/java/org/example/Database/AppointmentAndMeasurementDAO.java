package org.example.Database;

import org.example.SensorDataModel.DTOs.TemperaturesensorDTO;

import java.util.ArrayList;
import java.util.Date;

interface AppointmentAndMeasurementDAO {
    //For implementing to the Database - Use it to
    void saveTemperatureMeasurements(TemperaturesensorDTO temperaturesensorDTO, int Patientid);
    void saveAppointment(int PatientID, int AppointmentID);

     ArrayList<Double> getTemperaturemeasurementsFromAppointment(int PatientID, int AppointmentID);
    ArrayList<Integer> getPulsemeasurementsFromAppointment(int PatientID, int AppointmentID);
    ArrayList<Date> getAppointmentFromID(int appID, int PatientID);

}
