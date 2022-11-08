package com.example.togglebutton;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        //FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        VBox vbox = new VBox(10);
        ToggleButton toggleButton1 = new ToggleButton("rot");
        ToggleButton toggleButton2 = new ToggleButton("green");
        ToggleButton toggleButton3 = new ToggleButton("blau");

        ToggleGroup toggleGroup = new ToggleGroup();
        toggleButton1.setToggleGroup(toggleGroup);
        toggleButton2.setToggleGroup(toggleGroup);
        toggleButton3.setToggleGroup(toggleGroup);

        Scene scene = new Scene(vbox, 320, 240);
        vbox.getChildren().addAll(toggleButton1,toggleButton2,toggleButton3);

        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}