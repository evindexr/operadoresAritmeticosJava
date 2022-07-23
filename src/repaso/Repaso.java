/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repaso;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Repaso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
        //Cree una aplicacion de operadores aritmeticos utilizando, ingreso de datos, y seleccion con switch
        int num1;
        int num2;
        int opcion;
        Scanner Input = new Scanner (System.in);
        
        System.out.println("Bienvenido a operaciones aritmeticas para 2 valores");
        System.out.println("Ingrese 1 para sumar ");
        System.out.println("Ingrese 2 para restar ");
        System.out.println("Ingrese 3 para dividir ");
        System.out.println("Ingrese 4 para multiplicar");
        
        System.out.println("Que operacion desea hacer?");
        opcion = Input.nextInt();
        System.out.println("Ingrese primer numero");
        num1 = Input.nextInt();
        System.out.println("Ingrese segundo numero");
        num2 = Input.nextInt();
        
        switch (opcion) 
        {
             case 1: 
        int resultado = num1+num2;
                 System.out.println("El resultado de la suma es " + resultado);
              break;
              case 2: 
                 resultado = num1-num2;
                 System.out.println("El resultado de la resta es " + resultado);
              break;
              case 3: 
                 resultado = num1/num2;
                 System.out.println("El resultado de la division es " + resultado);
              break;
              case 4: 
                 resultado = num1*num2;
                 System.out.println("El resultado de la multiplicacion es " + resultado);
              break;

    default:
        
        System.out.println("Favor ingresar una opcion valida");
        break;
         }
        
    }
    
}
