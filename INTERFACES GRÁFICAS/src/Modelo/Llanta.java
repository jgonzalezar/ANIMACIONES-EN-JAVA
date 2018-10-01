/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Estudiante
 */
public class Llanta {
    private int coordenadaX;
    private int coordenaday ;

    public Llanta(int coordenadaX, int coordenaday) {
        this.coordenadaX = coordenadaX;
        this.coordenaday = coordenaday;
    }

    public int getCoordenadaX() {
        return coordenadaX;
    }

    public void setCoordenadaX(int coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    public int getCoordenaday() {
        return coordenaday;
    }

    public void setCoordenaday(int coordenaday) {
        this.coordenaday = coordenaday;
    }
    
}
