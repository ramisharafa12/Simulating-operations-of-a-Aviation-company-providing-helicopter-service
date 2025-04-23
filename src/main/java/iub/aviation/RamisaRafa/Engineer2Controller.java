package iub.aviation.RamisaRafa;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Engineer2Controller {
    @javafx.fxml.FXML
    private TextField assignengineerTF;
    @javafx.fxml.FXML
    private TableColumn<Engineer2ModelClass, String> MaintenancetaskTC;
    @javafx.fxml.FXML
    private TextField maintenancetaskTF;
    @javafx.fxml.FXML
    private DatePicker maintenancedateDP;
    @javafx.fxml.FXML
    private ComboBox<String> helicopterCB;
    @javafx.fxml.FXML
    private TableColumn<Engineer2ModelClass, String> helicopterTC;
    @javafx.fxml.FXML
    private TableView<Engineer2ModelClass> tableview;
    @javafx.fxml.FXML
    private TableColumn<Engineer2ModelClass, String> assignengineerTC;

    private ArrayList<Engineer2ModelClass> userList = new ArrayList<>();
    @javafx.fxml.FXML
    private Label label;

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
        String maintenance = maintenancetaskTF.getText();
        String status = assignengineerTF.getText();
        String helicopter = helicopterCB.getValue();

        if (status.isBlank() || maintenance == null || helicopter == null || status == null || helicopter == null) {
            label.setText("Enter valid inputs.");
            return;
        } else {
            label.setText("");
        }

        maintenancetaskTF.clear();
        assignengineerTF.clear();
        helicopterCB.setValue(null);

        Engineer2ModelClass u = new Engineer2ModelClass(status, maintenance, helicopter);
        tableview.getItems().add(u);
        userList.add(u);
    }

    @javafx.fxml.FXML
    public void sendplanOA(ActionEvent actionEvent) throws IOException {

        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("engineer02.bin"));
            for (Engineer2ModelClass u : tableview.getItems())
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
            {
            }

        }
    }
}