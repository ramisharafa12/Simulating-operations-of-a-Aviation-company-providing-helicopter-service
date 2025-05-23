package iub.aviation.Nishat;

import iub.aviation.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.io.IOException;

public class Pilot_ManagementController {

    @javafx.fxml.FXML
    private TextArea PilotConfirmationfxid;
    @javafx.fxml.FXML
    private TextField pilotNamefxid;
    @javafx.fxml.FXML
    private TextField PilotIdfxid;
    @javafx.fxml.FXML
    private TextField PilotLicenceNumfxid;

    @javafx.fxml.FXML
    public void initialize() {
        // Optional initialization, set default values, etc.
    }

    // Method to add a pilot
    @javafx.fxml.FXML
    public void addPilotOnAction(ActionEvent actionEvent) throws IOException {
        if (isInputValid()) {
            // Add pilot logic
            String confirmationMessage = "Pilot added successfully:\n"
                    + "ID: " + PilotIdfxid.getText() + "\n"
                    + "Name: " + pilotNamefxid.getText() + "\n"
                    + "Licence Number: " + PilotLicenceNumfxid.getText();
            PilotConfirmationfxid.setText(confirmationMessage);
            showInfo("Success", "Pilot added successfully.");

            // Switch to the pilot list or admin dashboard
            Stage stage = (Stage) PilotConfirmationfxid.getScene().getWindow();
            SceneSwitcher.switchTo(stage, "PilotList");  // Or any other scene name like "AdminDashboard"
        } else {
            showError("Validation Error", "Please fill in all fields.");
        }
    }

    // Method to update pilot details
    @javafx.fxml.FXML
    public void updatePilotOnAction(ActionEvent actionEvent) throws IOException {
        if (isInputValid()) {
            // Update pilot logic
            String confirmationMessage = "Pilot updated successfully:\n"
                    + "ID: " + PilotIdfxid.getText() + "\n"
                    + "Name: " + pilotNamefxid.getText() + "\n"
                    + "Licence Number: " + PilotLicenceNumfxid.getText();
            PilotConfirmationfxid.setText(confirmationMessage);
            showInfo("Success", "Pilot updated successfully.");

            // Switch to the pilot list or admin dashboard
            Stage stage = (Stage) PilotConfirmationfxid.getScene().getWindow();
            SceneSwitcher.switchTo(stage, "PilotList");  // Or any other scene name like "AdminDashboard"
        } else {
            showError("Validation Error", "Please fill in all fields.");
        }
    }

    // Method to remove a pilot
    @javafx.fxml.FXML
    public void removePilotOnAction(ActionEvent actionEvent) throws IOException {
        if (isInputValid()) {
            // Remove pilot logic
            String confirmationMessage = "Pilot removed successfully:\n"
                    + "ID: " + PilotIdfxid.getText();
            PilotConfirmationfxid.setText(confirmationMessage);
            showInfo("Success", "Pilot removed successfully.");

            // Switch to the pilot list or admin dashboard
            Stage stage = (Stage) PilotConfirmationfxid.getScene().getWindow();
            SceneSwitcher.switchTo(stage, "PilotList");  // Or any other scene name like "AdminDashboard"
        } else {
            showError("Validation Error", "Please provide a valid Pilot ID.");
        }
    }

    // Helper method to validate the input fields
    private boolean isInputValid() {
        // Check if all fields are filled
        return !PilotIdfxid.getText().isEmpty()
                && !pilotNamefxid.getText().isEmpty()
                && !PilotLicenceNumfxid.getText().isEmpty();
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
