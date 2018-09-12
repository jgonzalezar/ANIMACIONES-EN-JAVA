/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asociaciones.agregaciones.composiciones;

/**
 *
 * @author Estudiante
 */
public class Automovil {
    private String Marca;
    private int annio;
    private String Modelo;

    private Llanta[] llantas;
    private Motor motor;
    private Puerta [] puertas;

    public Automovil(String Marca, int annio, String Modelo) {
        this.Marca = Marca;
        this.annio = annio;
        this.Modelo = Modelo;
        this.llantas= new Llanta[4];
        this.puertas=new Puerta[4];
    }

    public Automovil(String Marca, int annio, String Modelo, Llanta[] llantas, Motor motor, Puerta[] puertas) {
        this.Marca = Marca;
        this.annio = annio;
        this.Modelo = Modelo;
        this.llantas = llantas;
        this.motor = motor;
        this.puertas = puertas;
    }

    public Llanta[] getLlantas() {
        return llantas;
    }

    public void setLlantas(Llanta[] llantas) {
        this.llantas = llantas;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Puerta[] getPuertas() {
        return puertas;
    }

    public void setPuertas(Puerta[] puertas) {
        this.puertas = puertas;
    }
    
    
    

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public int getAnnio() {
        return annio;
    }

    public void setAnnio(int annio) {
        this.annio = annio;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }
    
    
}
