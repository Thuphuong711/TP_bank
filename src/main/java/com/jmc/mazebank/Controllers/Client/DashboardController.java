package com.jmc.mazebank.Controllers.Client;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class DashboardController implements Initializable {
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    @FXML
    public Text user_name;
    @FXML
    public Label login_date;
    @FXML
    public Label checking_bal;
    @FXML
    public Label checking_acc_num;
    @FXML
    public Label savings_bal;
    @FXML
    public Label savings_acc_num;
    @FXML
    public Label income_lbl;
    @FXML
    public Label expense_lbl;
    @FXML
    public ListView transaction_listview;
    @FXML
    public TextField payee_fld;
    @FXML
    public TextField amount_fld;
}

