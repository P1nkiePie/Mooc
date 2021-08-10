package nappijatekstielementti;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


public class NappiJaTekstielementtiSovellus extends Application {


    @Override
    public void start(Stage primaryStage) {
        BorderPane root = new BorderPane();
        HBox hbox = new HBox();
        root.setTop(hbox);
        Scene scene = new Scene(root);
        
        Label label = new Label("Tekstielementti");
        Button button = new Button("Tämä on nappi");
        hbox.getChildren().addAll(button, label);
        
        primaryStage.setTitle("Sovellukseni");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(NappiJaTekstielementtiSovellus.class);
    }

}
