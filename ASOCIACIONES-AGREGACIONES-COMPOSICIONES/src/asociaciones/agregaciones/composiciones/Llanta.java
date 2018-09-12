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
public class Llanta {
    private String marca;
    private String modelo;
    private int tamano;

    public Llanta(String marca, String modelo, int tamano) {
        this.marca = marca;
        this.modelo = modelo;
        this.tamano = tamano;
    }

    

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }
    
    
}
