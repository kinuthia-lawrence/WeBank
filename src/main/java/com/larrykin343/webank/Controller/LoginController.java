package com.larrykin343.webank.Controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {
    @FXML
    public Label payment_address_label;
    @FXML
    public ChoiceBox acc_selector;
    @FXML
    public TextField payment_address_field;
    @FXML
    public PasswordField Password_field;
    @FXML
    public Label Password_label;
    @FXML
    public Button Login_button;
    @FXML
    public Label error_label;
    @FXML
    public ImageView loginImageView;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        File imageFile = new File("src/main/resources/Images/vision.png");
        Image loginImage = new Image(imageFile.toURI().toString());
        loginImageView.setImage(loginImage);
//        login_button
    }
}
