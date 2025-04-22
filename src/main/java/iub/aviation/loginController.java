package iub.aviation;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class loginController
{
    @javafx.fxml.FXML
    private Label massageLabel;
    @javafx.fxml.FXML
    private TextField passwordBox;
    @javafx.fxml.FXML
    private TextField usernameBox;




    @javafx.fxml.FXML
    public void onLogin(ActionEvent actionEvent) throws IOException {
        String username = usernameBox.getText();
        String password = passwordBox.getText();

        if ("engineer".equals(username) && "ramisha".equals(password)) {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("iub.aviation/RamishaRafa/EngineerDash.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) usernameBox.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();

        } else if ("trainer".equals(username) && "ramisha".equals(password)) {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("iub.aviation/RamishaRafa/TrainerDash.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) usernameBox.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();


        } else {
            massageLabel.setText("Incorrect username or password. Please try again.");
        }
    }
}

