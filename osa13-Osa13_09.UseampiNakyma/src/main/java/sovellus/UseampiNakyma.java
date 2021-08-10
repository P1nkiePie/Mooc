package sovellus;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class UseampiNakyma extends Application {

    public static void main(String[] args) {
        launch(UseampiNakyma.class);
    }


    @Override
    public void start(Stage stage) {
        BorderPane borderpane = new BorderPane();
        VBox vbox = new VBox();
        GridPane grid = new GridPane();
        
        
        Scene scene1 = new Scene(borderpane);
        Scene scene2 = new Scene(vbox);
        Scene scene3 = new Scene(grid);
        
        
        Label eka = new Label("Eka näkymä!");
        Button button = new Button("Tokaan näkymään!");
        button.setOnAction(e -> stage.setScene(scene2));
        borderpane.setTop(eka);
        borderpane.setCenter(button);
        
        
        Label toka = new Label("Toka näkymä");
        Button button1 = new Button("Kolmanteen näkymään!");
        button1.setOnAction(e -> stage.setScene(scene3));
        vbox.getChildren().addAll(button1, toka);

        
        Label kolmas = new Label("Kolmas näkymä!");
        Button button2 = new Button("Ekaan näkymään!");
        button2.setOnAction(e -> stage.setScene(scene1));
        grid.add(kolmas, 0, 0);
        grid.add(button2, 1, 1);
        

        stage.setScene(scene1);
        stage.show();
    }

}
