package org.example.ViewControllers;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.*;

import javafx.scene.control.*;
import org.example.Datamodel.DTOs.*;
import org.example.Datamodel.DTOs.TemperaturesensorDTO;
import org.example.Datamodel.DataGenerators.TemperaturSensorDataGenerator;
import org.example.Datamodel.SensorObserver;
import org.example.ObserverInterface;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.*;

public class ChartController implements SensorObserver {
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





TemperaturSensorDataGenerator temperaturSensorDataGenerator = new TemperaturSensorDataGenerator();


    @FXML
    private void populateChart(){
        System.out.println("fuccgg DD:");

        new Thread(temperaturSensorDataGenerator).start();
        temperaturSensorDataGenerator.registerSensorObserver(this);


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

    @Override
    public void notify(TemperaturesensorDTO sensorDTO) {
        System.out.println(sensorDTO.getSimulatedValue());

    }
}