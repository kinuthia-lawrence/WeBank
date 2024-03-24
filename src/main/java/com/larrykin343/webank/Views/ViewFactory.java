package com.larrykin343.webank.Views;

import com.larrykin343.webank.Controller.Admin.AdminController;
import com.larrykin343.webank.Controller.Client.ClientController;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.util.Objects;

public class ViewFactory {
    private AccountType loginAccountType;
    //!client view
    private final ObjectProperty clientSelectedMenuItem;
    private AnchorPane dashboardView;
    private AnchorPane transactionsView;
    private AnchorPane accountsView;

    //! Admin view
    private final ObjectProperty adminSelectedMenuItem;
    private AnchorPane createClientView;
    private AnchorPane clientView;
    private AnchorPane depositView;


    public ViewFactory(){
        this.loginAccountType = AccountType.CLIENT;
        this.adminSelectedMenuItem = new SimpleObjectProperty();
        this.clientSelectedMenuItem = new SimpleObjectProperty();
    };

    public AccountType getLoginAccountType() {
        return loginAccountType;
    }

    public void setLoginAccountType(AccountType loginAccountType) {
        this.loginAccountType = loginAccountType;
    }

    //! Clients Views Section
    /*  (add fx:id and create injections)declare the anchorPane > create its method > add it to switch in client controller >
    *  set listener to clientMenu Controller.
    *  */

    public ObjectProperty<ClientMenuOptions> getClientSelectedMenuItem() {
        return clientSelectedMenuItem;
    }

//? Method for getting the dashboard view
    public AnchorPane getDashboardView(){
        if(dashboardView ==null){
            try {
                dashboardView =new FXMLLoader(getClass().getResource("/Fxml/Client/Dashboard.fxml")).load();
            }catch(Exception e){
                e.printStackTrace();
                e.getCause();
            }
        }
        return dashboardView;
    }

//?    method for getting the transaction view

    public AnchorPane getTransactionsView() {
        if(transactionsView == null){
            try{
                transactionsView = new FXMLLoader(getClass().getResource("/Fxml/Client/Transactions.fxml")).load();
            }catch (Exception e){
                e.printStackTrace();
                e.getCause();
            }
        }
        return transactionsView;
    }

//?   method for getting the accounts view
    public AnchorPane getAccountsView(){
        if(accountsView == null) {
            try {
                accountsView = new FXMLLoader(getClass().getResource("/Fxml/Client/Accounts.fxml")).load();
            } catch (Exception e) {
                e.printStackTrace();
                e.getCause();
            }
        }
        return accountsView;
    }


    /*  getting Login Window*/
    public void showLoginWindow(){
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Fxml/Login.fxml"));
        Scene loginScene = null;
        try{
            loginScene = new Scene(loader.load());
        }catch (Exception e){
            e.printStackTrace();
            e.getCause();
        }
        Stage stage = new Stage();
        stage.setScene(loginScene);
        Image icon = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/Images/vision.png")));
        stage.getIcons().add(icon);
        stage.setTitle("WeBank");
        stage.show();
    }

    /*Getting Clients window*/
    public void showClientWindow(){
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Fxml/Client/Client.fxml"));
        ClientController clientController = new ClientController();
        loader.setController(clientController);
        createStage(loader);
    }

    //! Admin Views Section
    /*
     * create showAdminWindow method,change admin.fxml stage to bolder pane,add adminMenu to left and createClint to center,in viewFactory, declare admin
     * views(anchorPane createClientView,StingProperty adminSelectedMenuItem),create Views,create a listener and switch(TODO) in adminController,add
     * listeners to adminMenuController
     * */

    public ObjectProperty<AdminMenuOptions> getAdminSelectedMenuItem() {
        return adminSelectedMenuItem;
    }

    public void showAdminWindow(){
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Fxml/Admin/Admin.fxml"));
        AdminController adminController = new AdminController();
        loader.setController(adminController);
        createStage(loader);
    }

    public AnchorPane getCreateClientView() {
        if(createClientView == null){
            try{
                createClientView = new FXMLLoader(getClass().getResource("/Fxml/Admin/CreateClient.fxml")).load();
            }catch (Exception e){
                e.printStackTrace();
                e.getCause();
            }
        }
        return createClientView;
    }

    public AnchorPane getClientView() {
        if(clientView == null){
            try{
                clientView = new FXMLLoader(getClass().getResource("/Fxml/Admin/Clients.fxml")).load();
            }catch (Exception e){
                e.printStackTrace();
                e.getCause();
            }
        }
        return clientView;
    }

    public AnchorPane getDepositView() {
        if(depositView == null){
            try {
                depositView = new FXMLLoader(getClass().getResource("/Fxml/Admin/Deposit.fxml")).load();
            }catch (Exception e){
                e.printStackTrace();
                e.getCause();
            }
        }
        return depositView;
    }

    //! Creating the stage
    private void createStage(FXMLLoader loader) {
        Scene scene = null;
        try{
            scene = new Scene(loader.load());
        }catch (Exception e){
            e.printStackTrace();
            e.getCause();
        }
        Stage stage = new Stage();
        stage.setScene(scene);
        Image icon = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/Images/vision.png")));
        stage.getIcons().add(icon);
        stage.setTitle("WeBank");
        stage.setResizable(false);
        stage.initStyle(StageStyle.UNDECORATED);
        stage.show();
    }



    //! method to close login stage
    public void closeStage(Stage stage){
        stage.close();
    }
}


