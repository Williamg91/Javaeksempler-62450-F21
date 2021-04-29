package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import org.example.App;

import java.io.IOException;

public class LoginController {

    @FXML
    TextField loginfelt;

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
}
