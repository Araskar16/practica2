/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2;

import java.util.Scanner;


/**
 *
 * @author soporte
 */
public class Practica2 {

    /**
     * @param args the command line arguments
     */
   

    public static void main(String[] args){
        
        Trabajador trabajador1 = new Trabajador ( "Juan", 40, "hombre", "Celaya");
        
        System.out.println (trabajador1.getNombre() );
       
        Usuario usuario1 = new Usuario(
        "Juan", // Nombre
        "30", // Edad              
        "Hombre", //Sexo
        "Celaya", // direccion
        3067, //Nomina
        "Jefe de TI", //Puesto
         2 //Antiguedad
                
        ); 
        
     
        
     System.out.println (trabajador1.getNomina() );
     
     Scanner entrada = new Scanner(System.in);
     String nombre;
     int edad;
     String sexo;
     String direccion;
     int nomina;
     String puesto;  
     int antiguedad;
   
     System.out.println (trabajador1.getDepartamento() );
     
     System.out.println("Ingresa el nombre del trabajador: ");
     nombre = entrada.next();
     System.out.println("Ingresa la edad del trabajador: ");
     edad = entrada.nextInt();
     System.out.println("Ingresa el sexo del trabajador: ");
     sexo = entrada.next();
     System.out.println("Ingresa la direccion del trabajador: ");
     direccion = entrada.next();
     System.out.println("Ingresa la nomina del trabajador: ");
     nomina = entrada.nextInt();
     System.out.println("Ingresa el puesto del trabajador: ");
     puesto = entrada.next();
     System.out.println("Ingresa la antiguedad del trabajador: ");
     antiguedad = entrada.nextInt();
     
     
     
     Trabajador trabajador_nuevo = new Trabajador (
     nombre,
     edad,
     sexo,
     direccion,
     nomina,
     puesto,
     antiguedad
     );
        
        
        
        
        
    } 
}
     