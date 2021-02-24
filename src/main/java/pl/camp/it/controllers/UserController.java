package pl.camp.it.controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import pl.camp.it.Store;

import java.io.IOException;

public class UserController {
    @FXML
    Label helloLabel;
    @FXML
    Label passwordLabel;
    @FXML
    Label ageLabel;

    @FXML
    public void back() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(this.getClass().getResource("/fxml/LoginPane.fxml"));
        AnchorPane pane = loader.load();
        Scene scene = new Scene(pane);
        Store.stage.setScene(scene);
    }

    public void initialize() {
        this.helloLabel.setText("Witaj " + Store.user.getLogin());
        this.passwordLabel.setText(Store.user.getPassword());
        this.ageLabel.setText("Wiek: " + Store.user.getAge());
    }
}
