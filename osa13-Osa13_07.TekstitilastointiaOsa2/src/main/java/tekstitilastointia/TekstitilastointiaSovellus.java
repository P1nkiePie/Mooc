package tekstitilastointia;

import java.util.Arrays;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
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
        
        TextArea textarea = new TextArea();
        
        Label kirjaimet = new Label("Kirjaimia: 0");
        Label sanat = new Label("Sanoja: 0");
        Label pisin = new Label("Pisin sana on:");
        hbox.getChildren().addAll(kirjaimet,sanat,pisin);
        
        textarea.textProperty().addListener((muutos, vanhaArvo, uusiArvo) -> {
            int kirjaimia = uusiArvo.length();
            String[] palat = uusiArvo.split(" ");
            int sanoja = palat.length;
            String pisinSana = Arrays.stream(palat)
                    .sorted((s1, s2) -> s2.length() - s1.length())
                    .findFirst()
                    .get();
            kirjaimet.setText("Kirjaimia: " + String.valueOf(kirjaimia));
            sanat.setText("Sanoja: " + String.valueOf(sanoja));
            pisin.setText("Pisin sana on: "+ pisinSana);
        });
        
        
        root.setBottom(hbox);
        root.setCenter(textarea);
        
        primaryStage.setTitle("TekstitilastointiaSovellus");
        Scene scne = new Scene(root);
        primaryStage.setScene(scne);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(TekstitilastointiaSovellus.class);
    }

}
