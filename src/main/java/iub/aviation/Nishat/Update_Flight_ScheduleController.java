package iub.aviation.Nishat;

import iub.aviation.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.Stage;
import java.io.IOException;
import java.time.LocalDate;

public class Update_Flight_ScheduleController {

    @FXML
    private ComboBox<String> updateflightFromfxid;
    @FXML
    private ComboBox<String> updateflightToFxif;
    @FXML
    private DatePicker FlightDatePckerfx;
    @FXML
    private TextArea updateflightdetails;
    @FXML
    private TextField flightNoFxID;

    @FXML
    public void initialize() {
        // Add airport locations to ComboBoxes
        updateflightFromfxid.getItems().addAll("Dhaka", "Chittagong", "Sylhet", "Cox's Bazar");
        updateflightToFxif.getItems().addAll("Dhaka", "Chittagong", "Sylhet", "Cox's Bazar");
    }

    @FXML
    public void UpdateflightForPilotrOnAction(ActionEvent actionEvent) throws IOException {
        String flightNo = flightNoFxID.getText();
        LocalDate date = FlightDatePckerfx.getValue();
        String from = updateflightFromfxid.getValue();
        String to = updateflightToFxif.getValue();

        if (flightNo == null || flightNo.isEmpty() || date == null || from == null || to == null) {
            showAlert(Alert.AlertType.ERROR, "Missing Information", "Please fill in all fields.");
            return;
        }

        if (from.equals(to)) {
            showAlert(Alert.AlertType.ERROR, "Invalid Input", "Flight From and To cannot be the same.");
            return;
        }

        // Show update details
        String details = "Flight Updated Successfully:\n"
                + "Flight No: " + flightNo + "\n"
                + "Date: " + date + "\n"
                + "From: " + from + "\n"
                + "To: " + to + "\n"
                + "Status: Scheduled";

        updateflightdetails.setText(details);
        showAlert(Alert.AlertType.INFORMATION, "Flight Updated", "The flight schedule has been successfully updated.");

        // After successful update, switch to another scene (for example, the "AdminDashboard" scene)
        Stage stage = (Stage) actionEvent.getSource();
        SceneSwitcher.switchTo(stage, "AdminDashboard");  // Replace with your desired scene
    }

    @FXML
    public void deleteForFlightUpdateSchrdulrOnAction(ActionEvent actionEvent) throws IOException {
        String flightNo = flightNoFxID.getText();

        if (flightNo == null || flightNo.isEmpty()) {
            showAlert(Alert.AlertType.ERROR, "Missing Flight Number", "Please enter the flight number to cancel.");
            return;
        }

        updateflightdetails.setText("Flight No " + flightNo + " has been cancelled.");
        showAlert(Alert.AlertType.INFORMATION, "Flight Cancelled", "Flight " + flightNo + " is cancelled successfully.");

        // After cancellation, switch to another scene (for example, the "AdminDashboard" scene)
        Stage stage = (Stage) actionEvent.getSource();
        SceneSwitcher.switchTo(stage, "AdminDashboard");  // Replace with your desired scene
    }

    private void showAlert(Alert.AlertType alertType, String title, String message) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
