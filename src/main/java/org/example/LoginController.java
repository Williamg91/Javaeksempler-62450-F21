package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.example.App;
import org.example.Datamodel.DTOs.Sensorparent;
import org.example.Datamodel.DataGenerators.TemperaturSensorDataGenerator;
import org.example.Datamodel.SensorObserver;

import java.io.IOException;
import java.util.Date;

public class LoginController implements SensorObserver {

    @FXML
    TextField loginfelt;

    @FXML
    Label label;

    public void loginshift(ActionEvent actionEvent) throws IOException {
        String userID = loginfelt.getText();
        boolean hasnumbers = userID.matches(".*\\d.*");
        //regex tjekker for tal.
        boolean hasgmail = userID.contains("gmail");

        if(hasnumbers && hasgmail ){
                App.setRoot("TableViewExample");

        }

        if(!hasgmail && !hasnumbers){
            System.out.println("Fejl :(((");
        }


    }

    public void startThread(ActionEvent actionEvent) {
        TemperaturSensorDataGenerator dataGenerator = new TemperaturSensorDataGenerator(39.0,38);
        new Thread(dataGenerator).start();
        dataGenerator.registerSensorObserver(this);
    }

    @Override
    public void notify(Sensorparent sensorDTO) {
        try{
            //what happens when we get a notification from the DTO?
            System.out.println("nyt materiale kl.."+System.currentTimeMillis());
          //  label.setText("Thread last updated at...");
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
