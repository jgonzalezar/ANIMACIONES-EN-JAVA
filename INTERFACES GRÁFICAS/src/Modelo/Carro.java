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
public class Carro {
    private int coordenadaX;
    private int coordenadaY;
    private Llanta[] llantas;
    private Chasis chasis;

    public Carro(int coordenadaX, int coordenaday) {
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenaday;
        this.chasis = chasis;
        this.llantas = new Llanta[2];
        this.llantas[0] = new Llanta(coordenadaX,coordenaday);
        this.llantas[1] = new Llanta(coordenadaX,coordenaday);
    }

        
    public int getCoordenadaX() {
        return coordenadaX;
    }

    public void setCoordenadaX(int coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    public int getCoordenaday() {
        return coordenadaY;
    }

    public void setCoordenaday(int coordenaday) {
        this.coordenadaY = coordenaday;
    }
    
    public void mover(){
        this.coordenadaX++;
    }
    
}
