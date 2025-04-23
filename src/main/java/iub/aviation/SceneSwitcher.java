package iub.aviation;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class SceneSwitcher {

    public static void switchTo(Stage stage, String fxmlFileName) throws IOException {
        Parent root = FXMLLoader.load(HelloApplication.class.getResource(fxmlFileName + ".fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
