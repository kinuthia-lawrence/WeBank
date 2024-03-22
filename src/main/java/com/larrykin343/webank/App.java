package com.larrykin343.webank;

import com.larrykin343.webank.Models.Model;
import com.larrykin343.webank.Views.ViewFactory;
import javafx.scene.Scene;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class App extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Model.gerInstance().getViewFactory().showLoginWindow();
    }
}
