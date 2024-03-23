package com.larrykin343.webank.Controller.Client;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class AccountsController implements Initializable {
    @FXML
    public Label checkingAccountNumber;
    @FXML
    public Label checkingTransactionLimit;
    @FXML
    public Label checkingDateCreated;
    @FXML
    public Label checkingBalance;
    @FXML
    public Label savingAccountNumber;
    @FXML
    public Label savingTransactionLimit;
    @FXML
    public Label savingDateCreated;
    @FXML
    public Label savingAccountBalance;
    @FXML
    public TextField transferToSavingTextField;
    @FXML
    public Button transferToSavingButton;
    @FXML
    public TextField transferToCheckingTextField;
    @FXML
    public Button transferToCheckingButton;
    @FXML

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
