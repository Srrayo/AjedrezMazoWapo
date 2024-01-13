package org.example.ajedrezmazowapo;

import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import org.example.ajedrezmazowapo.util.ColorAjedrez;
import org.example.ajedrezmazowapo.util.EstadoCasilla;
import org.example.ajedrezmazowapo.util.Pieza;
import org.example.ajedrezmazowapo.util.TipoPieza;

public class Casilla {
    @FXML
    private ImageView imagen;
    @FXML
    private HBox casillaBox;

    public Pieza piezaActual;
    public EstadoCasilla estado = EstadoCasilla.DESELECCIONADO;

    public Color colorOriginal;


    public void setColor(ColorAjedrez color) {
        casillaBox.setBackground(Background.fill(color.toColorjavaFx()));

    }

    public void setPieza(Pieza pieza) {
        this.piezaActual = pieza;
        if (pieza == null) {
            imagen.setImage(null);
        } else {
            String nombreFinal = pieza.tipoPieza.getNombrePieza();
            nombreFinal += "_";
            nombreFinal += pieza.color.getNombreColor();
            nombreFinal += ".png";
            Image imagenPieza = new Image("/piezas/" + nombreFinal, casillaBox.getMaxWidth(), casillaBox.getMaxHeight(), true, true);
            imagen.setImage(imagenPieza);
        }
    }
}
