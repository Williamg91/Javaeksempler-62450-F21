package org.example.Database;

import org.example.Datamodel.DTOs.TemperaturesensorDTO;

import java.sql.Connection;
import java.util.ArrayList;

public class DBAccess implements AppointmentAndMeasurementDAO {
Connection conn;
    public DBAccess(Connection connection){
this.conn=connection;

    }




    @Override
    public void saveTemperatureMeasurements(TemperaturesensorDTO temperaturesensorDTO, int Patientid) {

    }



    @Override
    public void saveAppointment(int PatientID, int AppointmentID) {

    }

    @Override
    public ArrayList getTemperaturemeasurementsFromAppointment(int PatientID, int AppointmentID) {
        return null;
    }

    @Override
    public ArrayList getPulsemeasurementsFromAppointment(int PatientID, int AppointmentID) {
        return null;
    }

    @Override
    public ArrayList getAppointmentFromID(int appID, int PatientID) {
        return null;
    }
}
