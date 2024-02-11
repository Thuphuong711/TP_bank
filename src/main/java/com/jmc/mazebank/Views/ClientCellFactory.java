package com.jmc.mazebank.Views;

import com.jmc.mazebank.Controllers.Admin.ClientCellController;
import com.jmc.mazebank.Models.Client;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.ListCell;

import java.io.IOException;

public class ClientCellFactory extends ListCell<Client> {
    @Override
    protected void updateItem(Client client, boolean empty) {
        super.updateItem(client, empty);
        if (empty) {
            setText(null);
            setGraphic(null);
        } else {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/FXML/Client/ClientCell.fxml"));
            ClientCellController clientCellController = new ClientCellController(client);
            loader.setController(clientCellController);
            setText(null);
            try {
                setGraphic(loader.load());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

