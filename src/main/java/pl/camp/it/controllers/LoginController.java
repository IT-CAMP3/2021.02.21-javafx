package pl.camp.it.controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import pl.camp.it.Store;
import pl.camp.it.model.User;

import java.io.IOException;

public class LoginController {

    @FXML
    TextField loginTextField;
    @FXML
    TextField passwordTextField;
    @FXML
    TextField ageTextField;
    @FXML
    CheckBox confirmationCheckBox;

    @FXML
    public void okClick() throws IOException {
        if(this.loginTextField.getText().equals("") ||
        this.passwordTextField.getText().equals("") ||
        this.ageTextField.getText().equals("") ||
        !confirmationCheckBox.isSelected()) {
            return;
        }

        User user = new User();
        user.setLogin(this.loginTextField.getText());
        user.setPassword(this.passwordTextField.getText());
        user.setAge(Integer.parseInt(this.ageTextField.getText()));

        if(user.getLogin().equals("mateusz") && user.getPassword().equals("tajne")) {
            Store.user = user;
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(this.getClass().getResource("/fxml/UserPane.fxml"));
            AnchorPane pane = loader.load();
            Scene scene = new Scene(pane);
            Store.stage.setScene(scene);
            Store.stage.show();
        }
    }
}
