package com.menu;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class infoController {

    @FXML
    private Button okButton;

    @FXML
    void initialize() {
        okButton.setOnAction(event ->{
            Stage stage1 = (Stage) okButton.getScene().getWindow();
            // do what you have to do
            stage1.close();
        });
    }
}
