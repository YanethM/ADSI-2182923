/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposdatos;

/**
 *
 * @author YANETH
 */
public class Vehiculo {
    //Void => vacío
    static void imprimirMensaje(String mensaje){
        //sout + TAB
        System.out.println(mensaje);
    }
    
    static void nombreAprendiz(String nombre){
        System.out.println(nombre);
    }
    
    //psvm + TAB
    public static void main(String[] args) {
        Vehiculo instClass = new Vehiculo();
        instClass.imprimirMensaje("Hola grupo ADSI desde JAVA");
        instClass.nombreAprendiz("Yaneth Mejía");
    }
}
