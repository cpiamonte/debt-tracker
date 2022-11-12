package com.example.financesoftware;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class ForgetPassControl {

    @FXML
    private TextField secWordTextField;

    @FXML
    private Label statLabel;

    @FXML
    private TextField passTextField;

    @FXML
    private TextField confPassTextField;


    String[] secPass = new String[2];

    public void forgPass() throws FileNotFoundException {
        Scanner sc = new Scanner(new File("C:\\Users\\BojaDGreat\\IdeaProjects\\financeSoftware\\src\\main\\resources\\com\\example\\financesoftware\\account.csv"));
        sc.useDelimiter(",");
        while (sc.hasNext()){
            for(int i = 0; i < 2; i++){
                secPass[i] = sc.next();
            }
        }

        boolean found = Arrays.stream(secPass).anyMatch(t -> t.equals(secWordTextField.getText()));

        //checks if secret password is the same in database
        //also checks if passTextField does match with confPassTextField
        if(found){
            if(passTextField.getText().equals(confPassTextField.getText())) {
                statLabel.setText("Password Successfully Changed!");
                statLabel.setOpacity(1);
                statLabel.setLayoutX(187);
                String newPass = passTextField.getText();
                try {
                    PrintWriter pw = new PrintWriter("C:\\Users\\BojaDGreat\\IdeaProjects\\financeSoftware\\src\\main\\resources\\com\\example\\financesoftware\\account.csv");
                    StringBuilder sb = new StringBuilder();

                    sb.append(newPass);
                    sb.append(",");
                    sb.append(secPass[1]);

                    pw.write(sb.toString());
                    pw.close();
                } catch (Exception e) {
                    statLabel.setText("Something went wrong.");
                }
            }
            else{
                statLabel.setText("New Password does not match! Please try again!");
            }
        }
        else{
            statLabel.setOpacity(1);
        }
    }
    public void retMenu(ActionEvent event) throws IOException{
        FinanceSoftware fs = new FinanceSoftware();
        fs.changeScene("loginView.fxml");
    }
}
