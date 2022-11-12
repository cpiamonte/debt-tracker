package com.example.financesoftware;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;


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
        stage.getIcons().add(new Image("C:\\Users\\BojaDGreat\\IdeaProjects\\financeSoftware\\financeSoftware\\src\\main\\resources\\com\\example\\financesoftware\\finance-png-20994.png"));

        //functions and scenes to add on next revision:
        //Landing page, Forms for enrolling user, debt tracking
        //Oct 6, updates:
        //Landing page done, forms done, debt tracking partially done.
        //to be created: monthly calc, settings, functionalities and algorithms for user creation
        //Oct 15 updates:
        //Monthly Calc done, settings done, search client partially done; edit and delete client needed to be implemented
        //to be created: DATABASE (MySQL or Oracle)

        //Oct 19 Update:
        //to add infos and variables for values.
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