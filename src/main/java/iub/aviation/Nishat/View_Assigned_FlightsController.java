package iub.aviation.Nishat;

import iub.aviation.SceneSwitcher;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.beans.property.SimpleStringProperty;
import javafx.stage.Stage;
import java.io.IOException;
import java.time.LocalDate;

public class View_Assigned_FlightsController {

    @FXML
    private TableView<PilotFlightSchedule> TableFoePilotFlightShedulefx;

    @FXML
    private ComboBox<String> flightToComboBoxFxif;

    @FXML
    private ComboBox<String> flightFromComboBoxfxid;

    @FXML
    private TableColumn<PilotFlightSchedule, String> HelicopterModelfx;

    @FXML
    private TableColumn<PilotFlightSchedule, String> LocationfxId;

    @FXML
    private TableColumn<PilotFlightSchedule, String> FlightTimefx;

    @FXML
    private TableColumn<PilotFlightSchedule, String> pilotNamefxid;

    @FXML
    private DatePicker FlightScheduleDate;

    @FXML
    public void initialize() {
        // Initialize combo boxes with airport options
        flightFromComboBoxfxid.getItems().addAll("Dhaka", "Chittagong", "Sylhet", "Cox's Bazar");
        flightToComboBoxFxif.getItems().addAll("Dhaka", "Chittagong", "Sylhet", "Cox's Bazar");

        // Set up the table column mappings
        pilotNamefxid.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getPilotName()));
        FlightTimefx.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getFlightTime()));
        HelicopterModelfx.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getHelicopterModel()));
        LocationfxId.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getLocation()));
    }

    @FXML
    public void searchForPilotFlightScheduleOnAction(ActionEvent actionEvent) throws IOException {
        LocalDate date = FlightScheduleDate.getValue();
        String from = flightFromComboBoxfxid.getValue();
        String to = flightToComboBoxFxif.getValue();

        if (date == null || from == null || to == null) {
            showAlert(Alert.AlertType.ERROR, "Missing Information", "Please select date, flight from, and flight to.");
            return;
        }

        if (from.equals(to)) {
            showAlert(Alert.AlertType.WARNING, "Invalid Input", "Flight From and To cannot be the same.");
            return;
        }

        // Dummy data for demonstration
        ObservableList<PilotFlightSchedule> flightList = FXCollections.observableArrayList(
                new PilotFlightSchedule("Captain Imran", "10:00 AM", "Bell 429", from + " → " + to),
                new PilotFlightSchedule("Captain Nabila", "2:00 PM", "Airbus H125", from + " → " + to)
        );

        TableFoePilotFlightShedulefx.setItems(flightList);

        // After searching, you can switch to another scene if necessary
        Stage stage = (Stage) actionEvent.getSource();
        SceneSwitcher.switchTo(stage, "FlightScheduleResults");  // Replace with your desired scene
    }

    private void showAlert(Alert.AlertType type, String title, String message) {
        Alert alert = new Alert(type);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
