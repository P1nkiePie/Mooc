package otsikko;

import javafx.application.Application;
import javafx.application.Application.Parameters;
import javafx.stage.Stage;

public class KayttajanOtsikko extends Application {

    @Override
    public void start(Stage stage) {
        stage.setTitle(getParameters().getNamed().get("title"));
        stage.show();
    }
}
