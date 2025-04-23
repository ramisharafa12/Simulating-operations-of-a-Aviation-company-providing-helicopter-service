package iub.aviation.RamisaRafa;

import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class Trainer4Controller {
    @javafx.fxml.FXML
    private TableColumn <Trainer4Controller,String>SimulatornameTC;
    @javafx.fxml.FXML
    private TableColumn <Trainer4Controller,String>PerformanceReportTC;
    @javafx.fxml.FXML
    private TableColumn <Trainer4Controller,String>equipmentnameTC;
    @javafx.fxml.FXML
    private TextField equipmentnameTF;
    @javafx.fxml.FXML
    private TextField PerformanceReportTF;
    @javafx.fxml.FXML
    private TableView <Trainer4Controller>Tableview;
    @javafx.fxml.FXML
    private TextField SimulatornameTF;

    @javafx.fxml.FXML
    public void exportOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void requestmaintainenceOA(ActionEvent actionEvent) {
    }
}
