package com.jmc.mazebank.Controllers.Admin;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class DepositController implements Initializable {
    @FXML
    public TextField pAddress_fld;
    @FXML
    public Button search_btn;
    @FXML
    public ListView result_listview;
    @FXML
    public TextField amount_fld;
    @FXML
    public Button deposit_btn;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}

