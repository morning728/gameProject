module com.example.gameproject {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.gameproject to javafx.fxml;
    exports com.example.gameproject;
    exports com.example.gameproject.Controllers;
    opens com.example.gameproject.Controllers to javafx.fxml;
}