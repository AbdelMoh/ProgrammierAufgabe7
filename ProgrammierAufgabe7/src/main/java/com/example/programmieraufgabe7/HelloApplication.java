package com.example.programmieraufgabe7;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        VBox root = new VBox(10);
        Scene scene = new Scene(root, 500, 500);
        Label quation1 = new Label("Was ist die Hauptstadt von Frankreich ? ");
        RadioButton radioButton11 = new RadioButton("Berlin");
        RadioButton radioButton12 = new RadioButton("Stutgart");
        RadioButton radioButton13 = new RadioButton("Paris");
        ToggleGroup toggleGroup1 = new ToggleGroup();
        toggleGroup1.getToggles().addAll(radioButton11,radioButton12,radioButton13);
        Label quation2 = new Label("Welches Betriebssystem stammt von Apple ? ");
        RadioButton radioButton21 = new RadioButton("Windows");
        RadioButton radioButton22 = new RadioButton("IOS");
        RadioButton radioButton23 = new RadioButton("linux");
        ToggleGroup toggleGroup2 = new ToggleGroup();
        toggleGroup2.getToggles().addAll(radioButton21,radioButton22,radioButton23);
        Label quation3 = new Label("in welchem Jahr wurde der Euro als Bargeld eingeführt ? ");
        RadioButton radioButton31 = new RadioButton("1990");
        RadioButton radioButton32 = new RadioButton("2001");
        RadioButton radioButton33 = new RadioButton("2002");
        ToggleGroup toggleGroup3 = new ToggleGroup();
        toggleGroup3.getToggles().addAll(radioButton31,radioButton32,radioButton33);
        Label ergebnisZeigen = new Label();
        Button ergebnisAnfodern = new Button("mein Ergebnis anfordern");
        ergebnisAnfodern.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if((radioButton13.isSelected())&&(radioButton22.isSelected())&&(radioButton31.isSelected()))
                {
                    ergebnisZeigen.setText("Sie haben gewonnen !!!");
                }
                else
                {
                    ergebnisZeigen.setText("Sie haben verloren");
                }
            }
        });
        root.getChildren().addAll(quation1,radioButton11,radioButton12,radioButton13,quation2,radioButton21,radioButton22,radioButton23,quation3,radioButton31,radioButton32,radioButton33,ergebnisAnfodern,ergebnisZeigen);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}