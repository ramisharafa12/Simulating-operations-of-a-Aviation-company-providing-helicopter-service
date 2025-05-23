package iub.aviation.Nishat;

import iub.aviation.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.io.IOException;

public class Assign_Pilot_To_FlightController {

    @javafx.fxml.FXML
    private TextArea confirmfxid;

    @javafx.fxml.FXML
    private TextField pilotEmail;

    @javafx.fxml.FXML
    private TextField helicopterModelFxid;

    @javafx.fxml.FXML
    private TextField pilotLicenceNum;

    @javafx.fxml.FXML
    private TextField helicopterLicenceNum;

    @javafx.fxml.FXML
    private TextField pilotNameFxid;

    @javafx.fxml.FXML
    private TextField helicopterId;

    @javafx.fxml.FXML
    private TextField pilotId;

    @javafx.fxml.FXML
    public void initialize() {
        // Any initialization logic can go here
    }

    @javafx.fxml.FXML
    public void addPilotAssignOnAction(ActionEvent actionEvent) throws IOException {
        // Check if all fields are filled
        if (isInputValid()) {
            // If all inputs are valid, proceed with assigning the pilot
            String confirmationMessage = "Pilot: " + pilotNameFxid.getText() + "\n"
                    + "Pilot ID: " + pilotId.getText() + "\n"
                    + "Pilot Email: " + pilotEmail.getText() + "\n"
                    + "Pilot Licence: " + pilotLicenceNum.getText() + "\n"
                    + "Helicopter Model: " + helicopterModelFxid.getText() + "\n"
                    + "Helicopter ID: " + helicopterId.getText() + "\n"
                    + "Helicopter Licence: " + helicopterLicenceNum.getText() + "\n";

            // Show confirmation message in the TextArea
            confirmfxid.setText(confirmationMessage);

            // Switch to the Admin Dashboard scene (for example)
            Stage stage = (Stage) confirmfxid.getScene().getWindow();
            SceneSwitcher.switchTo(stage, "AdminDashboard");
        } else {
            // Show an error message if the inputs are not valid
            showError("Validation Error", "Please fill in all the required fields.");
        }
    }

    // Helper method to check if all inputs are valid
    private boolean isInputValid() {
        return !pilotNameFxid.getText().trim().isEmpty()
                && !pilotId.getText().trim().isEmpty()
                && !pilotEmail.getText().trim().isEmpty()
                && !pilotLicenceNum.getText().trim().isEmpty()
                && !helicopterModelFxid.getText().trim().isEmpty()
                && !helicopterId.getText().trim().isEmpty()
                && !helicopterLicenceNum.getText().trim().isEmpty()
                && isEmailValid(pilotEmail.getText().trim());
    }

    // Helper method to check if the email is valid
    private boolean isEmailValid(String email) {
        // Basic email validation: check if it contains "@" symbol and "."
        return email.contains("@") && email.contains(".");
    }

    // Method to show error alerts
    private void showError(String title, String message) {
        Alert alert = new Alert(AlertType.ERROR);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
