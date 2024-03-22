package com.larrykin343.webank.Controller.Client;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class DashboardController implements Initializable {
    @FXML
    private TextField amountTextField;

    @FXML
    private Label checkingAccountNumber;

    @FXML
    private Label checkingBalance;

    @FXML
    private TextArea descriptionTextField;

    @FXML
    private Label expensesLabel;

    @FXML
    private Label incomeLabel;

    @FXML
    private Label loginDate;

    @FXML
    private TextField payeeAddressTextField;

    @FXML
    private Label savingsAccountNumber;

    @FXML
    private Label savingsBalance;

    @FXML
    private Button sendMoneyButton;

    @FXML
    private ListView<?> transactionListView;

    @FXML
    private Text usernameLabel;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        
    }
}
