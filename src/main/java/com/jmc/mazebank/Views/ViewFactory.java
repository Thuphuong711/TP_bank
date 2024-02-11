package com.jmc.mazebank.Views;

import com.jmc.mazebank.Controllers.Admin.AdminController;
import com.jmc.mazebank.Controllers.Client.ClientController;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class ViewFactory {
    private AccountType loginAccountType;

    // Client Views
    private final ObjectProperty<ClientMenuOptions> clientSelectedMenuItem;
    @FXML
    private AnchorPane dashboardView;
    @FXML
    private AnchorPane transactionsView;
    @FXML
    private AnchorPane accountsView;

    //Admin Views
    private final ObjectProperty<AdminMenuOptions> adminSelectedMenuItem;
    private AnchorPane clientsView;
    private AnchorPane createClientView;
    private AnchorPane depositView;

    public ViewFactory() {
        this.clientSelectedMenuItem = new SimpleObjectProperty<>();
        this.adminSelectedMenuItem = new SimpleObjectProperty<>();
        this.loginAccountType = AccountType.CLIENT;

    }

    public AccountType getLoginAccountType() {
        return loginAccountType;
    }

    public void setLoginAccountType(AccountType loginAccountType) {
        this.loginAccountType = loginAccountType;
    }

    /**
     * Client Views section
     */

    public ObjectProperty<ClientMenuOptions> getClientSelectedMenuItem() {
        return clientSelectedMenuItem;
    }

    public AnchorPane getDashboardView() {
        try {
            if (dashboardView == null) {
                dashboardView = new FXMLLoader(getClass().getResource("/FXML/Client/Dashboard.fxml")).load();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dashboardView;
    }

    public AnchorPane getTransactionsView() {

        try {
            if (transactionsView == null) {
                transactionsView = new FXMLLoader(getClass().getResource("/FXML/Client/Transactions.fxml")).load();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return transactionsView;
    }

    public AnchorPane getAccountsView() {
        try {
            if (accountsView == null) {
                accountsView = new FXMLLoader(getClass().getResource("/FXML/Client/Accounts.fxml")).load();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return accountsView;
    }

    public void showClientWindow() {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/FXML/Client/Client.fxml"));
        ClientController clientcontroller = new ClientController();
        loader.setController(clientcontroller);
        creatStage(loader);
    }


    public void showLoginWindow() {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/FXML/Login.fxml"));
        creatStage(loader);
    }

    /**
     * Admin Views section
     */
    public ObjectProperty<AdminMenuOptions> getAdminSelectedMenuItem() {
        return adminSelectedMenuItem;
    }

    public AnchorPane getCreateClientView() {
        try {
            if (createClientView == null) {
                createClientView = new FXMLLoader(getClass().getResource("/FXML/Admin/CreateClient.fxml")).load();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return createClientView;
    }

    public AnchorPane getDepositView(){
        if(depositView == null){
            try {
                depositView = new FXMLLoader(getClass().getResource("/FXML/Admin/Deposit.fxml")).load();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return depositView;
    }
    public AnchorPane getClientsView() {
        try {
            if (clientsView == null) {
                clientsView = new FXMLLoader(getClass().getResource("/FXML/Admin/Clients.fxml")).load();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return clientsView;
    }



    public void showAdminWindow() {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/FXML/Admin/Admin.fxml"));
        AdminController adminController = new AdminController();
        loader.setController(adminController);
        creatStage(loader);
    }

    private void creatStage(FXMLLoader loader) {
        Scene scene = null;
        try {
            scene = new Scene(loader.load());
        } catch (IOException e) {
            e.printStackTrace();
        }
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.getIcons().add(new Image((String.valueOf(getClass().getResource("/Images/bank.png")))));
        stage.setResizable(false);
        stage.setTitle("TP bank");
        stage.show();
    }

    public void closeStage(Stage stage) {
        stage.close();
    }


}

