/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios1;

import java.util.Scanner;

/**
 *
 * @author a21pablorr
 */
public class personas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int i = 0; i < 100; i++) {
            System.out.println(i + 1);
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la base :  ");
        double base = sc.nextInt();
        System.out.println("Introduce la altura :  ");
        double altura = sc.nextInt();
        double total = base * altura;
        System.out.println("El total es " + total);
        int num = 4;
        //fx
        if (num % 2 == 0) {
            System.out.println("Su numero es par ");

        } else {
            System.out.println("Su numero es impar ");
        }
        
       
        for (int contador = 0; contador <= 20; contador++) {
            System.out.println("Introduce su numero : ");
            int numero= sc.nextInt();
            
            int sumaimpar ;
            if (numero % 2 == 0 ){
                int sumapar = numero ;
                int resultadofinalpar ;
                sumapar =  numero ++; 
                System.out.println("El resultado de la suma es"+ sumapar);
            }else{
                sumaimpar =  numero ; 
                System.out.println("El resultado de la suma impar es "+ sumaimpar); 
            }
                    
             
        }
    }

}
