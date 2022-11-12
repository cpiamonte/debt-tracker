package com.example.financesoftware;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.io.IOException;
import java.sql.*;

public class NewEnrollController {

    @FXML
    private TabPane tbMain;

    @FXML
    private Tab tbInfo;

    @FXML
    private Tab tbRef;

    @FXML
    private Tab tbTerms;

    @FXML
    private Tab tbLoanInfo;

    @FXML
    private Label statLabel;

    private int clientNum = 0;

    @FXML
    private TextField firstNameTextField;

    @FXML
    private TextField lastNameTextField;

    @FXML
    private TextField ageTextField;

    @FXML
    private DatePicker dobTextField;

    @FXML
    private TextField addrTextField;

    @FXML
    private TextField fatherNameTextField;

    @FXML
    private TextField motherNameTextField;

    @FXML
    private TextField phoneNumTextField;

    @FXML
    private TextField telNumTextField;

    @FXML
    private TextField emailTextField;

    @FXML
    private TextField firstNameRefTextField;

    @FXML
    private TextField lastNameRefTextField;

    @FXML
    private TextField contRefTextField;

    @FXML
    private TextField refAddTextField;

    @FXML
    private TextField totAmountTextField;

    @FXML
    private MenuButton termMenuBut;

    @FXML
    private CheckBox checkAgree;

    @FXML
    private Button regButton1;

    @FXML
    private Label dailyLabel;

    @FXML
    private Label totLabel;

    @FXML
    private Label monthLabel;

    @FXML
    private Label intRateLabel;


    //ADD TABLES AND FX ID ALSO FOR TEXTFIELDS
    //October 19 update: FX ID ADDED FOR TEXTFIELDS IN FXML FILE (newEnrollPage)

    public void backMen(ActionEvent event) throws IOException {
        FinanceSoftware fs = new FinanceSoftware();
        fs.changeScene("landPageView.fxml");
    }

    public void nextTabRef(ActionEvent event) throws IOException{
        tbMain.getSelectionModel().select(tbRef);
    }

    public void nextTabTerm(ActionEvent event) throws IOException{

        tbMain.getSelectionModel().select(tbTerms);

        //taking values in textfields
        //total amount value:


        //updating info on next tab.
        totLabel.setText(""+totAmountTextField.getText());
        totLabel.setOpacity(1);

    }

    public void month3TermLabelChange(ActionEvent event) throws IOException {

        double dailyPayment = 0;
        try {
            double parsedTotAmount = Double.parseDouble(totAmountTextField.getText());
            dailyPayment = ((parsedTotAmount * 0.25) + parsedTotAmount) / 90;
        } catch (Exception e) {
            Alert alert = new Alert(Alert.AlertType.ERROR,"Please fill out the necessary information");
            alert.show();
        }

        monthLabel.setText("90 Days");
        dailyLabel.setText("" + dailyPayment);
    }
    public void month5TermLabelChange(ActionEvent event) throws IOException{

        double dailyPayment = 0;
        try {
            double parsedTotAmount = Double.parseDouble(totAmountTextField.getText());
            dailyPayment = ((parsedTotAmount * 0.30) + parsedTotAmount) / 150;
        } catch (Exception e) {
            Alert alert = new Alert(Alert.AlertType.ERROR,"Please fill out the necessary information");
            alert.show();
        }

        intRateLabel.setText("30%");
        monthLabel.setText("150 Days");
        dailyLabel.setText(""+dailyPayment);
    }

    public void nextTabLoan(ActionEvent event) throws IOException{
        tbMain.getSelectionModel().select(tbLoanInfo);
    }

    public void backTabRef(ActionEvent event) throws IOException{
        tbMain.getSelectionModel().select(tbRef);
    }

    public void backLoanInfo(ActionEvent event) throws IOException{
        tbMain.getSelectionModel().select(tbLoanInfo);
    }

    public void backTabInfo(ActionEvent event) throws IOException{
        tbMain.getSelectionModel().select(tbInfo);
    }

    public void enrollUser(ActionEvent event) throws IOException {
        String myUrl = "jdbc:mysql://localhost:3306/financesoftwaredb";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(myUrl, "root", "@JohnBoja123");
            String sql = "INSERT INTO clients (client_number, first_name, last_name, age, dob, address, father_name, mother_name, phone_number, tel_number, email, ref_first_name, ref_last_name, ref_contact, ref_address, tot_loan, term)"+" values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement preparedStmt = conn.prepareStatement(sql);

            preparedStmt.setInt (1, clientNum++);
            preparedStmt.setString (2, firstNameTextField.getText());
            preparedStmt.setString (3, lastNameTextField.getText());
            preparedStmt.setInt (4, Integer.parseInt(ageTextField.getText()));
            preparedStmt.setDate (5, Date.valueOf(dobTextField.getValue()));
            preparedStmt.setString (6, addrTextField.getText());
            preparedStmt.setString (7, fatherNameTextField.getText());
            preparedStmt.setString (8, motherNameTextField.getText());
            preparedStmt.setString (9, phoneNumTextField.getText());
            preparedStmt.setString (10, telNumTextField.getText());
            preparedStmt.setString (11, emailTextField.getText());
            preparedStmt.setString (12, firstNameRefTextField.getText());
            preparedStmt.setString (13, lastNameRefTextField.getText());
            preparedStmt.setString (14, contRefTextField.getText());
            preparedStmt.setString (15, refAddTextField.getText());
            preparedStmt.setInt (16, Integer.parseInt(totAmountTextField.getText()));
            preparedStmt.setString (17, termMenuBut.getText());

            preparedStmt.execute();

            conn.close();
        } catch (SQLException e) {
            System.err.println("Got an exception!");
            e.printStackTrace();
            System.out.println(e);
        }
    }

    public void clientAgree(ActionEvent event) throws IOException{
        if(checkAgree.isSelected()){
            regButton1.setDisable(false);
        }
        else {
            regButton1.setDisable(true);
        }
    }
}
