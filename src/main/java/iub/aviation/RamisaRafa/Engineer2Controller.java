package iub.aviation.RamisaRafa;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class Engineer2Controller {
    @javafx.fxml.FXML
    private TextField assignengineerTF;
    @javafx.fxml.FXML
    private TableColumn MaintenancetaskTC;
    @javafx.fxml.FXML
    private TextField maintenancetaskTF;
    @javafx.fxml.FXML
    private DatePicker maintenancedateDP;
    @javafx.fxml.FXML
    private ComboBox helicopterCB;
    @javafx.fxml.FXML
    private TableColumn helicopterTC;
    @javafx.fxml.FXML
    private TableView tableview;
    @javafx.fxml.FXML
    private TableColumn assignengineerTC;

    @javafx.fxml.FXML
    public void initialize() {
        helicopterCB.getItems().addAll("Bell 429", "Airbus H130", "Bell 407", "Bell 206");
        helicopterCB.setValue("Select");

        helicopterTC.setCellValueFactory(new PropertyValueFactory<>("helicopter"));
        MaintenancetaskTC.setCellValueFactory(new PropertyValueFactory<>("maintenance"));
        assignengineerTC.setCellValueFactory(new PropertyValueFactory<>("assign"));

    }

    @javafx.fxml.FXML
    public void addOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void sendplanOA(ActionEvent actionEvent) {
    }
}
