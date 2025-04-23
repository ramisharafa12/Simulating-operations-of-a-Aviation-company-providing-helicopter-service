package iub.aviation.Sadaf;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class ComplianceCertificates {
    @javafx.fxml.FXML
    private TextField cerIdTF1;
    @javafx.fxml.FXML
    private TextField cerIdTF;
    @javafx.fxml.FXML
    private Label certificateLB;
    @javafx.fxml.FXML
    private CheckBox checklistCB;
    @javafx.fxml.FXML
    private Label cerIdLB;
    @javafx.fxml.FXML
    private AnchorPane generateIdTF;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void notifyRecepientClickOnButton(ActionEvent actionEvent) {
        String recipientId = cerIdTF.getText();
        if (recipientId.isEmpty()) {
            showAlert("Notification Failed", "Please enter a valid certificate ID.", Alert.AlertType.ERROR);
            return;
        }
        showAlert("Notification Sent", "Recipient notified for certificate ID: " + recipientId, Alert.AlertType.INFORMATION);
    }

    private void showAlert(String notificationFailed, String s, Alert.AlertType alertType) {
    }

    @javafx.fxml.FXML
    public void sendCertificateClickOnButton(ActionEvent actionEvent) {
        String certificateId = cerIdTF.getText();
        if (certificateId.isEmpty()) {
            showAlert("Send Failed", "Please enter a valid certificate ID.", Alert.AlertType.ERROR);
            return;
        }
        // Logic to send the certificate (e.g., email the certificate)
        showAlert("Certificate Sent", "Certificate with ID: " + certificateId + " has been sent.", Alert.AlertType.INFORMATION);
    }

    @javafx.fxml.FXML
    public void generateCertificateClickOnButton(ActionEvent actionEvent) {
    }
}
