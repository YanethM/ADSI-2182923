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
public class TiposDatos {
//Modificadores de acceso: Public, Private, Protected
    /**
     * @param args the command line arguments
     */
    String nombrePersona = "";
    int edadP = 0;
    char generoP = 'F';
    double estaturaP = 0;
    float valorPI = 0F;
    boolean aprendizActivo = false;
    
    //Creamos el constructor de la clase
   public TiposDatos(String nombreP, char genero, int edad, double estatura){
       nombrePersona = nombreP;
       edadP = edad;
       generoP = genero;
       estaturaP = estatura;
   }
    
    public static void main(String[] args) {
        // TODO code application logic here
        //Crear una instancia
        TiposDatos instClass = new TiposDatos("Yaneth",'F',30, 1.54);
        System.out.println(instClass);
    }
    
}
