package iub.aviation.RamisaRafa;


import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

    public class EngineerDash
    {


        @javafx.fxml.FXML
        public void RespondtoRequestsforEmergencyRepairsOA(ActionEvent actionEvent) {
        }

        @javafx.fxml.FXML
        public void PlanforPreventiveMaintenanceOA(ActionEvent actionEvent) {
        }

        @javafx.fxml.FXML
        public void PerformHelicopterMaintenanceOperationsOA(ActionEvent actionEvent) {
            try {
                Parent root = FXMLLoader.load(getClass().getResource("engineer1.fxml"));
                Scene scene = new Scene(root);
                Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
                stage.setScene(scene);
                stage.show();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        @javafx.fxml.FXML
        public void thpOA(ActionEvent actionEvent) {
        }
    }
