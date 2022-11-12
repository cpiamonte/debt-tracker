package com.example.financesoftware;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

import java.io.File;
import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;


public class LoginControl {

    @FXML
    private Button regisButton;

    @FXML
    private TextField passText;

    @FXML
    private Button loginButton;

    @FXML
    private Label forgPass;

    @FXML
    private Label statLabel;

    String[] pass = new String[2];

    //register function
    public void userRegister(ActionEvent event) throws IOException{
        //check if there is a registered user
        File tmpdir = new File("C:\\Users\\BojaDGreat\\IdeaProjects\\financeSoftware\\financeSoftware\\src\\main\\resources\\com\\example\\financesoftware\\account.csv");
        boolean isThere = tmpdir.exists();

        if(isThere){
            regisButton.setDisable(true);
        }
        else {
            regisButton.setDisable(false);
            FinanceSoftware fs = new FinanceSoftware();
            fs.changeScene("regPageView.fxml");
        }
    }

    //login function
    public void loginUser(ActionEvent event) throws IOException{
        Scanner sc = new Scanner(new File("C:\\Users\\BojaDGreat\\IdeaProjects\\financeSoftware\\financeSoftware\\src\\main\\resources\\com\\example\\financesoftware\\account.csv"));
        sc.useDelimiter(",");
        while (sc.hasNext()){
            for(int i = 0; i < 2; i++){
                pass[i] = sc.next();
            }
        }

        if(Objects.equals(pass[0], passText.getText())){
            FinanceSoftware fs = new FinanceSoftware();
            fs.changeScene("landPageView.fxml");
        }
        else{
            statLabel.setOpacity(1);
        }
    }

    //transfer to forget pass view
    public void forgotPassword(ActionEvent event) throws IOException{
        FinanceSoftware fs = new FinanceSoftware();
        fs.changeScene("forgPassView.fxml");
    }

}
