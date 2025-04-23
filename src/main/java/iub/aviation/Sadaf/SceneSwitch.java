package iub.aviation.Sadaf;

import iub.aviation.HelloApplication;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class SceneSwitch {
    public static Stage stage;

    public static void switchTo(String fxmlFileName) throws IOException{
        Parent root = FXMLLoader.load(HelloApplication.class.getResource(fxmlFileName +".fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
    }
}
