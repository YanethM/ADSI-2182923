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
public class EntidadPersona {
    
    
    //Metodo que me permita imprimir nombre, tipo documento y nro documento.
    static void informacionPersona(String nombreP, String tipo_documento, int nro_documento){
        System.out.println("Nombre: " + nombreP +" Tipo de documento: " + tipo_documento 
                + " Número de documento: " + nro_documento);
    }
    
    //Método que contiene info del acudiente de la persona: nombre, tipo documento, nro y telefono
    static void informacionAcudiente(String nombreP, String tipo_documento, int nro_documento, int telefono){
        System.out.println("Nombre: " + nombreP +"\nTipo de documento: " + tipo_documento 
                + "\nNúmero de documento: " + nro_documento + "\nTelefono contacto: " + telefono);
    }
    
    //Metodo que contiene informacion academica: ùltimo titulo, estudianteActivo
    static void informacionAcademica(String titulo_obtenido, boolean estudianteActivo){
        System.out.println("El último titulo obtenido fue: " + titulo_obtenido 
                + "\nEs un estudiante activo " + estudianteActivo);
        if(estudianteActivo == true){
            System.out.println("Esta activo en el sistema");
        }else
            System.out.println("No esta activo en el sistema");
    }
    
    
    //psvm + TAB
    public static void main(String[] args) {
        //1. Creamos instancia de la clase
        //2. Mediante la instancia accedemos a los métodos
        EntidadPersona instClass = new EntidadPersona();
        instClass.informacionPersona("Paola", "C.C.", 105328372);
        instClass.informacionAcudiente("Papa", "C.C.", 75934953, 8823734);
        instClass.informacionAcademica("Tecnologo ADSI", false);
    }
}
