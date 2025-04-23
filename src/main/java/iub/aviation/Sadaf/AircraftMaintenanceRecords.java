package iub.aviation.Sadaf;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
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
}


// Load sample data
loadSampleData();
    }

private void loadSampleData() {
    maintenanceRecords = FXCollections.observableArrayList(
            new MaintenanceRecord("Type A", "Completed", "Tech 1", "2023-10-01"),
            new MaintenanceRecord("Type B", "Pending", "Tech 2", "2023-10-02"),
            new MaintenanceRecord("Type C", "In Progress", "Tech 3", "2023-10-03")
    );
    maintainanceTV.setItems(maintenanceRecords);
}

@FXML
public void loadClickOnButton(ActionEvent actionEvent) {
    System.out.println("Load button clicked.");
    maintainanceTV.setItems(maintenanceRecords);
}

@FXML
public void flagIssueClickOnButton(ActionEvent actionEvent) {
    MaintenanceRecord selectedRecord = maintainanceTV.getSelectionModel().getSelectedItem();
    if (selectedRecord != null) {
        selectedRecord.setStatus("Flagged");
        maintainanceTV.refresh();
        System.out.println("Flagged issue for: " + selectedRecord.getMainType());
    } else {
        System.out.println("No record selected to flag.");
    }
}

@FXML
public void checkClickOnButton(ActionEvent actionEvent) {
    MaintenanceRecord selectedRecord = maintainanceTV.getSelectionModel().getSelectedItem();
    if (selectedRecord != null) {
        recDetailsLB.setText("Details for " + selectedRecord.getMainType() + ": " + selectedRecord.getStatus());
        System.out.println("Checked status for: " + selectedRecord.getMainType());
    } else {
        System.out.println("No record selected to check.");
    }
}

@FXML
public void approveClickOnButton(ActionEvent actionEvent) {
    MaintenanceRecord selectedRecord = maintainanceTV.getSelectionModel().getSelectedItem();
    if (selectedRecord != null) {
        selectedRecord.setStatus("Approved");
        maintainanceTV.refresh();
        System.out.println("Approved record for: " + selectedRecord.getMainType());
    } else {
        System.out.println("No record selected to approve.");
    }
}


