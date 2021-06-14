package org.example.ViewControllers;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.*;

import javafx.scene.control.*;

import org.example.Datamodel.DataGenerators.TemperaturSensorDataGenerator;
import org.example.Datamodel.SensorObserver;
import org.example.ObserverInterface;
import org.example.SensorDataModel.DTOs.TemperaturesensorDTO;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Optional;
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

        new Thread(temperaturSensorDataGenerator).start();
        temperaturSensorDataGenerator.registerSensorObserver(this);


    }

    public void getTextInput(){
        System.out.println("fuccgg DD:");

        //lånt fra https://code.makery.ch/blog/javafx-dialogs-official/
        TextInputDialog dialog = new TextInputDialog("walter");
        dialog.setTitle("Text Input Dialog");
        dialog.setHeaderText("Look, a Text Input Dialog");
        dialog.setContentText("Please enter your name:");

// Traditional way to get the response value.
        Optional<String> result = dialog.showAndWait();
        if (result.isPresent()){
            System.out.println("Your name: " + result.get());
            if(result.get().contains("w")){
                System.out.println("der er W i dit navn");
            }
        }

// The Java 8 way to get the response value (with lambda expression).
        result.ifPresent(name -> System.out.println("Your name: " + name));

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