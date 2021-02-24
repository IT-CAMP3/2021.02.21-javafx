package pl.camp.it;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class App extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Aplikacja");
        stage.setWidth(400);
        stage.setHeight(300);
        stage.setResizable(false);

        Button button = new Button("Przycisk1");
        button.setOnAction(ae -> System.out.println("Kliknięto przycisk !!"));
        Button button2 = new Button("Przycisk2");
        button2.setOnAction(ae -> System.out.println("kliknięto w drugi przycisk !!"));

        StackPane pane = new StackPane();
        pane.getChildren().add(button);
        //pane.getChildren().add(button2);

        Scene scene = new Scene(pane);

        stage.setScene(scene);
        stage.show();
    }
}
