package com.larrykin343.webank.Controller.Client;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class DashboardController implements Initializable {
    @FXML
    public TextField amountTextField;

    @FXML
    public Label checkingAccountNumber;

    @FXML
    public Label checkingBalance;

    @FXML
    public TextArea descriptionTextField;

    @FXML
    public Label expensesLabel;

    @FXML
    public Label incomeLabel;

    @FXML
    public Label loginDate;

    @FXML
    public TextField payeeAddressTextField;

    @FXML
    public Label savingsAccountNumber;

    @FXML
    public Label savingsBalance;

    @FXML
    public Button sendMoneyButton;

    @FXML
    public ListView<?> transactionListView;

    @FXML
    public Text usernameLabel;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        
    }
}
