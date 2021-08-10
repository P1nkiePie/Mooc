package nappijatekstikentta;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;


public class NappiJaTekstikenttaSovellus extends Application{


    @Override
    public void start(Stage primaryStage) {
        FlowPane root = new FlowPane();
        Scene scne = new Scene(root);
        
        TextField textfield = new TextField();
        textfield.appendText("Tekstikenttä");
        Button button = new Button("Painike");
        root.getChildren().addAll(button, textfield);
        
        primaryStage.setTitle("Sovellukseni");
        primaryStage.setScene(scne);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(NappiJaTekstikenttaSovellus.class);
    }

}
