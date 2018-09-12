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
public class Motor {
    private String numserie;
    private int cilindros;

    public Motor(String numserie, int cilindros) {
        this.numserie = numserie;
        this.cilindros = cilindros;
    }

    

    public String getNumserie() {
        return numserie;
    }

    public void setNumserie(String numserie) {
        this.numserie = numserie;
    }

    public int getCilindros() {
        return cilindros;
    }

    public void setCilindros(int cilindros) {
        this.cilindros = cilindros;
    }
    
    
}
