package ilmoitin;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class IlmoitinSovellus extends Application {


    @Override
    public void start(Stage primaryStage) {
        VBox vbox = new VBox();
        TextField tekstikentta = new TextField();
        tekstikentta.appendText("Teksikenttä");
        
        Label label = new Label();
        
        Button button = new Button("Päivitä");
        button.setOnAction(e -> {
            label.setText(tekstikentta.getText());
        });
        
        vbox.getChildren().addAll(tekstikentta, button, label);
        
        primaryStage.setTitle("IlmoitinSovellus");
        Scene scne = new Scene(vbox);
        primaryStage.setScene(scne);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(IlmoitinSovellus.class);
    }

}
