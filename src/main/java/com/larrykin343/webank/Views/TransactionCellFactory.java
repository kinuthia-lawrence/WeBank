package com.larrykin343.webank.Views;

import com.larrykin343.webank.Controller.Client.TransactionCellController;
import com.larrykin343.webank.Models.Transaction;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.ListCell;

public class TransactionCellFactory extends ListCell<Transaction> {
    @Override
    protected void updateItem(Transaction transaction, boolean empty) {
        super.updateItem(transaction, empty);
        if(empty){
            setText(null);
            setGraphic(null);
        } else {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Fxml/Client/TransactionCell.fxml"));
            TransactionCellController controller = new TransactionCellController(transaction);
            //declare transaction in TransactionCellController
            loader.setController(controller);
            setText(null);
            try {

                setGraphic(loader.load());
            } catch (Exception e) {
                e.printStackTrace();
                e.getCause();
            }
        }

    }
}
