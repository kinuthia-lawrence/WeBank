package com.larrykin343.webank.Controller.Client;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class TransactionsController implements Initializable {
    @FXML
    public ListView transactionsListView;
    public ImageView receinvedIcon;
    public ImageView sentIcon;
    public Label transactionDateLabel;
    public Label senderLabel;
    public Label receiverLabel;
    public Label TransactionAmoutLabel;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
