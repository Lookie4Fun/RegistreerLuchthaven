module com.example.registreerluchthaven {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.registreerluchthaven to javafx.fxml;
    exports com.example.registreerluchthaven;
}