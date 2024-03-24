package com.larrykin343.webank.Views;

import com.larrykin343.webank.Controller.Client.ClientController;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.util.Objects;

public class ViewFactory {
    //client view
    private final StringProperty clientSelectedMenuItem;
    private AnchorPane dashboardView;
    private AnchorPane transactionsView;
    private AnchorPane accountsView;

    public ViewFactory(){
        this.clientSelectedMenuItem = new SimpleStringProperty("");
    };
    /*
    *  Clients Views Section
    *  (add fx:id and create injections)declare the anchorPane > create its method > add it to switch in client controller >
    *  set listener to clientMenu Controller.
    *  */

    public StringProperty getClientSelectedMenuItem() {
        return clientSelectedMenuItem;
    }

    //!Method for getting the dashboard view
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

//*   method for getting the accounts view
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
    /*
    * gettting Admin window
    * */

    /* method to close login stage*/
    public void closeStage(Stage stage){
        stage.close();
    }
}


