package iub.aviation.Nishat;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Helicopter_ManagementController {

    @javafx.fxml.FXML
    private TextField HelicopterModel;
    @javafx.fxml.FXML
    private TextArea confirmationText;
    @javafx.fxml.FXML
    private TextField helicopterLicenceNum;
    @javafx.fxml.FXML
    private TextField helicopterId;

    @javafx.fxml.FXML
    public void initialize() {
        // Optionally initialize fields, set default values, etc.
    }

    // Method to add a helicopter
    @javafx.fxml.FXML
    public void addHelicopterOnAction(ActionEvent actionEvent) {
        if (isInputValid()) {
            // Add helicopter logic
            String confirmationMessage = "Helicopter added successfully:\n"
                    + "ID: " + helicopterId.getText() + "\n"
                    + "Model: " + HelicopterModel.getText() + "\n"
                    + "Licence Number: " + helicopterLicenceNum.getText();
            confirmationText.setText(confirmationMessage);
            showInfo("Success", "Helicopter added successfully.");
        } else {
            showError("Validation Error", "Please fill in all fields.");
        }
    }

    // Method to update helicopter details
    @javafx.fxml.FXML
    public void updateHelicopterOnAction(ActionEvent actionEvent) {
        if (isInputValid()) {
            // Update helicopter logic
            String confirmationMessage = "Helicopter updated successfully:\n"
                    + "ID: " + helicopterId.getText() + "\n"
                    + "Model: " + HelicopterModel.getText() + "\n"
                    + "Licence Number: " + helicopterLicenceNum.getText();
            confirmationText.setText(confirmationMessage);
            showInfo("Success", "Helicopter updated successfully.");
        } else {
            showError("Validation Error", "Please fill in all fields.");
        }
    }

    // Method to remove a helicopter
    @javafx.fxml.FXML
    public void removeHelicopterOnAction(ActionEvent actionEvent) {
        if (isInputValid()) {
            // Remove helicopter logic
            String confirmationMessage = "Helicopter removed successfully:\n"
                    + "ID: " + helicopterId.getText();
            confirmationText.setText(confirmationMessage);
            showInfo("Success", "Helicopter removed successfully.");
        } else {
            showError("Validation Error", "Please provide a Helicopter ID.");
        }
    }

    // Helper method to validate the input fields
    private boolean isInputValid() {
        // Check if all fields are filled
        return !helicopterId.getText().isEmpty()
                && !HelicopterModel.getText().isEmpty()
                && !helicopterLicenceNum.getText().isEmpty();
    }

    // Method to show error alerts
    private void showError(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    // Method to show informational alerts
    private void showInfo(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
