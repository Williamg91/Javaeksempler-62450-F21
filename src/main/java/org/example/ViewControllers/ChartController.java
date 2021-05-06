package org.example.ViewControllers;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;
import org.example.Datamodel.DTOs.TemperaturesensorDTO;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class ChartController {
    ScheduledExecutorService scheduledExecutorService;

    //material from FXML
    @FXML
    Label valuelabel;
    @FXML
    LineChart<Double, Integer> masterchart;

    @FXML
    CategoryAxis kategoriakse;
    @FXML
    NumberAxis numberaxis;


    //XY series material to be added to the chart:
    XYChart.Series<Double,String> temperatureSeries = new XYChart.Series<>();

    double temperatureMeasurement;
    final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");

// lets have some fun with adding dynamically



    TemperaturesensorDTO dto ;
    private void populateChart(){



    }

    public void startMeasurements(ActionEvent actionEvent) {
       /* series.getData().add(new XYChart.Data(1890.9,20));

        scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
        scheduledExecutorService.scheduleAtFixedRate(() -> {
            // get a random integer between 0-10
            Integer random = ThreadLocalRandom.current().nextInt(10);

            // Update the chart
            Platform.runLater(() -> {
                // get current time
                Date now = new Date();
                // put random number with current time
                masterchart.getData().add(series);
            });
        }, 0, 1, TimeUnit.SECONDS);
*/
    }

}