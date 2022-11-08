package com.example.choiceboxvorlesung;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        VBox root = new VBox(10);
        Scene scene = new Scene(root, 320, 240);
        ChoiceBox<String> choiceBox = new ChoiceBox<>(FXCollections.observableArrayList("Mohammad","Ahmad","Hassan","Abdel"));
        choiceBox.getSelectionModel().select(0);

        ComboBox<String> comboBox = new ComboBox<>(FXCollections.observableArrayList("white","black","yellow","green"));
        comboBox.setPromptText("please cheese a color");
        comboBox.setEditable(true);
        root.getChildren().addAll(choiceBox,comboBox);

        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}