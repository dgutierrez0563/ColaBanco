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
public class NodoTiempo {   //Clase nodo para el tiempo
    //Atributos de la clase nodo tiempo
    public int ventanilla;
    public int tiempo;
    NodoTiempo siguienteTiempo;
    //Constructor para los atributos del nodo
    public NodoTiempo(int ventanilla, int tiempo) {
        this.ventanilla = ventanilla;
        this.tiempo = tiempo;
        this.siguienteTiempo = null;
    }
}
