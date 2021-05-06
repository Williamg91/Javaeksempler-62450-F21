package org.example.ViewControllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.control.Label;
import org.example.Datamodel.DTOs.Sensorparent;
import org.example.Datamodel.SensorObserver;

public class ChartController implements SensorObserver {

    @FXML
    Label valuelabel;

    @FXML
    LineChart masterchart;

    @FXML
    CategoryAxis kategoriakse;
    @FXML
    NumberAxis numberaxis;




    public void startMeasurements(ActionEvent actionEvent) {


    }

    @Override
    public void notify(Sensorparent sensorDTO) {



    }
}
