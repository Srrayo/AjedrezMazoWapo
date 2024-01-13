package org.example.ajedrezmazowapo;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;

import java.io.IOException;

public class Tablero {
    @FXML
    private GridPane tableroGridPane;

    private Casilla[][] casillas = new Casilla[8][8];

    @FXML
    public void initialize() throws IOException {
        for (int x = 0; x < 8; x++) {
            for (int y = 0; y < 8; y++) {
                FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("casilla.fxml"));
                tableroGridPane.add(fxmlLoader.load(), x, y);
                Casilla casilla = fxmlLoader.getController();
                casillas[x][y] = casilla;
                if ((x + y) % 2 == 0) {
                    casilla.setColor(Color.WHITE);
                } else {
                    casilla.setColor(Color.BLACK);
                }
            }
        }

        casillas[5][2].setColor(Color.RED);
    }
}
