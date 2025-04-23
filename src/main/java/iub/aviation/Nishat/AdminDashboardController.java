package iub.aviation.Nishat;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class AdminDashboardController {

    @FXML
    public void initialize() {
        System.out.println("Admin Dashboard Initialized");
    }

    @FXML
    public void ReportsAndAnalyticsOnAction(ActionEvent actionEvent) {
        System.out.println("Reports and Analytics button clicked.");
        // Add logic to open Reports and Analytics panel
    }

    @FXML
    public void PilotManagementRadioOnAction(ActionEvent actionEvent) {
        System.out.println("Pilot Management selected.");
        // Add logic to manage pilots
    }

    @FXML
    public void FlightSchedulingOnAction(ActionEvent actionEvent) {
        System.out.println("Flight Scheduling button clicked.");
        // Add logic to open Flight Scheduling panel
    }

    @FXML
    public void adminTrainingpanelOnAction(ActionEvent actionEvent) {
        System.out.println("Training & Certification button clicked.");
        // Add logic to open Training and Certification panel
    }

    @FXML
    public void PassengerBookingOnAction(ActionEvent actionEvent) {
        System.out.println("Passenger Manifest button clicked.");
        // Add logic to open Passenger Booking or Manifest page
    }

    @FXML
    public void helicopterManagementRadioOnAction(ActionEvent actionEvent) {
        System.out.println("Helicopter Management selected.");
        // Add logic to manage helicopters
    }
}
