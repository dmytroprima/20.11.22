package com.menu;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;

import static com.menu.Main.worker;

public class createController {

    @FXML
    private TextField candy;

    @FXML
    private TableColumn<String, String> candyName;

    @FXML
    private TextField giftName;

    @FXML
    private Button addButton;

    @FXML
    private TableColumn<String, Integer> priceCandy;

    @FXML
    private Button saveButton;


    @FXML
    void initialize() throws SQLException {

        addButton.setOnAction(event ->{
            Statement statement = null;
            try {
                statement = worker.connection.createStatement();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            String gift = giftName.getText();
            String candyName = candy.getText();
            Random random = new Random();
            int position = random.nextInt(1000000);
            String query = "insert into gifts(name, candy, position) values ('"+ gift + "','" + candyName +"'," + position+")";
            try {
                statement.execute(query);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        });
        saveButton.setOnAction(event ->{
            Stage stage1 = (Stage) saveButton.getScene().getWindow();
            // do what you have to do
            stage1.close();
        });
    }
}
