package com.larrykin343.webank.Views;

import com.larrykin343.webank.Controller.Client.ClientController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.util.Objects;

public class ViewFactory {
    //client view
    private AnchorPane dashboardView;

    public ViewFactory(){};

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
        stage.show();
    }

    public void closeStage(Stage stage){
        stage.close();
    }
}


