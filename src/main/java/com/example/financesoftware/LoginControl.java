package com.example.financesoftware;

import javafx.beans.property.SimpleObjectProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.io.IOException;


public class LoginControl {

    @FXML
    private Button regisButton;

    @FXML
    private Button loginButton;

    @FXML
    private Button forgPass;

    public void userRegister(ActionEvent event) throws IOException{
        //to add function for user checking. 1 user per device.
        FinanceSoftware fs = new FinanceSoftware();
        fs.changeScene("regPageView.fxml");
    }

    public void loginUser(ActionEvent event) throws IOException{
        FinanceSoftware fs = new FinanceSoftware();
        fs.changeScene("landPageView.fxml");

    }

    public void forgotPassword(ActionEvent event) throws IOException{
        FinanceSoftware fs = new FinanceSoftware();
        fs.changeScene("forgPassView.fxml");
    }



}
