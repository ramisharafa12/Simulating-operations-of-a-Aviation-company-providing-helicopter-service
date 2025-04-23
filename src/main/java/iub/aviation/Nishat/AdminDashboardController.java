package iub.aviation.Nishat;

import iub.aviation.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;
import java.io.IOException;

public class AdminDashboardController {

    // Initialization logic
    @FXML
    public void initialize() {
        System.out.println("Admin Dashboard Initialized");
    }

    // Handle Reports and Analytics button click
    @FXML
    public void ReportsAndAnalyticsOnAction(ActionEvent actionEvent) {
        System.out.println("Reports and Analytics button clicked.");

        if (hasPermissionToAccessReports()) {
            try {
                Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
                SceneSwitcher.switchTo(stage, "ReportsAndAnalytics"); // Assuming you have a ReportsAndAnalytics.fxml file
            } catch (IOException e) {
                e.printStackTrace();
                showError("Scene Switch Error", "Error occurred while switching scenes.");
            }
        } else {
            showError("Access Denied", "You do not have permission to access Reports and Analytics.");
        }
    }

    // Handle Pilot Management Radio selection
    @FXML
    public void PilotManagementRadioOnAction(ActionEvent actionEvent) {
        System.out.println("Pilot Management selected.");

        if (isPilotListEmpty()) {
            showError("No Pilots", "No pilots are available to manage.");
        } else {
            try {
                Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
                SceneSwitcher.switchTo(stage, "PilotManagement"); // Assuming you have a PilotManagement.fxml file
            } catch (IOException e) {
                e.printStackTrace();
                showError("Scene Switch Error", "Error occurred while switching scenes.");
            }
        }
    }

    // Handle Flight Scheduling button click
    @FXML
    public void FlightSchedulingOnAction(ActionEvent actionEvent) {
        System.out.println("Flight Scheduling button clicked.");

        if (isFlightScheduleAvailable()) {
            try {
                Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
                SceneSwitcher.switchTo(stage, "FlightScheduling"); // Assuming you have a FlightScheduling.fxml file
            } catch (IOException e) {
                e.printStackTrace();
                showError("Scene Switch Error", "Error occurred while switching scenes.");
            }
        } else {
            showError("No Flights Scheduled", "There are no flights scheduled at the moment.");
        }
    }

    // Handle Training & Certification button click
    @FXML
    public void adminTrainingpanelOnAction(ActionEvent actionEvent) {
        System.out.println("Training & Certification button clicked.");

        if (isAdminVerified()) {
            try {
                Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
                SceneSwitcher.switchTo(stage, "TrainingCertification"); // Assuming you have a TrainingCertification.fxml file
            } catch (IOException e) {
                e.printStackTrace();
                showError("Scene Switch Error", "Error occurred while switching scenes.");
            }
        } else {
            showError("Verification Failed", "Admin verification is required to access this panel.");
        }
    }

    // Handle Passenger Booking button click
    @FXML
    public void PassengerBookingOnAction(ActionEvent actionEvent) {
        System.out.println("Passenger Manifest button clicked.");

        if (isBookingAvailable()) {
            try {
                Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
                SceneSwitcher.switchTo(stage, "PassengerBooking"); // Assuming you have a PassengerBooking.fxml file
            } catch (IOException e) {
                e.printStackTrace();
                showError("Scene Switch Error", "Error occurred while switching scenes.");
            }
        } else {
            showError("Booking Unavailable", "No flights are available for booking at the moment.");
        }
    }

    // Handle Helicopter Management Radio selection
    @FXML
    public void helicopterManagementRadioOnAction(ActionEvent actionEvent) {
        System.out.println("Helicopter Management selected.");

        if (isHelicopterAvailable()) {
            try {
                Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
                SceneSwitcher.switchTo(stage, "HelicopterManagement"); // Assuming you have a HelicopterManagement.fxml file
            } catch (IOException e) {
                e.printStackTrace();
                showError("Scene Switch Error", "Error occurred while switching scenes.");
            }
        } else {
            showError("No Helicopters", "There are no helicopters available to manage.");
        }
    }

    // Helper methods for validations (no changes here)
    private boolean hasPermissionToAccessReports() {
        return true; // Example: return true if the admin has permission, false otherwise
    }

    private boolean isPilotListEmpty() {
        return false; // Assume there are pilots available for management
    }

    private boolean isFlightScheduleAvailable() {
        return true; // Assume there are flights scheduled
    }

    private boolean isAdminVerified() {
        return true; // Assume admin is verified
    }

    private boolean isBookingAvailable() {
        return true; // Assume booking is available
    }

    private boolean isHelicopterAvailable() {
        return true; // Assume helicopters are available
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
