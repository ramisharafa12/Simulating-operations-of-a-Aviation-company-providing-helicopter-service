package iub.aviation.RamisaRafa;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class Trainer1Controller {
    @javafx.fxml.FXML
    private TableColumn <Trainer1Controller,String>HelicopterTC;
    @javafx.fxml.FXML
    private TextField sessionTF;
    @javafx.fxml.FXML
    private TextField instructorTF;
    @javafx.fxml.FXML
    private ComboBox <String>helicopterCB;
    @javafx.fxml.FXML
    private TableColumn <Trainer1Controller,Integer>TrainingsessionTC;
    @javafx.fxml.FXML
    private TableView <Trainer1Controller>tableview;
    @javafx.fxml.FXML
    private TableColumn <Trainer1Controller,String>instructorTC;
    @javafx.fxml.FXML
    private TextField PerformanceTF;
    @javafx.fxml.FXML
    private TextField TrainingsessionTF;
    @javafx.fxml.FXML
    private TableColumn <Trainer1Controller,String>sessionTC;

    @javafx.fxml.FXML
    public void submitOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void addOA(ActionEvent actionEvent) {
    }
}
