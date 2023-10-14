package com.finalproject;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
 
public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Appointment Scheduler");
        
        //create main gridpane layout
        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(10,10,10,10));

        //customer name
        Label customerLabel = new Label("Customer Information:");
        grid.add(customerLabel,0,0);
        
        TextField customerNameField = new TextField();
        customerNameField.setPromptText("Customer Name");
        grid.add(customerNameField,0,1);

        Label stylistLabel= new Label("Stylist and Service:");
        grid.add(stylistLabel,1,0);

        //stylists and what services they will do
        ComboBox<String> stylistComboBox = new ComboBox<>();
        stylistComboBox.getItems().addAll("Jessica-Haircut","Sam-Haircut","Beth-Haircut",
         "Jessica-Color", "Sam-Color", "Beth-Color", "Jessica-Hightlight",
         "Sam-Highlight", "Beth-Highlight");

        stylistComboBox.setValue("Jessica-Haircut");
        grid.add(stylistComboBox,1,1);

        //appointment time
        Label timeLabel = new Label("Appointment Time:");
        grid.add(timeLabel,2,0);

        TextField timeField = new TextField();
        timeField.setPromptText("Time: MM/DD HH:MM");
        grid.add(timeField,2,1);

        //appointment list
        ListView<String> appointmentList = new ListView<>();
        grid.add(appointmentList, 0, 2 ,3, 1);

        //button for adding appointments
        Button addAppointmentButton = new Button("Add Appointment");
        addAppointmentButton.setOnAction(event -> {
            String customerName = customerNameField.getText();
            String stylistService = stylistComboBox.getValue();
            String time = timeField.getText();

            String appointment = customerName + " with " + stylistService + " at " + time;
            appointmentList.getItems().add(appointment);

            //clear fields after adding appointment
            customerNameField.clear();
            timeField.clear();
        });
        grid.add(addAppointmentButton,0,3,3,1);
        
        Scene scene = new Scene(grid,600,400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}