package com.jmc.mazebank.Controllers;

import com.jmc.mazebank.Models.Model;
import com.jmc.mazebank.Views.AccountType;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {
    @FXML
    public ChoiceBox<AccountType> acc_selector;
    @FXML
    public Label payee_address_lbl;
    @FXML
    public TextField payee_address_fld;
    @FXML
    public TextField password_fld;
    @FXML
    public Button login_btn;
    @FXML
    public Label error_lbl;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        acc_selector.setItems(FXCollections.observableArrayList(AccountType.CLIENT, AccountType.ADMIN));
//        acc_selector.setItems(FXCollections.observableArrayList(AccountType.values()));
//        acc_selector.setValue(AccountType.CLIENT);
        //know by default it's set to client
        acc_selector.setValue(Model.getInstance().getViewFactory().getLoginAccountType());

        acc_selector.valueProperty().addListener(observable -> {
            Model.getInstance().getViewFactory().setLoginAccountType(acc_selector.getValue());
        });
        login_btn.setOnAction(event -> {
            try {
                onLogin();
                // ìf we have this line-> there will be two clientWindow appear
//                Model.getInstance().getViewFactory().showClientWindow();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
    }

    private void onLogin() throws IOException {
        Stage stage = (Stage) error_lbl.getScene().getWindow();
        Model.getInstance().getViewFactory().closeStage(stage);
//        Model.getInstance().getViewFactory().showClientWindow();
        if (Model.getInstance().getViewFactory().getLoginAccountType() == AccountType.ADMIN) {
            Model.getInstance().getViewFactory().showAdminWindow();
        } else {
            Model.getInstance().getViewFactory().showClientWindow();
        }
    }
}
