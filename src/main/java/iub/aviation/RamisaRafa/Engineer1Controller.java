package iub.aviation.RamisaRafa;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.ArrayList;

public class Engineer1Controller {
    @javafx.fxml.FXML
    private ComboBox<String> helicopterCB;
    @javafx.fxml.FXML
    private TextField replacementpartsTF;
    @javafx.fxml.FXML
    private Label label;
    @javafx.fxml.FXML
    private TableColumn<engineer01, String> replacementTC;
    @javafx.fxml.FXML
    private TableColumn<engineer01, String> systemTC;
    @javafx.fxml.FXML
    private TableColumn<engineer01, String> problemTC;
    @javafx.fxml.FXML
    private TableColumn<engineer01, String> statusTC;
    @javafx.fxml.FXML
    private TextField reportproblemTF;
    @javafx.fxml.FXML
    private TableColumn<engineer01, String> helicopterTC;
    @javafx.fxml.FXML
    private TableView<engineer01> tableview;
    @javafx.fxml.FXML
    private TextField systemcheckTF;
    @javafx.fxml.FXML
    private TextField maintainencestatusTF;

    private ArrayList<engineer01> userList = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {
        helicopterCB.getItems().addAll("Bell 429", "Airbus H130", "Bell 407", "Bell 206");
        helicopterCB.setValue("Select");

        helicopterTC.setCellValueFactory(new PropertyValueFactory<>("helicopter"));
        systemTC.setCellValueFactory(new PropertyValueFactory<>("system"));
        replacementTC.setCellValueFactory(new PropertyValueFactory<>("replacement"));
        problemTC.setCellValueFactory(new PropertyValueFactory<>("problem"));
        statusTC.setCellValueFactory(new PropertyValueFactory<>("status"));
    }


    @javafx.fxml.FXML
    public void addOA(ActionEvent actionEvent) {

        String system = systemcheckTF.getText();
        String replacement = replacementpartsTF.getText();
        String problem = reportproblemTF.getText();
        String status = maintainencestatusTF.getText();
        String helicopter = helicopterCB.getValue();

        if (system.isBlank() || replacement == null || problem == null || status == null || helicopter == null) {
            label.setText("Enter valid inputs.");
            return;
        } else {
            label.setText("");
        }

        systemcheckTF.clear();
        reportproblemTF.clear();
        replacementpartsTF.clear();
        maintainencestatusTF.clear();
        helicopterCB.setValue(null);

        engineer01 u = new engineer01(system, problem, replacement, status, helicopter);
        tableview.getItems().add(u);
        userList.add(u);
    }

    @javafx.fxml.FXML
    public void approveOA(ActionEvent actionEvent) throws IOException {

        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("engineer01.bin"));
            for (engineer01 u : tableview.getItems())
                oos.writeObject(u);

        } catch (IOException e) {
            label.setText("Saved in file");
            e.printStackTrace();
        } finally {
            try {
                if (oos != null) oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }


        }

    }
}