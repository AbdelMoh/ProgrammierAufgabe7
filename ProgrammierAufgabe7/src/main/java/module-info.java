module com.example.programmieraufgabe7 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.programmieraufgabe7 to javafx.fxml;
    exports com.example.programmieraufgabe7;
}