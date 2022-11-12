package com.example.financesoftware;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;


import java.io.IOException;

public class FinanceSoftware extends Application {

    private static Stage stg;

    @Override
    public void start(Stage stage) throws IOException {
        stg = stage;
        Parent root = FXMLLoader.load(getClass().getResource("loginView.fxml"));
        stage.setScene(new Scene(root, 600, 400 ));
        stage.setTitle("Debt Tracker");
        stage.show();
        stage.setResizable(false);

        //functions and scenes to add on next revision:
        //Landing page, Forms for enrolling user, debt tracking
        //Oct 6, updates:
        //Landing page done, forms done, debt tracking partially done.
        //to be created: monthly calc, settings, functionalities and algorithms for user creation
    }

    public void changeScene(String fxml) throws IOException{
        //function to change scenes
        Parent pane = FXMLLoader.load(getClass().getResource(fxml));
        stg.getScene().setRoot(pane);
    }

    public static void main(String[] args) {
        launch(args);
    }
}