package iub.aviation.RamisaRafa;

import javafx.event.ActionEvent;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.time.LocalDate;

public class Trainer2Controller {
    @javafx.fxml.FXML
    private TableColumn <Trainer2Controller,String>TraineenameTC;
    @javafx.fxml.FXML
    private TableColumn <Trainer2Controller,String>venueTC;
    @javafx.fxml.FXML
    private TextField traineeTF;
    @javafx.fxml.FXML
    private TextField trainernameTF;
    @javafx.fxml.FXML
    private TextField coursenameTF;
    @javafx.fxml.FXML
    private TableView <Trainer2Controller>tableview;
    @javafx.fxml.FXML
    private TableColumn <Trainer2Controller,String>TrainernameTC;
    @javafx.fxml.FXML
    private TextField venueTF;
    @javafx.fxml.FXML
    private TableColumn <Trainer2Controller, LocalDate>dateTC;
    @javafx.fxml.FXML
    private DatePicker trainingdateDP;
    @javafx.fxml.FXML
    private TableColumn <Trainer2Controller,String>CourseTC;

    @javafx.fxml.FXML
    public void addOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void postscheduleOA(ActionEvent actionEvent) {
    }
}
