package iub.aviation.Nishat;

import iub.aviation.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.stage.Stage;
import java.io.IOException;

public class PilotDashboardController {

    @javafx.fxml.FXML
    public void initialize() {
        // Initialization logic if needed (e.g., setting up initial data)
    }

    // Action for the "Training Program Panel" button
    @javafx.fxml.FXML
    public void PilotTrainingcirtificationOnAction(ActionEvent actionEvent) throws IOException {
        // Switch to the Training Program scene
        Stage stage = (Stage) actionEvent.getSource();
        SceneSwitcher.switchTo(stage, "PilotTrainingProgram");
    }

    // Action for the "My Flight Schedule" button
    @javafx.fxml.FXML
    public void pilotFlightSchedulingOnAction(ActionEvent actionEvent) throws IOException {
        // Switch to the Flight Schedule scene
        Stage stage = (Stage) actionEvent.getSource();
        SceneSwitcher.switchTo(stage, "PilotFlightSchedule");
    }

    // Action for the "Assigned Helicopter Info" button
    @javafx.fxml.FXML
    public void addhelicopterInfoOnAction(ActionEvent actionEvent) throws IOException {
        // Switch to the Assigned Helicopter Info scene
        Stage stage = (Stage) actionEvent.getSource();
        SceneSwitcher.switchTo(stage, "PilotHelicopterInfo");
    }

    // Action for the "Update Notifications" button
    @javafx.fxml.FXML
    public void UpdateNotificationOnAction(ActionEvent actionEvent) throws IOException {
        // Switch to the Update Notifications scene
        Stage stage = (Stage) actionEvent.getSource();
        SceneSwitcher.switchTo(stage, "PilotNotifications");
    }

    // Action for the "Reports and Analytics" button
    @javafx.fxml.FXML
    public void PilotReportsAndAnalyticsOnAction(ActionEvent actionEvent) throws IOException {
        // Switch to the Reports and Analytics scene
        Stage stage = (Stage) actionEvent.getSource();
        SceneSwitcher.switchTo(stage, "PilotReportsAnalytics");
    }

    // Helper method to show informational alerts (optional)
    private void showInfo(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
