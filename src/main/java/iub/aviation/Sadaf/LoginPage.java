package iub.aviation.Sadaf;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class LoginPage {
    @FXML
    private Label userLabel;
    @FXML
    private Label logLabel;
    @FXML
    private TextField userNameTF;
    @FXML
    private TextField passwordTF;
    @FXML
    private Label passwordLabel;

    @FXML
    public void initialize() {
    }

    @FXML
    public void loginClickOnButton(ActionEvent actionEvent) {
        String username = userNameTF.getText();
        String password = passwordTF.getText();


        if (validateCredentials(username, password)) {
            showAlert("Login Successful", "Welcome, " + username + "!", AlertType.INFORMATION);
        } else {
            showAlert("Login Failed", "Invalid username or password.", AlertType.ERROR);
        }
    }

    private boolean validateCredentials(String username, String password) {
        String validUsername = "admin";
        String validPassword = "admin1234";

        return username.equals(validUsername) && password.equals(validPassword);
    }

    private void showAlert(String title, String message, AlertType alertType) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}