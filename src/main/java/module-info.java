module org.utleon.zarapeproyecto {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.utleon.zarapeproyecto to javafx.fxml;
    exports org.utleon.zarapeproyecto;
}