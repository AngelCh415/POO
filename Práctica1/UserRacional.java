/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author angelchavez
 */
import java.util.Random;
import java.util.Scanner;
public class UserRacional {

    public static void main(String[] args) {
        String[] operacion = new String[] {
    		"Suma", 
    		"Resta", 
    		"División",
    		"Multiplicación",
            };
        String [] signo = new String[]{
            "+", "-", "/" , "*",
        };
        Racional A = new Racional();
        Racional B = new Racional();
        A.establecer();
        B.establecer();
        int opcion = 0; 
        int repetir = 1;
        Random azar = new Random();
        while(repetir==1){
            System.out.flush();
            opcion = azar.nextInt(4);
            System.out.println("Hola :D");
            System.out.println("La operación que harás es  "+operacion[opcion]+
            "De estos dos números racionales ");
            A.imprimir();
            System.out.println(signo[opcion]);
            B.imprimir();
            System.out.println("Ingrese el denominador: ");
            Scanner consola = new Scanner (System.in);
            int den = consola.nextInt();
            System.out.println("Ingrese el numerador: ");
            Scanner consolas = new Scanner (System.in);
            int num = consolas.nextInt();
            A.establecer(den,num);
            A.imprimir();
        }
    }
}
