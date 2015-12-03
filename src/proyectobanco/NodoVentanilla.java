/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobanco;

/**
 *
 * @author 68NK7
 */
public class NodoVentanilla {   //Clase nodo de la ventanilla o caja de clientes
    //Atributos de la clase Nodo ventanilla
    public int datosVentanilla;
    public int numVentanilla;
    NodoVentanilla siguienteVentanilla;
    //Constructor para loa atributos del nodo
    public NodoVentanilla(int datosVentanilla,int numVentanilla){
        this.datosVentanilla=datosVentanilla;
        this.numVentanilla=numVentanilla;
        this.siguienteVentanilla=null;
    }    
}
