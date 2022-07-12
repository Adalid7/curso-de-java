/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author loko
 */
public class Ejem {

 
    public static void main(String[] args) throws IOException {
     /**
        // ejemplo de prueva de variables int, y string
        
        String nombre = "adalid";
        int followersInstagram = 2180;
        int likeYoutube = 4356;
        String frase = "hola mi nombre es: " + nombre + " y tengo " + (followersInstagram + likeYoutube) + " entre intagram y youtube";
        System.out.println(frase);
    */
     
     
     /**
      * algoritmo para saber el mayor de edad
  
     int edad = 18;
     
        if (edad >=18) {
            System.out.println("es adulto");
            System.out.println("prueva de github");
            
              
            
        } else {
            System.out.println("es menor de edad");
         
        }
            */     
     
     
       InputStreamReader inputStreamReader = new InputStreamReader(System.in);
       BufferedReader reader = new BufferedReader(inputStreamReader);
       
       System.out.println("Ingrese un numero1:");
       String stnumero1 = reader.readLine();
       double numero1 = Integer.parseInt(stnumero1);
      
          System.out.println("Ingrese un numero2:");
       String stnumero2 = reader.readLine();
       double numero2 = Integer.parseInt(stnumero2);
       
            System.out.println("Ingrese un numero3:");
       String stnumero3 = reader.readLine();
        double numero3 = Integer.parseInt(stnumero3);
        
        
        double prom = 0;
    
        promedio(numero1, numero2, numero3, prom);
          } 
    
    /**
     * Esta funcion me sirvepara sacar el promedio de 3 numeros
     * @param numero1
     * @param numero2
     * @param numero3
     * @param prom 
     */
        
    private static void promedio (double numero1, double numero2, double numero3, double prom){
                
     prom = (numero1+numero2+numero3)/3; 
     
        System.out.println("El promedio es: "+prom);
     
     
    } 
    
}
