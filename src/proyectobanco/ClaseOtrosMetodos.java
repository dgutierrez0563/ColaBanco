/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobanco;

import javax.swing.JOptionPane;
import java.util.Date;

/**
 *
 * @author 68NK7
 */
public class ClaseOtrosMetodos {
    
     public void filaVacia(){ //Metodo que muestra un mensaje de lista de datos vacio
        JOptionPane.showMessageDialog(null, "No hay Datos en la Fila","Mensaje del Sistema",JOptionPane.INFORMATION_MESSAGE);
    }
    
//    public static void print(String pDato){
//        System.out.println(pDato);
//    }
    
    public static int cantidadVentanillas(){    //Metodo fijo que recoge la cantidad de ventanas del banco
        String entrada1=new String("");
        try{
            entrada1="3";
        }catch(Exception e){
            e.printStackTrace();
        }
        int numero2=0;
        try{
            numero2=Integer.parseInt(entrada1);
        }catch(Exception x){
            x.printStackTrace();
        }
        return (numero2);
    }
    //Metodo que inicia la aplicacion del simulacion
    public void inicioAplicacion(){
        String opcion;
        
        do{
            Menu(); //Llamada del menu
            
	    opcion=JOptionPane.showInputDialog(null,"INICIAR NUEVAMENTE LA SIMULACION\n"+
                                                    "'S' PARA CONFIRMAR O 'N' PARA CANCELAR");
	    
	  }while (opcion.equals("S")||opcion.equals("s"));  //Preunta por el cierre de la aplizacion

    }
    //Metodo del menu que inicia el el cuadro del menu
    public void Menu(){
        java.util.Date fecha=new Date();    //Paquete de fecha
        float minutos;  //Variable para minutos tipo float
        int dato1=1, numeroUsuario; //Variables que recogen los datos y el numero de los usuarios en el banco
        int numeroCaja=1, auxiliar2=300000,tiempoUsado;   
        int num1, num3=1,num4=0,promedio=0;
        int numeroVentanillas=5;
        int tiempoDeAtencionBanco=3;
        int situacion1, situacion2,situacion3;
        long tiempo1,tiempo2,tiempo3,tiempo4,tiempo5;
        int s;
        long resultado1 ,resultado2, resultado3;
        double resultado4;
        ListaFila instanciaFila=new ListaFila();
        ListaTiempo instanciaTiempo=new ListaTiempo();
        ListaVentanilla instanciaVentanilla=new ListaVentanilla();
        JOptionPane.showMessageDialog(null,"============================================================\n"
                + "BANCA CRISTAL\n"
                + "SIMULACION DE COLAS DE BANCO\n"
                + fecha+"\n"
                + "============================================================","Mensaje del Sistema",JOptionPane.INFORMATION_MESSAGE);
    
        JOptionPane.showMessageDialog(null,"el banco dispone de 5 ventanillas".toUpperCase()+"\n"
                                      + "el tiempo de atencion por ventanilla es de 3 minutos maximo".toUpperCase(),"Mensje del Sistema",JOptionPane.INFORMATION_MESSAGE);
        do{
            if((numeroVentanillas>=5)){
                dato1=1;
            }else{
                dato1=0;
                numeroVentanillas=cantidadVentanillas();
            }
        }while(dato1==0);
        
        tiempoDeAtencionBanco=cantidadVentanillas();
        int tiempoEnSegundos=tiempoDeAtencionBanco*60;
        do{
            instanciaFila.insertarFila(dato1);
            dato1++;
        }while(dato1<=(numeroVentanillas+6));
        
        tiempo1=System.currentTimeMillis();
        resultado1=(tiempo1/1000);
        situacion1=(int)resultado1;
        minutos=resultado1/60;
        do{
            resultado4=(Math.random()*10000000);
            num1=(int)(resultado4);
            numeroUsuario=instanciaFila.eliminarCampo();
            instanciaVentanilla.insertarFilaVentanilla(num3,numeroUsuario);
            num3++;
            num4++;            
        }while(num3<=numeroVentanillas);
        instanciaVentanilla.imprimirFila();
        do{
            instanciaFila.insertarFila(dato1);
            dato1++;
            do{
                tiempo3=System.currentTimeMillis();
                resultado1=(tiempo3/1000);
                situacion2=(int)resultado1;
                do{
                    resultado4=(Math.random()*10000000);
                    num1=(int)(resultado4);
                    if(num1==auxiliar2){
                        if(!instanciaFila.esVacio()){
                            num4++;
                            tiempo4=System.currentTimeMillis();
                            resultado3=(tiempo4/1000);
                            situacion3=(int)resultado3;
                            numeroUsuario=instanciaFila.eliminarCampo();
                            instanciaVentanilla.insertarFilaVentanilla(numeroCaja, numeroUsuario);
                            tiempoUsado=(situacion3-(situacion2-situacion1));
                            instanciaTiempo.insertaTiempo(numeroCaja, tiempoUsado);
                            System.out.print("Ventanilla N° "+numeroCaja+" Usuario N° "+numeroUsuario+" FILA DE ESPERA ");
                            instanciaFila.imprimirFila();
                            System.out.print("\n");
                            instanciaFila.insertarFila(dato1);
                            dato1++;
                        }
                    }
                    numeroCaja++;
                }while(numeroCaja<=numeroVentanillas);
                
                tiempo2=System.currentTimeMillis();
                tiempo5=tiempo2-tiempo1;
                resultado2=(tiempo5/1000);
                situacion1=(int)resultado2;
                minutos=resultado2/60;
            
            }while((situacion1<=tiempoEnSegundos)&&(!instanciaFila.esVacio()));
            
            tiempo2=System.currentTimeMillis();
            tiempo5=tiempo2-tiempo1;
            resultado2=(tiempo5/1000);
            situacion1=(int)resultado2;
            minutos=resultado2/60;
            
        }while(situacion1<=tiempoEnSegundos);
        
        if(situacion1>=tiempoEnSegundos){
            JOptionPane.showMessageDialog(null,"============================================================\n"
                                             + "=                                                          =\n"
                                             + "=                      BANCA CRISTAL                       =\n"
                                             + "=           El HORARIO DE ATENCION AH FINALIZADO           =\n"
                                             + "=               SIMULACION DE COLAS DE BANCO               =\n"
                                             + "=                        "+fecha+"                         =\n"
                                             + "=                                                          =\n"
                                             + "============================================================","Mensaje del Sistema",JOptionPane.INFORMATION_MESSAGE);
            
        }
        
        do{
            numeroCaja=1;
            do{
                resultado4=(Math.random()*10000000);
                num1=(int)(resultado4);
                
                if(num1==auxiliar2){
                    if (!instanciaFila.esVacio()) {
                        num4++;
                        numeroUsuario = instanciaFila.eliminarCampo();
                        instanciaVentanilla.insertarFilaVentanilla(numeroCaja, numeroUsuario);
                        System.out.print("Ventanilla N° "+numeroCaja+" ==> Usuario N° => "+numeroUsuario+" ==> FILA DE ESPERA ");
                        instanciaFila.imprimirFila();
                        System.out.print("\n");
                
                    }
                }
            
            numeroCaja++;             
            }while(numeroCaja<=numeroVentanillas);
                   
        }while(!instanciaFila.esVacio());
        int tiempoActual;
        int promedioTiempoUsuario=0;
        int numeroCajero;
        int usuariosAtendidos;
        promedio=num4/numeroVentanillas;
        System.out.println("=============================================================================\n");
        System.out.println("\nSe atendio a "+numeroVentanillas+" usuarios");
        System.out.println("\n=============================================================================");
        for(int x=1;x<=numeroVentanillas;x++){
            tiempoActual=instanciaTiempo.buscarTiempo(x);
            usuariosAtendidos=instanciaVentanilla.buscarCampoFila(x);
            promedioTiempoUsuario=(tiempoActual/(usuariosAtendidos+2));
            
            System.out.println("La ventanilla N° "+x+" atendio un total de "+usuariosAtendidos+" usuarios");
            System.out.println();
            System.out.println("El promedio por usuario fue de "+promedioTiempoUsuario+" segundos cada uno");
            System.out.println();
            System.out.println("\n=============================================================================");
        }
        System.out.println();
        System.out.println("El promedio de usuarios por ventanilla fue de "+promedioTiempoUsuario);
        System.out.println();
        System.out.println("\n=============================================================================");
    }
}
       

