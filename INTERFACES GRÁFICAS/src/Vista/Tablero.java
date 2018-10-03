package Vista;


import Controlador.LoopJuego;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

import javafx.stage.Stage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class Tablero extends Application{

    @Override
    public void start(Stage stage) throws Exception {
        //Layout
        Pane panel = new Pane();
        Canvas canvas = 
                new Canvas(1024,512);
        panel.getChildren().add(canvas);
        Scene scene =
                new Scene (panel, 1024,512);
        GraphicsContext gc =
                canvas.getGraphicsContext2D();
        //DIBUJO DE UN RECTANGULO
        gc.setFill(Color.BLUE);
        gc.fillRect(10,10,20,20);
        gc.fillOval(30,30,100,100);
        gc.strokeLine(15,15,40,40);
        
        //UN POLÍGONO
        double xpoints[] = {10,30,20,10};
        double ypoints[] = {30,30,15,30};
        gc.strokePolygon(xpoints,ypoints,xpoints.length);
        
        LoopJuego loop = new LoopJuego(gc);
        loop.start();
        
        stage.setTitle("Ejemplo Canvas");
        stage.setScene(scene);
        stage.show();
        
    }
    public static void main(String[] args) {
        Application.launch(args);
    }
}
