package com.example.radiobutton;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Random;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        //XMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        VBox root = new VBox(10);
        Scene scene = new Scene(root, 320, 240);
        RadioButton radioButton1 = new RadioButton("r1");
        RadioButton radioButton2 = new RadioButton("r2");
        RadioButton radioButton3 = new RadioButton("r3");
        RadioButton radioButton4 = new RadioButton("r4");

        ToggleGroup toggleGroup = new ToggleGroup();
        toggleGroup.getToggles().addAll(radioButton1,radioButton2,radioButton3,radioButton4);

        root.getChildren().addAll(radioButton1,radioButton2,radioButton3,radioButton4);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}