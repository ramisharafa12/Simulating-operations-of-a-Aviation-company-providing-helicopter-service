package iub.aviation.RamisaRafa;

import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class Trainer3Controller {
    @javafx.fxml.FXML
    private TableColumn <Trainer3Controller,String>SelectTraineeTC;
    @javafx.fxml.FXML
    private TableColumn <Trainer3Controller,String>InstructorcommentsTC;
    @javafx.fxml.FXML
    private TextField SelectTraineeTF;
    @javafx.fxml.FXML
    private TextField performanceratingsTF;
    @javafx.fxml.FXML
    private TextField InstructorcommentsTF;
    @javafx.fxml.FXML
    private TableColumn <Trainer3Controller,String>RecordNotesTC;
    @javafx.fxml.FXML
    private TableColumn<Trainer3Controller,Integer> performanceratingsTC;
    @javafx.fxml.FXML
    private TableView <Trainer3Controller>Tableview;
    @javafx.fxml.FXML
    private TextField RecordNotesTF;

    @javafx.fxml.FXML
    public void sendreportOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void addOA(ActionEvent actionEvent) {
    }
}
