package sovellukseni;

import javafx.application.Application;
import javafx.stage.Stage;

public class Sovellukseni extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Sovellukseni");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(Sovellukseni.class);
    }

}
