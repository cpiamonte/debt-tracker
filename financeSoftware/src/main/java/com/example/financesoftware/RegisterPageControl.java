package com.example.financesoftware;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import java.io.IOException;
import java.io.PrintWriter;

public class RegisterPageControl {

    @FXML
    private TextField passTextField;

    @FXML
    private TextField secTextField;

    @FXML
    private Label regLabel;


    public void retMenu(ActionEvent event) throws IOException{
        FinanceSoftware fs = new FinanceSoftware();
        fs.changeScene("loginView.fxml");
    }

    public void regisUser(ActionEvent event) throws IOException{
        String pass = passTextField.getText();
        String sec = secTextField.getText();
        try{
            PrintWriter pw = new PrintWriter("C:\\Users\\BojaDGreat\\IdeaProjects\\financeSoftware\\financeSoftware\\src\\main\\resources\\com\\example\\financesoftware\\account.csv");
            StringBuilder sb = new StringBuilder();

            sb.append(pass);
            sb.append(",");
            sb.append(sec);


            pw.write(sb.toString());
            pw.close();

            regLabel.setOpacity(1.0);

        } catch (Exception e){
            System.out.print(e);
        }
    }
}
