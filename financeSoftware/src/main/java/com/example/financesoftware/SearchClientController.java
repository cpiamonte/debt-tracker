package com.example.financesoftware;

import javafx.event.ActionEvent;

import java.io.IOException;

public class SearchClientController {
    public void newClient(ActionEvent event) throws IOException{
        FinanceSoftware fs = new FinanceSoftware();
        fs.changeScene("newEnrollPage.fxml");
    }
    public void backMenu(ActionEvent event) throws IOException{
        FinanceSoftware fs = new FinanceSoftware();
        fs.changeScene("landPageView.fxml");
    }

    //to add delete function

    //to add edit function which transfers user to newEnrollPage scene with the client's information
}
