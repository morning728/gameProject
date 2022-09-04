package com.example.gameproject.Controllers;

import java.io.IOException;
import java.net.URL;
import java.util.LinkedList;
import java.util.ResourceBundle;

import com.example.gameproject.HelloApplication;
import com.example.gameproject.Models.Charactr;
import com.example.gameproject.Services.ICharacterRepository;
import com.example.gameproject.Services.MockCharacterRepository;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class MainMenuController {

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


    }
    @FXML
    public void onExitClickMethod(){
        Stage stage = (Stage) exitBtn.getScene().getWindow();
        ICharacterRepository characterRepository = new MockCharacterRepository();
        LinkedList<Charactr> l = characterRepository.getCharactrs();
        System.out.println(l.getFirst().getName());
        stage.close();
    }
    @FXML
    public void onNewGameMethod() throws IOException {
        Stage stage = (Stage) exitBtn.getScene().getWindow();
        stage.close();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("D:\\MySpace\\javaProjects\\gameProject\\src\\main\\resources\\com\\example\\gameproject\\hello-view.fxml"));
        stage = new Stage();
        stage.setTitle("Другая форма");
        stage.setScene(new Scene(fxmlLoader.load(), 1280, 800));
        stage.show();


    }

}
