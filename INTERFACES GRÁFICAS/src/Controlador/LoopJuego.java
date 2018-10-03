package Controlador;


import Modelo.Carro;
import Modelo.Chasis;
import javafx.animation.AnimationTimer;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class LoopJuego extends AnimationTimer{
    private GraphicsContext gc; //vista
    private Carro carro; //modelo
    private Chasis chasis;
    private Image fondo;
    private Image gato;
    private Image muneco;
    private Image ufo;
    

    public LoopJuego(GraphicsContext gc) {
       
        this.gc = gc;
        this.carro = new Carro(0,200);
        this.fondo = new Image("Imagenes/fondo.png");
        this.gato = new Image("Imagenes/cats.gif");
        this.muneco = new Image("Imagenes/down0.png");
        this.ufo = new Image("imagenes/ufo_0.png");
    }
    
    int x = 0;
    int frec=0;
    
    @Override
    public void handle(long l) {
   
        gc.clearRect(0,0,1024,512);
        gc.setFill(Color.BLUE);
        gc.fillRect(100, 100, 40, 40);
        //gc.fillRect(this.chasis.getCoordenadaX(),this.chasis.getCoordenadaY(),40,20);     
        gc.drawImage(fondo, 0, 0);
        
        if(frec%3==0){
            if(x==5){
                x=0;
            }else{
                x++;
            }
        }
        gc.drawImage(gato, 132*x, 0, 132, 80, 20, 20, 132, 80);
        //x++;
        gc.strokeRect(300,200,25,35);
        gc.drawImage(muneco, 300, 200);
        gc.strokeRect(50+frec,200,40,35);
        gc.drawImage(ufo, 50+frec, 200);
        
        Shape sUfo = 
                new Rectangle(50+frec,200,40,35);
        
        Shape sMuneco = 
                new Rectangle(300,200,25,35);
        
        Shape Intersection = SVGPath.intersect (sUfo,sMuneco);
        
        if(Intersection.getBoundsInLocal().getWidth()!=-1){
            
            stop();
            
        }
        frec++;
    }
    
}
