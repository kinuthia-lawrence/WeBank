package com.larrykin343.webank.Controller.Admin;

import com.larrykin343.webank.Models.Model;
import com.larrykin343.webank.Views.AdminMenuOptions;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class AdminMenuController implements Initializable {
    public Button logoutButton;
    public Button depositButton;
    public Button clientsButton;
    public Button createClientsButton;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        addListeners();
    }

    public void addListeners() {
        createClientsButton.setOnAction(event -> createClientsButtonClicked());
        depositButton.setOnAction(event -> depositButtonClicked());
        clientsButton.setOnAction(event -> clientsButtonClicked());
        logoutButton.setOnAction(event -> logoutButtonClicked());
    }

//! Onclick methods
    private void createClientsButtonClicked() {
        Model.getInstance().getViewFactory().getAdminSelectedMenuItem().set(AdminMenuOptions.CREATE_CLIENT);
    }

    private void depositButtonClicked() {
        Model.getInstance().getViewFactory().getAdminSelectedMenuItem().set(AdminMenuOptions.DEPOSIT);
    }

    private void clientsButtonClicked() {
        Model.getInstance().getViewFactory().getAdminSelectedMenuItem().set(AdminMenuOptions.CLIENTS);
    }

    private void logoutButtonClicked() {
        Stage stage = (Stage) logoutButton.getScene().getWindow();
        stage.close();
    }
}
