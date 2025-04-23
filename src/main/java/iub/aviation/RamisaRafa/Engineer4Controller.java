package iub.aviation.RamisaRafa;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class Engineer4Controller {
    @javafx.fxml.FXML
    private TextField flightlogsTF;
    @javafx.fxml.FXML
    private TableColumn <Engineer4Controller,String>HelicopterTC;
    @javafx.fxml.FXML
    private TextField sensordataTF;
    @javafx.fxml.FXML
    private TableColumn <Engineer4Controller,String>ReportAreaTC;
    @javafx.fxml.FXML
    private TableView <Engineer4Controller>Tableview;
    @javafx.fxml.FXML
    private ComboBox <String>helicopterCB;
    @javafx.fxml.FXML
    private TextField ReportAreaTF;
    @javafx.fxml.FXML
    private TableColumn <Engineer4Controller,String>sensordataTC;
    @javafx.fxml.FXML
    private TableColumn <Engineer4Controller,Integer>flightlogsTC;

    @javafx.fxml.FXML
    public void addOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void exportreportOA(ActionEvent actionEvent) {
    }
}
