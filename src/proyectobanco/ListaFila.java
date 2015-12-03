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
public class ListaFila {    //Clase ListaFila para la cola del banco
    //Punteros de la lista
    NodoFila primeroFila;
    NodoFila ultimoFila;
    public int tamano;
    //Constructor de los punteros
    public ListaFila(){
        primeroFila=null;
        ultimoFila=null;
        tamano=0;
    }
    //Accion booleana para la comprobacion de la lista
    public boolean esVacio(){
        if(primeroFila==null){
            return true;
        }else{
            return false;
        }
    }
    //Insertar campos en la fila del banco
    public void insertarFila(int datoFila){
        NodoFila nuevoNodo=new NodoFila(datoFila);
        
        if(primeroFila==null){
            primeroFila=nuevoNodo;
            ultimoFila=nuevoNodo;
        }else{
            ultimoFila.siguienteFila=nuevoNodo;
            ultimoFila=nuevoNodo;
        }
        //tamano++;
    }
    //Metodo para eliminar campos de la fila o cola bancaria
    public int eliminarCampo(){
        ClaseOtrosMetodos instancia=new ClaseOtrosMetodos();       
        int auxiliar=primeroFila.datoFila;
        if(esVacio()){
            instancia.filaVacia();//Llamada de metodo que muestre en JOptionPane (la lista esta vacia o la ventana)
        }else{     
            primeroFila=primeroFila.siguienteFila;      
        }
        return auxiliar;
    }
    //impresion de los campos utilizados 
    public void imprimirFila(){
        NodoFila auxiliar=primeroFila;
        while(auxiliar!=null){
            System.out.print(auxiliar.datoFila);
            if (auxiliar.siguienteFila!=null){
                System.out.print("-");
            }
            auxiliar=auxiliar.siguienteFila;  
	}
        System.out.print("\n");
    }
}
