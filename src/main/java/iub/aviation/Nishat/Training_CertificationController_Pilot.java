package iub.aviation.Nishat;

import iub.aviation.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.io.IOException;

public class Training_CertificationController_Pilot {

    @javafx.fxml.FXML
    private ComboBox<String> trainingDuration;
    @javafx.fxml.FXML
    private DatePicker datepickFrom;
    @javafx.fxml.FXML
    private TextField trainingNamefxId;
    @javafx.fxml.FXML
    private TextField trainingIDfx;
    @javafx.fxml.FXML
    private DatePicker datePickTo;

    @javafx.fxml.FXML
    public void initialize() {
        // Populate the training duration combo box with predefined options
        trainingDuration.getItems().addAll("1 Month", "3 Months", "6 Months", "1 Year");
    }

    // Action for "Enroll Training" button - Enrolls the pilot in a training program
    @javafx.fxml.FXML
    public void enrollTrainingOnAction(ActionEvent actionEvent) throws IOException {
        String trainingName = trainingNamefxId.getText();
        String trainingID = trainingIDfx.getText();
        String duration = trainingDuration.getValue();
        String fromDate = datepickFrom.getValue() != null ? datepickFrom.getValue().toString() : "";
        String toDate = datePickTo.getValue() != null ? datePickTo.getValue().toString() : "";

        // Perform validation to ensure all fields are filled
        if (trainingName.isEmpty() || trainingID.isEmpty() || duration == null || fromDate.isEmpty() || toDate.isEmpty()) {
            showError("Error", "Please fill in all the fields.");
            return;
        }

        // Placeholder for enrollment logic (e.g., saving to database)
        showInfo("Enrollment Successful", "You have been enrolled in the training program.\nTraining Name: " + trainingName);

        // Optionally, clear fields after enrollment
        clearFields();

        // After enrolling, switch to another scene (e.g., Pilot Dashboard)
        Stage stage = (Stage) actionEvent.getSource();
        SceneSwitcher.switchTo(stage, "PilotDashboard");
    }

    // Action for "Collect Certification" button - Marks the pilot as having completed the training and collects the certification
    @javafx.fxml.FXML
    public void CollectCertificationOnAction(ActionEvent actionEvent) throws IOException {
        String trainingName = trainingNamefxId.getText();
        String trainingID = trainingIDfx.getText();

        // Perform validation to ensure fields are filled
        if (trainingName.isEmpty() || trainingID.isEmpty()) {
            showError("Error", "Please provide the training details.");
            return;
        }

        // Placeholder for collecting certification logic (e.g., updating database)
        showInfo("Certification Collected", "Certification has been collected for the training program.\nTraining Name: " + trainingName);

        // Optionally, clear fields after collecting certification
        clearFields();

        // After collecting certification, switch to another scene (e.g., Pilot Dashboard)
        Stage stage = (Stage) actionEvent.getSource();
        SceneSwitcher.switchTo(stage, "PilotDashboard");
    }

    // Helper method to show informational alerts
    private void showInfo(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    // Helper method to show error alerts
    private void showError(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    // Helper method to clear input fields
    private void clearFields() {
        trainingNamefxId.clear();
        trainingIDfx.clear();
        trainingDuration.getSelectionModel().clearSelection();
        datepickFrom.setValue(null);
        datePickTo.setValue(null);
    }
}
