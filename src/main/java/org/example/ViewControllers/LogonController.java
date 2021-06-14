package org.example.ViewControllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import org.example.App;

import java.io.IOException;

public class LogonController {



    @FXML
    Button knap;
    @FXML
    TextField felt;
    @FXML
    public void trykPaaKnap(ActionEvent actionEvent) {

        felt.setText("Hej Sille");
        try {
            App.setRoot("chartView");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
