package iub.aviation.Nishat;

import iub.aviation.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.io.IOException;

public class Profile_Settingscontroller_Pilot {

    @javafx.fxml.FXML
    private TextField fxPilotContactInfo;
    @javafx.fxml.FXML
    private TextField PilotRenewLicenceNum;
    @javafx.fxml.FXML
    private TextField CirtificationPilotfx;
    @javafx.fxml.FXML
    private TextField fxPilotFlightTime;
    @javafx.fxml.FXML
    private TextArea textfxid;
    @javafx.fxml.FXML
    private TextField fxidPilotName;

    @javafx.fxml.FXML
    public void initialize() {
        // Initialization logic if needed (e.g., pre-filling fields with existing data)
    }

    // Action for "Add" button - Adds new pilot information
    @javafx.fxml.FXML
    public void addpilotInformationsonAction(ActionEvent actionEvent) throws IOException {
        String name = fxidPilotName.getText();
        String contactInfo = fxPilotContactInfo.getText();
        String flightTime = fxPilotFlightTime.getText();
        String licenceNum = PilotRenewLicenceNum.getText();
        String certifications = CirtificationPilotfx.getText();

        // Placeholder for adding logic (e.g., saving data to a database or file)
        showInfo("Add Pilot", "Pilot information has been added successfully.\nName: " + name);

        // Optionally, clear the fields after adding
        clearFields();

        // After adding, switch to another scene (e.g., Pilot Dashboard)
        Stage stage = (Stage) actionEvent.getSource();
        SceneSwitcher.switchTo(stage, "PilotDashboard");
    }

    // Action for "Update" button - Updates existing pilot information
    @javafx.fxml.FXML
    public void updatepilotInformationsonAction(ActionEvent actionEvent) throws IOException {
        String name = fxidPilotName.getText();
        String contactInfo = fxPilotContactInfo.getText();
        String flightTime = fxPilotFlightTime.getText();
        String licenceNum = PilotRenewLicenceNum.getText();
        String certifications = CirtificationPilotfx.getText();

        // Placeholder for update logic (e.g., updating data in a database or file)
        showInfo("Update Pilot", "Pilot information has been updated successfully.\nName: " + name);

        // Optionally, clear the fields after updating
        clearFields();

        // After updating, switch to another scene (e.g., Pilot Dashboard)
        Stage stage = (Stage) actionEvent.getSource();
        SceneSwitcher.switchTo(stage, "PilotDashboard");
    }

    // Action for "Delete" button - Deletes pilot information
    @javafx.fxml.FXML
    public void deletepilotInformationsonAction(ActionEvent actionEvent) throws IOException {
        String name = fxidPilotName.getText();

        // Placeholder for delete logic (e.g., deleting data from a database or file)
        showInfo("Delete Pilot", "Pilot information has been deleted.\nName: " + name);

        // Optionally, clear the fields after deletion
        clearFields();

        // After deleting, switch to another scene (e.g., Pilot Dashboard)
        Stage stage = (Stage) actionEvent.getSource();
        SceneSwitcher.switchTo(stage, "PilotDashboard");
    }

    // Helper method to show informational alerts
    private void showInfo(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    // Helper method to clear input fields
    private void clearFields() {
        fxidPilotName.clear();
        fxPilotContactInfo.clear();
        fxPilotFlightTime.clear();
        PilotRenewLicenceNum.clear();
        CirtificationPilotfx.clear();
        textfxid.clear();
    }
}
