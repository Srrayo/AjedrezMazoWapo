package org.example.ajedrezmazowapo.util;

public enum TipoPieza {
    REY, REINA, ALFIL, TORRE, PEON, CABALLO;

    public String getNombrePieza() {
        switch (this) {
            case REY -> {
                return "rey";
            }
            case REINA -> {
                return "reina";
            }
            case ALFIL -> {
                return "alfil";
            }
            case TORRE -> {
                return "torre";
            }
            case PEON -> {
                return "peon";
            }
            case CABALLO -> {
                return "caballo";
            }
            default -> {
                return null;
            }
        }
    }
}
