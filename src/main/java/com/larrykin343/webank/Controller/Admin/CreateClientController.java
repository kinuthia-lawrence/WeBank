package com.larrykin343.webank.Controller.Admin;

import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class CreateClientController implements Initializable {
    public TextField firstNameTextField;
    public TextField lastNameTextField;
    public TextField passwordTextField;
    public CheckBox payeeAddressCheckBox;
    public Text payeeAddressLabel;
    public CheckBox checkingAccountCheckBox;
    public TextField CheckingAccountBalanceTextField;
    public CheckBox savngAccountCheckBox;
    public TextField savingAccountBalanceTextField;
    public Button createNewClientButton;
    public Text errorMessageLabel;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
