module com.projects.kab27 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.projects.kab27 to javafx.fxml;
    exports com.projects.kab27;
}