package org.example.ajedrezmazowapo;

import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;

public class Casilla {

    @FXML
    private HBox casillaBox;

    public void setColor(Color color) {
        casillaBox.setBackground(Background.fill(color));
    }
}
