package pl.camp.it.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;

public class Pane1Controller {

    @FXML
    Button przycisk1;

    @FXML
    CheckBox checkBox;

    @FXML
    Button przycisk2;

    @FXML
    public void click(ActionEvent event) {
        System.out.println("Coś zostało kliknięte !!!");

        if(event.getSource() instanceof Button) {
            System.out.println("Został kliknięty przycisk !!");
        } else if(event.getSource() instanceof CheckBox) {
            System.out.println("Został kliknięty checkBox !!");
        }
    }

    @FXML
    public void button2click() {
        System.out.println("Został kliknięty drugi przycisk !!");
    }

    @FXML
    public void mouseEnteredAction() {
        System.out.println("Hej najechałeś myszką na checkBox !!");
    }

}
