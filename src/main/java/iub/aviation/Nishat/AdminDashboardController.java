package iub.aviation.Nishat;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.RadioButton;

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
        // Validation/Verification logic (e.g., check if the admin has the right permissions)
        if (hasPermissionToAccessReports()) {
            // Add logic to open Reports and Analytics panel
            System.out.println("Accessing Reports and Analytics panel...");
        } else {
            showError("Access Denied", "You do not have permission to access Reports and Analytics.");
        }
    }

    // Handle Pilot Management Radio selection
    @FXML
    public void PilotManagementRadioOnAction(ActionEvent actionEvent) {
        System.out.println("Pilot Management selected.");
        // Simple validation: check if a pilot is already selected or manage a new pilot
        if (isPilotListEmpty()) {
            showError("No Pilots", "No pilots are available to manage.");
        } else {
            // Add logic to manage pilots
            System.out.println("Managing pilots...");
        }
    }

    // Handle Flight Scheduling button click
    @FXML
    public void FlightSchedulingOnAction(ActionEvent actionEvent) {
        System.out.println("Flight Scheduling button clicked.");
        // Check if any ongoing flight scheduling exists
        if (isFlightScheduleAvailable()) {
            // Add logic to open Flight Scheduling panel
            System.out.println("Accessing Flight Scheduling panel...");
        } else {
            showError("No Flights Scheduled", "There are no flights scheduled at the moment.");
        }
    }

    // Handle Training & Certification button click
    @FXML
    public void adminTrainingpanelOnAction(ActionEvent actionEvent) {
        System.out.println("Training & Certification button clicked.");
        // Verification check (e.g., Admin might need to be verified before accessing training modules)
        if (isAdminVerified()) {
            // Add logic to open Training and Certification panel
            System.out.println("Accessing Training & Certification panel...");
        } else {
            showError("Verification Failed", "Admin verification is required to access this panel.");
        }
    }

    // Handle Passenger Booking button click
    @FXML
    public void PassengerBookingOnAction(ActionEvent actionEvent) {
        System.out.println("Passenger Manifest button clicked.");
        // Validation check (e.g., check if a flight is available for booking)
        if (isBookingAvailable()) {
            // Add logic to open Passenger Booking or Manifest page
            System.out.println("Accessing Passenger Booking...");
        } else {
            showError("Booking Unavailable", "No flights are available for booking at the moment.");
        }
    }

    // Handle Helicopter Management Radio selection
    @FXML
    public void helicopterManagementRadioOnAction(ActionEvent actionEvent) {
        System.out.println("Helicopter Management selected.");
        // Simple validation: check if there are any helicopters in the system
        if (isHelicopterAvailable()) {
            // Add logic to manage helicopters
            System.out.println("Managing helicopters...");
        } else {
            showError("No Helicopters", "There are no helicopters available to manage.");
        }
    }

    // Helper methods for validations
    private boolean hasPermissionToAccessReports() {
        // Simple permission check logic (this can be extended)
        return true; // Example: return true if the admin has permission, false otherwise
    }

    private boolean isPilotListEmpty() {
        // Example validation: check if the pilot list is empty (this can be replaced with actual logic)
        return false; // Assume there are pilots available for management
    }

    private boolean isFlightScheduleAvailable() {
        // Example validation: check if flight schedule exists
        return true; // Assume there are flights scheduled
    }

    private boolean isAdminVerified() {
        // Example validation: verify if the admin is authorized
        return true; // Assume admin is verified
    }

    private boolean isBookingAvailable() {
        // Example validation: check if booking is possible (based on flight availability)
        return true; // Assume booking is available
    }

    private boolean isHelicopterAvailable() {
        // Example validation: check if there are helicopters available to manage
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
