module iub.aviation {
    requires javafx.controls;
    requires javafx.fxml;


    opens iub.aviation to javafx.fxml;
    exports iub.aviation;
}