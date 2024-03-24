package com.larrykin343.webank.Controller.Admin;

import com.larrykin343.webank.Models.Model;
import javafx.fxml.Initializable;
import javafx.scene.layout.BorderPane;

import java.net.URL;
import java.util.ResourceBundle;

public class AdminController implements Initializable {
    public BorderPane admin_parent;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Model.getInstance().getViewFactory().getAdminSelectedMenuItem().addListener((observable, oldVal, newVal )-> {
            switch(newVal){
                case"Deposit" -> admin_parent.setCenter(Model.getInstance().getViewFactory().getCreateClientView());
                case"Clients" -> admin_parent.setCenter(Model.getInstance().getViewFactory().getCreateClientView());
                default -> admin_parent.setCenter(Model.getInstance().getViewFactory().getCreateClientView());
            }
        });

    }
}
