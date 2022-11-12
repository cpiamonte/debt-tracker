package com.example.financesoftware;

import javafx.event.ActionEvent;

import java.io.IOException;

public class SettingsController {
    public void backMen(ActionEvent event) throws IOException{
        FinanceSoftware fs = new FinanceSoftware();
        fs.changeScene("landPageView.fxml");
    }

    public void logOut(ActionEvent event) throws IOException{
        FinanceSoftware fs = new FinanceSoftware();
        fs.changeScene("loginView.fxml");
    }
}
