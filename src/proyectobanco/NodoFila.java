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
public class NodoFila { //Clase nodo de la fila o cola del banco
    //Atributos de la clase NodoFila
    public int datoFila;
    NodoFila siguienteFila;
    //Constructor para los atributos de la clase
    public NodoFila(int datoFila) {
        this.datoFila = datoFila;
        this.siguienteFila = null;
    }    
}
