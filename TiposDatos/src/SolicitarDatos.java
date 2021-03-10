
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author YANETH
 */
public class SolicitarDatos {
    
    
    //Metodo que valida si el usuario es mayor de edad
    static void validarMayoriaEdad(int edadUsuario){
        if(edadUsuario >= 18){
            System.out.println("Es mayor de edad");
        }else{
            System.out.println("Es menor de edad");
        }
    }
    
    
    public static void main(String[] args) {
        SolicitarDatos instClass = new SolicitarDatos();
        
        //Libreria para solicitar datos al usuario por teclado
        Scanner solicitarInfo = new Scanner(System.in);
        //Mensaje que se le muestra al usuario
        System.out.println("Ingrese su nombre");
        //Lectura del valor ingresado por parte del usuario
        String nombreUsuario = solicitarInfo.nextLine();
        
        System.out.println("Ingrese su edad");
        int edadUsuario = solicitarInfo.nextInt();
        instClass.validarMayoriaEdad(edadUsuario);
        
        //Mostrar el valor ingresado por el usuario
        System.out.println("Ha iniciado sesión como " + nombreUsuario + "\nY tiene " 
                + edadUsuario + " años");
    }
}
