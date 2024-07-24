package org.example.week11;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Dog API Client");

        TextField textField = new TextField();
        textField.setPromptText("Enter dog breed");

        Button button = new Button("Get Dog Image");
        TextArea textArea = new TextArea();
        textArea.setEditable(false);

        button.setOnAction(event -> {
            String breed = textField.getText();
            if (!breed.isEmpty()) {
                try {
                    String jsonResponse = DogClient.getDogImage(breed);
                    String imageUrl = DogClient.parseDogImage(jsonResponse);
                    textArea.setText("Image URL: " + imageUrl);
                } catch (IOException | InterruptedException e) {
                    textArea.setText("Error retrieving data: " + e.getMessage());
                }
            } else {
                textArea.setText("Please enter a dog breed.");
            }
        });

        VBox vbox = new VBox(textField, button, textArea);
        Scene scene = new Scene(vbox, 400, 300);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
  