package iub.aviation.Sadaf;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

public class AircraftMaintenanceRecords {
    @javafx.fxml.FXML
    private TableColumn<MaintenanceRecord, String> mainTypeTC;
    @javafx.fxml.FXML
    private Label mainTabLB;
    @javafx.fxml.FXML
    private TableColumn<MaintenanceRecord, String> statusTC;
    @javafx.fxml.FXML
    private AnchorPane notesTC;
    @javafx.fxml.FXML
    private TextField secAirTF;
    @javafx.fxml.FXML
    private TableView<MaintenanceRecord> maintainanceTV;
    @javafx.fxml.FXML
    private TableColumn<MaintenanceRecord, String> techTC;
    @javafx.fxml.FXML
    private TableColumn<MaintenanceRecord, String> dateTC;
    @javafx.fxml.FXML
    private Label recDetailsLB;
    @javafx.fxml.FXML
    private Label secAirLB;
    @javafx.fxml.FXML
    private TextField recordTF;

    private ObservableList<MaintenanceRecord> maintenanceRecords;


    @javafx.fxml.FXML
    public void initialize() {
        mainTypeTC.setCellValueFactory(new PropertyValueFactory<>("mainType"));
        statusTC.setCellValueFactory(new PropertyValueFactory<>("status"));
        techTC.setCellValueFactory(new PropertyValueFactory<>("technician"));
        dateTC.setCellValueFactory(new PropertyValueFactory<>("date"));

    }

    @javafx.fxml.FXML
    public void loadClickOnButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void flagIssueClickOnButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void checkClickOnBUtton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void approveClickOnButton(ActionEvent actionEvent) {
    }
}

