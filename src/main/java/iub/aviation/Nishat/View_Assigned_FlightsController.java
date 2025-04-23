package iub.aviation.Nishat;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class View_Assigned_FlightsController
{
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
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void searchForPilotFlightScheduleOnAction(ActionEvent actionEvent) {
    }
}