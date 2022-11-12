package com.example.financesoftware;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import java.io.IOException;

public class LandPageControl {

    @FXML
    private Label dateTime;

    public void addClient(ActionEvent event) throws IOException{
        FinanceSoftware fs = new FinanceSoftware();
        fs.changeScene("newEnrollPage.fxml");
    }

    public void searchClient(ActionEvent event) throws IOException{
        FinanceSoftware fs = new FinanceSoftware();
        fs.changeScene("searchClientPage.fxml");
    }

    public void monthlyCalcu(ActionEvent event) throws IOException{
        FinanceSoftware fs = new FinanceSoftware();
        fs.changeScene("monthCalcuView.fxml");
    }

    public void goSettings(ActionEvent event) throws IOException{
        FinanceSoftware fs = new FinanceSoftware();
        fs.changeScene("Settings.fxml");
    }
}
