package org.example.ajedrezmazowapo;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.GridPane;
import org.example.ajedrezmazowapo.util.ColorAjedrez;
import org.example.ajedrezmazowapo.util.Pieza;
import org.example.ajedrezmazowapo.util.TipoPieza;

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
                    casilla.setColor(ColorAjedrez.BLANCO);
                } else {
                    casilla.setColor(ColorAjedrez.NEGRO);
                }
            }
        }

        for (int x = 0; x < 8; x++) {
            casillas[x][1].setPieza(new Pieza(TipoPieza.PEON, ColorAjedrez.NEGRO));
        }
        for (int x = 0; x < 8; x++) {
            casillas[x][6].setPieza(new Pieza(TipoPieza.PEON, ColorAjedrez.BLANCO));
        }

        casillas[0][0].setPieza(new Pieza(TipoPieza.TORRE, ColorAjedrez.NEGRO));
        casillas[7][0].setPieza(new Pieza(TipoPieza.TORRE, ColorAjedrez.NEGRO));
        casillas[1][0].setPieza(new Pieza(TipoPieza.CABALLO, ColorAjedrez.NEGRO));
        casillas[6][0].setPieza(new Pieza(TipoPieza.CABALLO, ColorAjedrez.NEGRO));
        casillas[2][0].setPieza(new Pieza(TipoPieza.ALFIL, ColorAjedrez.NEGRO));
        casillas[5][0].setPieza(new Pieza(TipoPieza.ALFIL, ColorAjedrez.NEGRO));
        casillas[3][0].setPieza(new Pieza(TipoPieza.REINA, ColorAjedrez.NEGRO));
        casillas[4][0].setPieza(new Pieza(TipoPieza.REY, ColorAjedrez.NEGRO));

        casillas[0][7].setPieza(new Pieza(TipoPieza.TORRE, ColorAjedrez.BLANCO));
        casillas[7][7].setPieza(new Pieza(TipoPieza.TORRE, ColorAjedrez.BLANCO));
        casillas[1][7].setPieza(new Pieza(TipoPieza.CABALLO, ColorAjedrez.BLANCO));
        casillas[6][7].setPieza(new Pieza(TipoPieza.CABALLO, ColorAjedrez.BLANCO));
        casillas[2][7].setPieza(new Pieza(TipoPieza.ALFIL, ColorAjedrez.BLANCO));
        casillas[5][7].setPieza(new Pieza(TipoPieza.ALFIL, ColorAjedrez.BLANCO));
        casillas[3][7].setPieza(new Pieza(TipoPieza.REINA, ColorAjedrez.BLANCO));
        casillas[4][7].setPieza(new Pieza(TipoPieza.REY, ColorAjedrez.BLANCO));

    }

    public void moverPieza(int x, int y, int destinoX, int destinoY) {
        Casilla casillaOrigen = casillas[x][y];
        Casilla casillaDestino = casillas[destinoX][destinoY];
        Pieza p = casillaOrigen.piezaActual;
        casillaDestino.setPieza(p);
        casillaOrigen.setPieza(null);
    }
}
