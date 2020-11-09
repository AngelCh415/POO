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
        String[] frase = new String[]{
            "Las Matemáticas no son un recorrido prudente por una autopista despejada, sino un viaje a un terreno salvaje y extraño, en el cual los exploradores se pierden a menudo-(W.S. ANGLIN)",
            "La matemática es llave y puerta de la ciencia. -Roger Bacon.",
            "Lo importante es no dejar de hacerse preguntas.-Albert Einstein",
            "Aprende todo lo necesario para que tu vida sea más feliz-Pitágoras",
            "La ciencia se compone de errores, que, a su vez, son los pasos hacia la verdad.-Julio Verne",
        };
        String [] signo = new String[]{
            "+", "-", "/" , "*",
        };
        Racional A = new Racional();
        Racional B = new Racional();
        Racional R = new Racional();
        int opcion = 0; 
        int repetir = 1;
        Random azar = new Random();
        while(repetir==1){
            A.establecer();
            B.establecer();
            opcion = azar.nextInt(4);
            System.out.println("Hola :D");
            System.out.println("La operación que harás es  "+operacion[opcion]+ " de estos dos números racionales ");
            A.imprimir();
            System.out.println(signo[opcion]);
            B.imprimir();
            System.out.println("Ingrese el numerador: ");
            Scanner consolas = new Scanner (System.in);
            int num = consolas.nextInt();
            System.out.println("Ingrese el denominador: ");
            Scanner consola = new Scanner (System.in);
            int den = consola.nextInt();
            System.out.println(opcion);
            if(opcion==0){
                A.suma(B);
                A.imprimir();
            }else if(opcion==1){
                A.resta(B);
                A.imprimir();
            }else if(opcion==2){
                A.div(B);
                A.imprimir();
            }else{
                A.mult(B);
                A.imprimir();
            }
            R.establecer(num,den);
            int igual = R.igual(A);
            if(igual ==1){
                System.out.println("Bien hecho usario :D");
            }else{
                opcion = azar.nextInt(5);
                System.out.println("Respuesta incorrecta :c");
                System.out.println("La respuesta correcta es: ");
                A.imprimir();
                System.out.println("La respuesta de usted es: ");
                R.imprimir();
                System.out.println("aqui tienes una frase "+ frase[opcion]);
                //Frase motivadora 
            }
            System.out.println("¿Quieres intentarlo? 1)Sí 2)No");
            Scanner res = new Scanner(System.in); 
            repetir = res.nextInt();
        }
    }
}
