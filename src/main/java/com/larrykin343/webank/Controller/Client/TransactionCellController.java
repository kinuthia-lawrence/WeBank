package com.larrykin343.webank.Controller.Client;

import com.larrykin343.webank.Models.Transaction;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class TransactionCellController implements Initializable {
    public ImageView receivedIcon;
    public ImageView sentIcon;
    public Label transactionDateLabel;
    public Label senderLabel;
    public Label receiverLabel;
    public Label TransactionAmountLabel;

    private final Transaction transaction;

    public TransactionCellController(Transaction transaction) {
        this.transaction = transaction;
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
