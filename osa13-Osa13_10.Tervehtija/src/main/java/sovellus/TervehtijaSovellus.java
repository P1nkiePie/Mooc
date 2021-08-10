package sovellus;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TervehtijaSovellus extends Application {


    public static void main(String[] args) {
        launch(TervehtijaSovellus.class);
    }

    @Override
    public void start(Stage stage) {
        
        BorderPane border = new BorderPane();
        border.setMinSize(450, 450);
        BorderPane border1 = new BorderPane();
        border1.setMinSize(450, 450);
        
        VBox vbox = new VBox();
        vbox.setMaxSize(150, 100);
        vbox.setSpacing(7);
        border.setCenter(vbox);
        
        Scene scene = new Scene(border);
        Scene scene1 = new Scene(border1);
        
        
        Label label = new Label("Kirjoita nimesi ja aloita");
        TextField text = new TextField();
        String nimi = text.getText();
        Button button = new Button("Aloita");
        button.setOnAction(e -> {
            stage.setScene(scene1);
            Label label1 = new Label();
            label1.setText("Tervetuloa " + text.getText() + "!");
            border1.setCenter(label1);
        });
        vbox.getChildren().addAll(label, text, button);
      
        
        stage.setScene(scene);
        stage.show();
    }
}
