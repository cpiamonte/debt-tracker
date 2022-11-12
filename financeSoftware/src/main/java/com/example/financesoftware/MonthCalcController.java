package com.example.financesoftware;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.io.IOException;
import java.net.URL;
import java.text.DecimalFormat;
import java.util.Objects;
import java.util.ResourceBundle;

public class MonthCalcController {

    @FXML
    private TextField loanTextField;

    @FXML
    private Label amountLabel;

    @FXML
    private Label termLabel;

    @FXML
    private Label dailyLabel;

    private static final DecimalFormat df = new DecimalFormat("0.00");

    @FXML
    private MenuButton termChoice;

    public void backMenu(ActionEvent event) throws IOException{
        FinanceSoftware fs = new FinanceSoftware();
        fs.changeScene("landPageView.fxml");
    }


    public void term3Func(ActionEvent event) throws IOException{
        try {
            String tfText = loanTextField.getText();
            int totAmount = Integer.parseInt(tfText);
            amountLabel.setOpacity(1);
            amountLabel.setText(loanTextField.getText());
            termLabel.setOpacity(1);
            termLabel.setText("3 Months/90 Days");
            dailyLabel.setOpacity(1);
            dailyLabel.setText("Daily Rate: "+df.format(((totAmount*0.25)+totAmount)/90));
            termChoice.setText("3 Months/90 Days");
        }
        catch (NumberFormatException nf){
            amountLabel.setOpacity(1);
            amountLabel.setText("Error");
            termLabel.setOpacity(1);
            termLabel.setText("3 Months/90 Days");
            dailyLabel.setOpacity(1);
            dailyLabel.setText("Error");
            termChoice.setText("3 Months/90 days");
        }
    }

    public void term5Func(ActionEvent event) throws IOException{
        try {
            String tfText = loanTextField.getText();
            int totAmount = Integer.parseInt(tfText);
            amountLabel.setOpacity(1);
            amountLabel.setText(loanTextField.getText());
            termLabel.setOpacity(1);
            termLabel.setText("5 Months/150 Days");
            dailyLabel.setOpacity(1);
            dailyLabel.setText("Daily Rate: "+df.format(((totAmount*0.30)+totAmount)/150));
            termChoice.setText("5 Months/150 days");
        }
        catch (NumberFormatException nf){
            amountLabel.setOpacity(1);
            amountLabel.setText("Error");
            termLabel.setOpacity(1);
            termLabel.setText("5 Months/150 Days");
            dailyLabel.setOpacity(1);
            dailyLabel.setText("Error");
            termChoice.setText("5 Months/150 days");
        }
    }
}
