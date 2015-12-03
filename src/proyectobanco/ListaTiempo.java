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
public class ListaTiempo {  //Clase ListaTiempo para el nodotiempo
    NodoTiempo primeroTiempo;   //Puntero
    //Contructor para el puntero
    public ListaTiempo(){
        primeroTiempo=null;
    }
    //Metodo para los ingresos de los tiempos en la listatiempo
    public void insertaTiempo(int ventanilla, int tiempo){
        NodoTiempo nuevoNodo=new NodoTiempo(ventanilla,tiempo);
        NodoTiempo auxiliar=null;
        auxiliar=primeroTiempo;
        if(primeroTiempo==null){
            primeroTiempo=nuevoNodo;
        }else{
            while(auxiliar.siguienteTiempo!=null){
                auxiliar=auxiliar.siguienteTiempo;
            }        
        auxiliar.siguienteTiempo=nuevoNodo;
        }
    }
    //Metodo para buscar el tiempo utilizado
    public int buscarTiempo(int tiempoBuscado){
         NodoTiempo auxiliar=null;
         auxiliar=primeroTiempo;
         int tiempoAcumulado=0;
         do{
             if(auxiliar.ventanilla==tiempoBuscado){
                 tiempoAcumulado=tiempoAcumulado+auxiliar.tiempo;
             }
             auxiliar=auxiliar.siguienteTiempo;
         }while(auxiliar.siguienteTiempo!=null);
         return (tiempoAcumulado);
    }
}
