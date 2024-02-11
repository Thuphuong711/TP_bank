package com.jmc.mazebank.Views;

import com.jmc.mazebank.Controllers.Client.TransactionCellController;
import com.jmc.mazebank.Models.Transaction;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.ListCell;

public class TransactionCellFactory extends ListCell<Transaction> {
    @Override
    protected void updateItem(Transaction transaction, boolean empty) {
        super.updateItem(transaction, empty);
        if (empty) {
            setText(null);
            setGraphic(null);
        } else {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/FXML/Client/TransactionCell.fxml"));
            TransactionCellController transactionCellController = new TransactionCellController(transaction);
            loader.setController(transactionCellController);
            setText(null);
            try{
                setGraphic(loader.load());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

