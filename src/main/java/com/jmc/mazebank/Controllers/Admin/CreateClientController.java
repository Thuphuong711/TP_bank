package com.jmc.mazebank.Controllers.Admin;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class CreateClientController implements Initializable {

    @FXML
    public TextField fName_fld;
    @FXML
    public TextField lName_fld;
    @FXML
    public TextField password_fld;
    @FXML
    public CheckBox payeeAddress_box;
    @FXML
    public Label payeeAddress_lbl;
    @FXML
    public CheckBox chequing_account_box;
    @FXML
    public TextField chequing_amount_fld;
    @FXML
    public CheckBox savings_account_box;
    @FXML
    public TextField savings_amount_fld;
    @FXML
    public Button create_new_client_btn;
    @FXML
    public Label error_lbl;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}

