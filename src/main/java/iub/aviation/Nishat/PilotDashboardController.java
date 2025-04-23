package iub.aviation.Nishat;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;

public class PilotDashboardController {

    @javafx.fxml.FXML
    public void initialize() {
        // Initialization logic if needed (e.g., setting up initial data)
    }

    // Action for the "Training Program Panel" button
    @javafx.fxml.FXML
    public void PilotTrainingcirtificationOnAction(ActionEvent actionEvent) {
        // Placeholder for the actual action when the button is clicked
        showInfo("Training Program", "Navigating to the Training Program Panel.");
    }

    // Action for the "My Flight Schedule" button
    @javafx.fxml.FXML
    public void pilotFlightSchedulingOnAction(ActionEvent actionEvent) {
        // Placeholder for the actual action when the button is clicked
        showInfo("Flight Schedule", "Navigating to your Flight Schedule.");
    }

    // Action for the "Assigned Helicopter Info" button
    @javafx.fxml.FXML
    public void addhelicopterInfoOnAction(ActionEvent actionEvent) {
        // Placeholder for the actual action when the button is clicked
        showInfo("Helicopter Info", "Navigating to your Assigned Helicopter Information.");
    }

    // Action for the "Update Notifications" button
    @javafx.fxml.FXML
    public void UpdateNotificationOnAction(ActionEvent actionEvent) {
        // Placeholder for the actual action when the button is clicked
        showInfo("Update Notifications", "Navigating to Update Notifications.");
    }

    // Action for the "Reports and Analytics" button
    @javafx.fxml.FXML
    public void PilotReportsAndAnalyticsOnAction(ActionEvent actionEvent) {
        // Placeholder for the actual action when the button is clicked
        showInfo("Reports and Analytics", "Navigating to your Reports and Analytics.");
    }

    // Helper method to show informational alerts
    private void showInfo(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
