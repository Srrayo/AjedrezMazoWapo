package org.example.ajedrezmazowapo.util;

import javafx.scene.paint.Color;

public enum ColorAjedrez {
    BLANCO, NEGRO;

    public String getNombreColor() {
        switch (this) {
            case NEGRO -> {
                return "b";
            }
            case BLANCO -> {
                return "w";
            }
            default -> {
                return null;
            }
        }
    }

    public Color toColorjavaFx() {
        switch (this) {
            case NEGRO -> {
                return Color.BLACK;
            }
            case BLANCO -> {
                return Color.WHITE;
            }
            default -> {
                return null;
            }
        }
    }
}
