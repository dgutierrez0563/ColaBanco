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
public class ListaVentanilla {  //Lista enlazada para la clase NodoVentanilla
    //Elnaces o punteroa de la lista
    NodoVentanilla primeroVentanilla;
    NodoVentanilla ultimoVentanilla;
    public int tamano=0;    //Tamano de la lista
    //Constructor para los punteros
    public ListaVentanilla(){
        primeroVentanilla=null;
        ultimoVentanilla=null;
        tamano=0;
    }
    //Metodo booleano para saber si la lista esta vacia
    public boolean esVacio(){
        if(primeroVentanilla==null){
            return true;
        }else{
            return false;
        }
    }
    //Metodo donde se insertan los datos del usuario, se inserta solo la caja y usuario
    public void insertarFilaVentanilla(int datosVentanilla, int numVentanilla){
        NodoVentanilla nuevoNodo=new NodoVentanilla(datosVentanilla,numVentanilla);
        NodoVentanilla auxiliar=null;
        auxiliar=primeroVentanilla;
        if(primeroVentanilla==null){    //condicion 1
            primeroVentanilla=nuevoNodo;
        }else{  //Condicion 2
            while(auxiliar.siguienteVentanilla!=null){  //Condicion 3
            auxiliar=auxiliar.siguienteVentanilla;
            }
        auxiliar.siguienteVentanilla=nuevoNodo;
        }
    }
    //Metodo para la impresion de la listaFila
    public void imprimirFila(){
        NodoVentanilla auxiliar=primeroVentanilla;
        do{
           System.out.print("Ventanilla N° "+auxiliar.numVentanilla+" Cleinte N° "+auxiliar.datosVentanilla+"\n");
           if(auxiliar.siguienteVentanilla!=null){
               System.out.print("");
           }
           auxiliar=auxiliar.siguienteVentanilla;
	}while(auxiliar!=null);
        System.out.print("\n");
    }
    //Metodo que busca en los campos de la fila o cola
    public int buscarCampoFila(int campo){
        NodoVentanilla auxiliar=null;
        auxiliar=primeroVentanilla;
        do{
            if(auxiliar.numVentanilla==campo){
                tamano++;            
            }
            auxiliar=auxiliar.siguienteVentanilla;
        }while(auxiliar.siguienteVentanilla!=null);
        return (tamano);
    }
    //Metodo para el recorrido de la fila o cola 
    public void usarVentanilla(int campo){
        NodoVentanilla auxiliar=primeroVentanilla;
        while(auxiliar!=null){
            if(auxiliar.numVentanilla==campo){
                System.out.print(auxiliar.datosVentanilla);
                if(auxiliar.siguienteVentanilla!=null){
                    System.out.print(",");
                }
            }
            auxiliar=auxiliar.siguienteVentanilla;
        }
        System.out.print("\n");
    }
}
