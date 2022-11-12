package com.example.financesoftware;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import java.io.IOException;

public class RegisterPageControl {
    public void retMenu(ActionEvent event) throws IOException{
        FinanceSoftware fs = new FinanceSoftware();
        fs.changeScene("loginView.fxml");
    }
}
