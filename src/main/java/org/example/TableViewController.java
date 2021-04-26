package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.*;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import org.example.App;
import org.example.Datamodel.Appointment;
import org.example.Datamodel.Person;


public class TableViewController {

    @FXML
    TableView tableview;
    @FXML
    TextField cprsogefelt;

    @FXML
    TableColumn<Appointment,String> idColumn = new TableColumn<>();
    @FXML
    TableColumn<Appointment,String> dateColumn = new TableColumn<>();;
    @FXML
    TableColumn<Appointment,String> typeColumn = new TableColumn<>();;



    public TableViewController(){

construct();

    }

    private void construct() {

        idColumn.setCellValueFactory(new PropertyValueFactory<>("ID"));
        dateColumn.setCellValueFactory(new PropertyValueFactory<>("timestamp"));
        typeColumn.setCellValueFactory(new PropertyValueFactory<>("type"));


    }


    public void findAppointmentsByCPR(ActionEvent actionEvent) {
        if(cprsogefelt.getText().length()==11 && cprsogefelt.getText().indexOf("-")==6){
            //cpr valid
            System.out.println("CPR Valid");

        }
    }
}
