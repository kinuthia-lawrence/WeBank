package com.larrykin343.webank.Controller.Client;

import com.larrykin343.webank.Models.Model;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class ClientMenuController implements Initializable {
    public Button dashboardButton;
    public Button transactionButton;
    public Button accountsButton;
    public Button profileButton;
    public Button logoutButton;
    public Button reportButton;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        addListeners();
    }

    private void addListeners() {
        dashboardButton.setOnAction(event -> onDashboard());
        transactionButton.setOnAction(event -> onTransactions());
        accountsButton.setOnAction(event -> onAccount());
        logoutButton.setOnAction(event -> logoutButtonClicked());

    }

    private void onAccount() {
        Model.getInstance().getViewFactory().getClientSelectedMenuItem().set("Accounts");
    }


    private void onTransactions() {
        Model.getInstance().getViewFactory().getClientSelectedMenuItem().set("Transactions");
    }

    private void onDashboard() {
        Model.getInstance().getViewFactory().getClientSelectedMenuItem().set("Dashboard");

    }
//! LoginOut the client controller
    private void logoutButtonClicked() {
        Stage stage = (Stage) logoutButton.getScene().getWindow();
        stage.close();
    }
}
