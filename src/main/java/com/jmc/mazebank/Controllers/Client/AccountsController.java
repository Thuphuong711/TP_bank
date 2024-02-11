package com.jmc.mazebank.Controllers.Client;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class AccountsController implements Initializable {

    @FXML
    public Label chequing_account_number;
    @FXML
    public Label transaction_limit;
    @FXML
    public Label chequing_account_date;
    @FXML
    public Label chequing_account_balance;
    @FXML
    public Label savings_account_number;
    @FXML
    public Label withdrawal_limit;
    @FXML
    public Label savings_account_date;
    @FXML
    public Label savings_account_balance;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}

