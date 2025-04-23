package iub.aviation.Nishat;

import iub.aviation.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.stage.Stage;
import java.time.LocalDate;
import java.io.IOException;

public class Flight_ScheduleController {

    @javafx.fxml.FXML
    private ComboBox<String> flightFromfxid;
    @javafx.fxml.FXML
    private ComboBox<String> flightToFxif;
    @javafx.fxml.FXML
    private DatePicker datepicker;
    @javafx.fxml.FXML
    private TextArea flightdetails;

    @javafx.fxml.FXML
    public void initialize() {
        // Sample airport locations
        flightFromfxid.getItems().addAll("Dhaka", "Chittagong", "Sylhet", "Cox's Bazar");
        flightToFxif.getItems().addAll("Dhaka", "Chittagong", "Sylhet", "Cox's Bazar");
    }

    @javafx.fxml.FXML
    public void searchForFlightScheduleOnAction(ActionEvent actionEvent) throws IOException {
        LocalDate flightDate = datepicker.getValue();
        String from = flightFromfxid.getValue();
        String to = flightToFxif.getValue();

        if (flightDate == null || from == null || to == null) {
            showError("Missing Input", "Please select a date, departure and destination.");
            return;
        }

        if (from.equals(to)) {
            showError("Invalid Input", "Departure and destination cannot be the same.");
            return;
        }

        // Sample result
        String result = "Flight Schedule Found:\n"
                + "Date: " + flightDate + "\n"
                + "From: " + from + "\n"
                + "To: " + to + "\n"
                + "Time: 10:00 AM\n"
                + "Flight No: BGH-205";
        flightdetails.setText(result);

        // Switch to the next scene (for example, FlightDetails.fxml)
        Stage stage = (Stage) flightdetails.getScene().getWindow();
        SceneSwitcher.switchTo(stage, "FlightDetails");
    }

    @javafx.fxml.FXML
    public void cancelForFlightScheduleOnAction(ActionEvent actionEvent) throws IOException {
        LocalDate flightDate = datepicker.getValue();
        String from = flightFromfxid.getValue();
        String to = flightToFxif.getValue();

        if (flightDate == null || from == null || to == null) {
            showError("Missing Input", "Please select a date, departure and destination.");
            return;
        }

        String message = "Flight on " + flightDate + " from " + from + " to " + to + " has been cancelled.";
        flightdetails.setText(message);
        showInfo("Cancelled", message);

        // Switch to the next scene (e.g., AdminDashboard.fxml)
        Stage stage = (Stage) flightdetails.getScene().getWindow();
        SceneSwitcher.switchTo(stage, "AdminDashboard");
    }

    @javafx.fxml.FXML
    public void changeFlightScheduleOnAction(ActionEvent actionEvent) throws IOException {
        LocalDate flightDate = datepicker.getValue();
        String from = flightFromfxid.getValue();
        String to = flightToFxif.getValue();

        if (flightDate == null || from == null || to == null) {
            showError("Missing Input", "Please select a date, departure and destination.");
            return;
        }

        String newDate = flightDate.plusDays(1).toString(); // Example logic: shift flight to next day
        String message = "Flight rescheduled:\nFrom " + from + " to " + to + "\nNew Date: " + newDate;
        flightdetails.setText(message);
        showInfo("Schedule Updated", message);

        // Switch to the next scene (e.g., AdminDashboard.fxml)
        Stage stage = (Stage) flightdetails.getScene().getWindow();
        SceneSwitcher.switchTo(stage, "AdminDashboard");
    }

    // Show information alert
    private void showInfo(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    // Show error alert
    private void showError(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
