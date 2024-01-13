package org.example.ajedrezmazowapo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage window) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("tablero.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 800, 800);
        window.setResizable(false);
        window.setTitle("Ajedrez");
        window.setScene(scene);
        window.show();
    }

    public static void main(String[] args) {
        launch();
    }
}