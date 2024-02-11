package com.jmc.mazebank.Controllers.Admin;

import com.jmc.mazebank.Models.Client;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;
public class ClientCellController implements Initializable {
    @FXML
    public Label fName_lbl;
    @FXML
    public Label lName_lbl;
    @FXML
    public Label pAddress_lbl;
    @FXML
    public Label ch_acc_lbl;
    @FXML
    public Label sv_acc_lbl;
    @FXML
    public Label date_lbl;
    @FXML
    public Button delete_btn;

    private final Client client;

    public ClientCellController(Client client) {
        this.client = client;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

}

