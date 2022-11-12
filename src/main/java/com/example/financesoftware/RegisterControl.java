package com.example.financesoftware;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.io.IOException;


public class RegisterControl {

    @FXML
    private Button regButton;

    @FXML
    private Button backButton;


    public void userRegister(ActionEvent event) throws IOException{
        //to add function for user checking. 1 user per device.
        FinanceSoftware fs = new FinanceSoftware();
        fs.changeScene("loginView.fxml");
    }

    public void back(ActionEvent event) throws IOException{
        FinanceSoftware fs = new FinanceSoftware();
        fs.changeScene("loginView.fxml");
    }

}
