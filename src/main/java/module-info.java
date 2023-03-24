module com.example.javafxgradle2 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires java.sql;

    opens com.example.javafxgradle2 to javafx.fxml;
    exports com.example.javafxgradle2;
}