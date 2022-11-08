package com.example.checkboxvorlesung;

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        //FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));

        VBox vbox = new VBox(10);
        Scene scene = new Scene(vbox, 320, 240);
        CheckBox checkBox1 = new CheckBox("Pizza");
        CheckBox checkBox2 = new CheckBox("Suppe");
        CheckBox checkBox3 = new CheckBox("Dönner");
       /* Button button = new Button("jetzt verbindlich abstellen");
        Label BestellungNachricht = new Label();
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                String message= "";
                if(checkBox1.isSelected())
                    message += checkBox1.getText() + " ";
                if (checkBox2.isSelected())
                    message += checkBox2.getText() + " ";
                if(checkBox3.isSelected())
                     message += checkBox3.getText()+ " ";

                BestellungNachricht.setText(message);
            }
        });*/
        //Property
        Label label = new Label();
        label.textProperty().bind(Bindings.concat(checkBox1.selectedProperty()));
        vbox.getChildren().addAll(checkBox1,checkBox2,checkBox3,label);
        label.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observableValue, String s, String t1) {
                System.out.println("the oldvalue " + s);
                System.out.println("the newvalue " +t1);
            }
        });

        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}