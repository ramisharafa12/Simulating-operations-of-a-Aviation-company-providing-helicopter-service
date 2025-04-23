package iub.aviation.Nishat;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class Flight_ScheduleController {

    @javafx.fxml.FXML
    private TableView TableFoePilotFlightShedulefx;
    @javafx.fxml.FXML
    private ComboBox flightToComboBoxFxif;
    @javafx.fxml.FXML
    private TableColumn HelicopterModelfx;
    @javafx.fxml.FXML
    private TableColumn LocationfxId;
    @javafx.fxml.FXML
    private TableColumn FlightTimefx;
    @javafx.fxml.FXML
    private ComboBox flightFromComboBoxfxid;
    @javafx.fxml.FXML
    private TableColumn pilotNamefxid;
    @javafx.fxml.FXML
    private DatePicker FlightScheduleDate;
    @javafx.fxml.FXML
    private TextArea flightdetails;

    @javafx.fxml.FXML
    public void initialize() {
        // Optionally initialize combo boxes, set default values, etc.
    }

    @javafx.fxml.FXML
    public void searchForPilotFlightScheduleOnAction(ActionEvent actionEvent) {
        if (isInputValid()) {
            // Logic for searching the flight schedule
            String flightDetails = "Flight Schedule for: \n"
                    + "From: " + flightFromComboBoxfxid.getValue() + "\n"
                    + "To: " + flightToComboBoxFxif.getValue() + "\n"
                    + "Date: " + FlightScheduleDate.getValue() + "\n";

            // Display the flight details in the TextArea
            flightdetails.setText(flightDetails);
        } else {
            // Show an error alert if the input is invalid
            showError("Validation Error", "Please ensure all fields are selected and the date is chosen.");
        }
    }

    @javafx.fxml.FXML
    public void changeFlightScheduleOnAction(ActionEvent actionEvent) {
        if (isInputValid()) {
            // Logic for changing the flight schedule
            // Add your logic here
            showInfo("Flight Schedule Changed", "The flight schedule has been successfully updated.");
        } else {
            showError("Validation Error", "Please ensure all fields are selected and the date is chosen.");
        }
    }

    @javafx.fxml.FXML
    public void cancelForFlightScheduleOnAction(ActionEvent actionEvent) {
        if (isInputValid()) {
            // Logic for canceling the flight schedule
            // Add your logic here
            showInfo("Flight Schedule Cancelled", "The flight schedule has been successfully cancelled.");
        } else {
            showError("Validation Error", "Please ensure all fields are selected and the date is chosen.");
        }
    }

    // Helper method to validate the inputs
    private boolean isInputValid() {
        return flightFromComboBoxfxid.getValue() != null
                && flightToComboBoxFxif.getValue() != null
                && FlightScheduleDate.getValue() != null;
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
