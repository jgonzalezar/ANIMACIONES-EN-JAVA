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
public class Main {
    public static void main(String[] args) {
        Llanta[] llantas = new Llanta[4];
        for(int i = 0; i<4;i++){
            llantas[i]=new Llanta("x", "y", 20);
            
        }
        Puerta[] puertas = new Puerta[5];
        for (int i = 0;i<5;i++){
            puertas[i]=new Puerta("x");
            
    }
        Motor motor= new Motor("2", 20);
        Automovil autor = 
              new Automovil("x", 2, "Y", llantas, motor, puertas);
        
         
    }
    }

