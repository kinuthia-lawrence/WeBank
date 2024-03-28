package com.larrykin343.webank.Controller;

import com.larrykin343.webank.Models.Model;
import com.larrykin343.webank.Views.AccountType;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {
    @FXML
    public Label payment_address_label;
    @FXML
    public ChoiceBox<AccountType> acc_selector;
    @FXML
    public TextField payment_address_field;
    @FXML
    public PasswordField Password_field;
    @FXML
    public Label Password_label;
    @FXML
    public Label error_label;
    @FXML
    public ImageView loginImageView;
    @FXML
    public Button loginButton;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //?setting the image for the login page
        File imageFile = new File("src/main/resources/Images/vision.png");
        Image loginImage = new Image(imageFile.toURI().toString());
        loginImageView.setImage(loginImage);
        //?setting the account type
        acc_selector.setItems(FXCollections.observableArrayList(AccountType.CLIENT, AccountType.ADMIN));
        acc_selector.setValue(Model.getInstance().getViewFactory().getLoginAccountType());
        acc_selector.valueProperty().addListener(observableValue -> Model.getInstance().getViewFactory().setLoginAccountType(acc_selector.getValue()));
        loginButton.setOnAction(event -> onLogin());
    }
    public void onLogin(){
        if(Model.getInstance().getViewFactory().getLoginAccountType() == AccountType.CLIENT){
            //?Evaluate Client Credentials
            Model.getInstance().evaluateClientCredentials(payment_address_field.getText(), Password_field.getText());
            if(Model.getInstance().getClientLoginSuccessFlag()) {
                Model.getInstance().getViewFactory().showClientWindow();
                //closing the login stage.
                Stage stage = (Stage) loginButton.getScene().getWindow();
                Model.getInstance().getViewFactory().closeStage(stage);
            }else{
                payment_address_field.clear();
                Password_field.clear();
                error_label.setText("Invalid Credentials");
            }
        }else{
            Model.getInstance().getViewFactory().showAdminWindow();
            //closing the login stage.
            Stage stage = (Stage) loginButton.getScene().getWindow();
            Model.getInstance().getViewFactory().closeStage(stage);
        }


    }

}
