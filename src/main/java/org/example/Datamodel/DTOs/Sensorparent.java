package org.example.Datamodel.DTOs;

public abstract class Sensorparent {


    public Sensorparent() {
        System.out.println("sensor made with nothing");

    }
    private int SensorID;
    protected double upperlimit;

    public double getUpperlimit() {
        return upperlimit;
    }

    public void setUpperlimit(double upperlimit) {
        this.upperlimit = upperlimit;
    }

    public double getLowerlimit() {
        return lowerlimit;
    }

    public void setLowerlimit(double lowerlimit) {
        this.lowerlimit = lowerlimit;
    }

    public double getSimulatedmin() {
        return simulatedmin;
    }

    public void setSimulatedmin(double simulatedmin) {
        this.simulatedmin = simulatedmin;
    }

    protected double lowerlimit;

    public double getSimulatedmax() {
        return simulatedmax;
    }

    public void setSimulatedmax(double simulatedmax) {
        this.simulatedmax = simulatedmax;
    }

    protected double simulatedmax,simulatedmin;

    public String getPortname() {
        return portname;
    }

    public void setPortname(String portname) {
        this.portname = portname;
    }

    protected String portname;

    public Sensorparent(double simulatedMax,double simulatedmin ){
        this.simulatedmax=simulatedMax;
        this.simulatedmin=simulatedmin;


    }
    public Sensorparent(boolean simulated, double upperlimit,double lowerlimit){
        this.lowerlimit=lowerlimit;
        this.upperlimit=upperlimit;
    }



    public int getSensorID() {
        return SensorID;
    }

    public void setSensorID(int sensorID) {
        SensorID = sensorID;
    }
}
