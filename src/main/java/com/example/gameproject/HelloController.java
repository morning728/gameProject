package com.example.gameproject;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class HelloController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button exitBtn;

    @FXML
    private Button newGameBtn;

    @FXML
    private Button optionsBtn;

    @FXML
    private Button savedGameBtn;

    @FXML
    void initialize() {
        exitBtn.setOnAction(actionEvent -> {
            Stage stage = (Stage) exitBtn.getScene().getWindow();
            stage.close();
        });
    }

}
