package com.larrykin343.webank.Controller.Client;

import com.larrykin343.webank.Models.Client;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class ClientCellController implements Initializable {
    public ImageView receivedIcon;
    public Label firstNameLabel;
    public Label lastNameLabel;
    public Label checkingAccountNumberLabel;
    public Label payeeAddressLabel;
    public Label savingAccountNumberLabel;
    public Label dateCreated;
    public Button deleteButton;
    public ImageView receivedIcon1;



    private final Client client;

    public ClientCellController(Client client) {
        this.client = client;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
