package iub.aviation.RamisaRafa;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class Engineer3Controller {
    @javafx.fxml.FXML
    private TextField assignengineerTF;
    @javafx.fxml.FXML
    private TextField FaultdetailsTF;
    @javafx.fxml.FXML
    private TableColumn <Engineer3Controller,String>HelicopterTC;
    @javafx.fxml.FXML
    private TextField RepairnotesTF;
    @javafx.fxml.FXML
    private TableColumn <Engineer3Controller,String>AssignengineerTC;
    @javafx.fxml.FXML
    private ComboBox <String>helicopterCB;
    @javafx.fxml.FXML
    private TableView <Engineer3Controller>tableview;
    @javafx.fxml.FXML
    private TableColumn <Engineer3Controller,String>FaultdetailsTC;



    @javafx.fxml.FXML
    public void updatestatusOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void addOA(ActionEvent actionEvent) {
    }
}
