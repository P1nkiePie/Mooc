package borderpane;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class BorderPaneSovellus extends Application {


     @Override
    public void start(Stage primaryStage) {
        BorderPane root = new BorderPane();
        Scene scne = new Scene(root);
        
        Label North = new Label("NORTH");
        root.setTop(North);
        
        Label East = new Label("EAST");
        root.setRight(East);
        
        Label South = new Label("SOUTH");
        root.setBottom(South);
        
        primaryStage.setTitle("Sovellukseni");
        primaryStage.setScene(scne);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(BorderPaneSovellus.class);
    }

}
