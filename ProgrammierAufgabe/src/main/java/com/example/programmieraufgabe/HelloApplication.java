package com.example.programmieraufgabe;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
enum Geschlecht {
    männlich,weiblich
        }
public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        VBox vbox = new VBox(10);
        Scene scene = new Scene(vbox, 320, 240);
        Label Bewerbungsformullar = new Label("Bewerbungsformular:");
        TextField vollname = new TextField();
        Bewerbungsformullar.setFocusTraversable(true);
        vollname.setPromptText("Geben Sie Ihren vollständigen Namen ein");
        ComboBox Geschlechte = new ComboBox(FXCollections.observableArrayList(Geschlecht.männlich,Geschlecht.weiblich));
        Geschlechte.setPromptText("Wählen Sie Ihr Geschlecht");
        ComboBox<String> alter = new ComboBox<>();
        alter.setPromptText("Wählen Sie Ihr Alter");
        boolean altergroßerals16 = false;
        alter.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if(alter.getItems()
            }
        });
        for (int i = 1; i <=100 ; i++) {
            alter.getItems().add((String.valueOf(i)));
            }

        TextField Beschreibung = new TextField();
        Beschreibung.setPromptText("Beschreiben Sie sich mit einem Wort");
        Button DatenAbschicken = new Button("Daten jetzt abschicken");
        DatenAbschicken.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if((Geschlechte.getItems().equals("weiblich"))&&(alter.getItems().))
            }
        });

        vbox.getChildren().addAll(Bewerbungsformullar,vollname,Geschlechte,alter,Beschreibung,DatenAbschicken);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}