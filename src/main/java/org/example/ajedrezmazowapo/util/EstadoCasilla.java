package org.example.ajedrezmazowapo.util;

import javafx.scene.paint.Color;

public enum EstadoCasilla {
    DESELECCIONADO, SELECCIONADO, PARAMOVER;

    public Color toColorJavaFx() {

        switch (this) {

            case DESELECCIONADO:
                return Color.GRAY;
            case SELECCIONADO:
                return Color.GREEN;
            case PARAMOVER:
                return Color.YELLOW;
            default:
                return null;
        }
    }


}
