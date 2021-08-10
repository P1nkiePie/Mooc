package tekstitilastointia;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


public class TekstitilastointiaSovellus extends Application {


    @Override
    public void start(Stage primaryStage) {
        BorderPane root = new BorderPane();
        HBox hbox = new HBox();
        hbox.setSpacing(10);
        root.setBottom(hbox);
        
        TextArea textarea = new TextArea();
        root.setCenter(textarea);
        
        Label eka = new Label("Kirjaimia: 0");
        Label toka = new Label("Sanoja: 0");
        Label kolmas = new Label("Pisin sana on:");
        hbox.getChildren().addAll(eka,toka,kolmas);
        
        primaryStage.setTitle("TekstitilastointiaSovellus");
        Scene scne = new Scene(root);
        primaryStage.setScene(scne);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(TekstitilastointiaSovellus.class);
    }

}
