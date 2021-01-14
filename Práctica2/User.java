/*
Elaborado por: Chávez Morones Ángel Uriel 
                & Pacheco Mijangos Mauricio Jesús
*/

import java.util.Scanner;
public class User{
        private static Scanner consola;
public static void main( String[] args ){
        String []tipoTriang = new String [] {"Equilatero", "Escaleno", "Isóceles"}; 
        int opcion;
        int control;
        int repetir; 
        int x1,y1,x2,y2;
        Rectangulo A,B;
        Triangulo C,D; 
        int ax1,bx1, cx1, ay2,by2,cy2;
        Punto A1,B1, C1;
        opcion = 0; 
        repetir = 1;
        consola = new Scanner (System.in);
        while(repetir==1){  
                System.out.println("Aprendiendo Geometria");
                System.out.println("Ingrese una opcion \n 1)Rectangulo \n 2)Triangulo");
                /* Menú
                Menu rect
                1) Dibujar rectangulo
                2) Union de rectangulos
                3) Interseccion de rectangulos
                4) Buscar punto dentro de un rectangulo
                5) Comparar dos rectangulos
                6) Saber en que cuadrante esta un rectangulo
                Menu triang
                1) Dibujar triangulo
                2) Interseccion de triangulos
                3) Buscar punto dentro de un triangulo
                4) Comparar dos triangulos 
                5) Saber en que cuadrante esta el triangulo
                6) Comparar triangulo con rectangulo
                7)Mover un triangulo
                */
                
                opcion = consola.nextInt();
                switch(opcion){
                        case 1:
                                System.out.println("1)Dibujar un rectangulo y su Area");
                                System.out.println("2)Union de 2 rectangulos");
                                System.out.println("3)Interseccion de 2 rectangulos");
                                System.out.println("4)Buscar un punto dentro de un rectangulo");
                                System.out.println("5)Comparar dos rectangulos");
                                System.out.println("6)Saber en que cuadrante esta un rectangulo");  
                                System.out.println("7)Mover rectangulo");
                                opcion = consola.nextInt();
                                switch(opcion){
                                        case 1:
                                                System.out.println("Ingrese los puntos xy (esquina inferior)");
                                                x1 = consola.nextInt(); 
                                                y1 = consola.nextInt();
                                                System.out.println("Ingrese los puntos xy (esquina superior)");                                                
                                                x2 =consola.nextInt();                                                 
                                                y2 =consola.nextInt();
                                                A = new Rectangulo("Rec1", x1,y1,x2,y2);                                                
                                                System.out.println(A.toString());
                                                System.out.println("El Area es: " + A.area());
                                        break; 
                                        case 2: 
                                                System.out.println("Ingrese los puntos xy (esquina inferior) del Rectangulo 1");                                                
                                                x1 = consola.nextInt();                                                 
                                                y1 = consola.nextInt();
                                                System.out.println("Ingrese los puntos xy (esquina superior) del Rectangulo 1");                                                
                                                x2 = consola.nextInt();                                                 
                                                y2 = consola.nextInt();
                                                A = new Rectangulo("Rec1", x1,y1,x2,y2);
                                                System.out.println("Ingrese los puntos xy (esquina inferior) del Rectangulo 2");                                                
                                                x1 = consola.nextInt();                                                 
                                                y1 = consola.nextInt();
                                                System.out.println("Ingrese los puntos xy (esquina superior) del Rectangulo 2");                                                
                                                x2 = consola.nextInt();                                                 
                                                y2 = consola.nextInt();
                                                B = new Rectangulo("Rec2", x1,y1,x2,y2);
                                                Rectangulo UAB = A.union(B);
                                                System.out.println("Mostrando todas las uniones posibles");
                                                System.out.println(UAB.toString());
                                        break;
                                        case 3:
                                                System.out.println("Ingrese los puntos xy (esquina inferior) del Rectangulo 1");                                                
                                                x1 = consola.nextInt();                                                 
                                                y1 = consola.nextInt();
                                                System.out.println("Ingrese los puntos xy (esquina superior) del Rectangulo 1");                                                
                                                x2 = consola.nextInt();                                                 
                                                y2 = consola.nextInt();
                                                A = new Rectangulo("Rec1", x1,y1,x2,y2);
                                                System.out.println("Ingrese los puntos xy (esquina inferior) del Rectangulo 2");                                                
                                                x1 = consola.nextInt();                                                 
                                                y1 = consola.nextInt();
                                                System.out.println("Ingrese los puntos xy (esquina superior) del Rectangulo 2");                                                
                                                x2 = consola.nextInt();                                                 
                                                y2 = consola.nextInt();
                                                B = new Rectangulo("Rec2", x1,y1,x2,y2);
                                                Rectangulo IAB = A.inter(B);
                                                System.out.println("Mostrando todas las intersecciones posibles");
                                                System.out.println(IAB.toString());
                                        break; 
                                        case 4:
                                                System.out.println("Ingrese los puntos xy (esquina inferior) del Rectangulo 1");                                                
                                                x1 = consola.nextInt();                                                 
                                                y1 = consola.nextInt();
                                                System.out.println("Ingrese los puntos xy (esquina superior) del Rectangulo 1");
                                                x2 = consola.nextInt(); 
                                                y2 = consola.nextInt();
                                                A = new Rectangulo("Rec1", x1,y1,x2,y2);
                                                System.out.println("Ingrese la coordenada x y despues y");                                                
                                                x1 = consola.nextInt();                                                 
                                                y1 = consola.nextInt();
                                                Punto p = new Punto("p",x1,y1);
                                                if(A.dentroDe(p)==true){
                                                        System.out.println("El punto esta dentro del rectangulo");
                                                }else{
                                                        System.out.println("El punto no esta dentro del rectangulo");
                                                }
                                        break; 
                                        case 5:
                                                System.out.println("Ingrese los puntos xy (esquina inferior) del Rectangulo 1");                                                
                                                x1 = consola.nextInt();                                                 
                                                y1 = consola.nextInt();
                                                System.out.println("Ingrese los puntos xy (esquina superior) del Rectangulo 1");                                                
                                                x2 = consola.nextInt();                                                 
                                                y2 = consola.nextInt();
                                                A = new Rectangulo("Rec1", x1,y1,x2,y2);
                                                System.out.println("Ingrese los puntos xy (esquina inferior) del Rectangulo 2");                                                
                                                x1 = consola.nextInt();                                                 
                                                y1 = consola.nextInt();
                                                System.out.println("Ingrese los puntos xy (esquina superior) del Rectangulo 2");                                                
                                                x2 = consola.nextInt();                                                
                                                y2 = consola.nextInt();
                                                B = new Rectangulo("Rec2", x1,y1,x2,y2);
                                                int comparacionRect= A.comparar(B);
                                                if(comparacionRect==-1){
                                                        System.out.println("El rectangulo A es menor al rectango B");
                                                }
                                                else if(comparacionRect==0){
                                                        System.out.println("Ambos rectangulos son iguales");
                                                }
                                                else{
                                                        System.out.println("El rectangulo A es mayor al rectangulo B");
                                                }

                                        break; 
                                        case 6: 
                                                System.out.println("Ingrese los puntos xy (esquina inferior) del Rectangulo 1");                                                
                                                x1 = consola.nextInt();                                                 
                                                y1 = consola.nextInt();
                                                System.out.println("Ingrese los puntos xy (esquina superior) del Rectangulo 1");                                                
                                                x2 = consola.nextInt();                                                 
                                                y2 = consola.nextInt();
                                                A = new Rectangulo("Rec1", x1,y1,x2,y2);
                                                int cuadrante = A.cuadRect();
                                                System.out.println("El rectangulo se encuentra en el cuadrante: "+cuadrante);
                                        break;
                                        case 7:
                                                System.out.println("Ingrese los puntos xy (esquina inferior) del Rectangulo 1");                                                
                                                x1 = consola.nextInt();                                                 
                                                y1 = consola.nextInt();
                                                System.out.println("Ingrese los puntos xy (esquina superior) del Rectangulo 1");                                                
                                                x2 = consola.nextInt();                                                 
                                                y2 = consola.nextInt();
                                                Punto p1 = new Punto(x1, y1);
                                                Punto p2 = new Punto (x2,y2);
                                                A = new Rectangulo("Rec1", p1,p2);
                                                System.out.println("Ingrese los nuevos puntos para moverlo (esquina inferior)");                                                
                                                x1 = consola.nextInt();                                                 
                                                y1 = consola.nextInt();
                                                p1 = new Punto(x1,y1);
                                                System.out.println("Ingrese los nuevos puntos para moverlo (esquina superior)");                                                
                                                x1 = consola.nextInt();                                                 
                                                y1 = consola.nextInt();
                                                p2 = new Punto (x2,y2);
                                                System.out.println("Rectangulo sin mover");
                                                System.out.println(A.toString());
                                                System.out.println("Rectangulo movido");
                                                A.moverRect(p1, p2);
                                                System.out.print(A.toString());
                                        break;
                                        default:
                                                System.out.println("Error al elegir");
                                        break;
                                }
                        break;
                        case 2:
                                System.out.println("1)Dibujar un triangulo y su Area");
                                System.out.println("2)Comparar un triangulo con un rectangulo");
                                System.out.println("3)Interseccion de 2 triangulos");
                                System.out.println("4)Buscar un punto dentro de un triangulo");
                                System.out.println("5)Comparar dos triangulo");
                                System.out.println("6)Saber en que cuadrante esta un triangulo");  
                                System.out.println("7)Mover triangulo");                                
                                opcion = consola.nextInt(); 
                                switch(opcion){
                                        case 1: 
                                                System.out.println("Ingrese la coordenada xy del punto A");                                        
                                                ax1 = consola.nextInt();                                        
                                                ay2 = consola.nextInt(); 
                                                A1 = new Punto(ax1, ay2);
                                                System.out.println("Ingrese la coordenada xy del punto B");                                        
                                                bx1 = consola.nextInt();                                        
                                                by2 = consola.nextInt(); 
                                                B1 = new Punto(bx1, by2);
                                                System.out.println("Ingrese la coordenada xy del punto C");                                        
                                                cx1 = consola.nextInt();                                        
                                                cy2 = consola.nextInt(); 
                                                C1 = new Punto(cx1, cy2);
                                                C = new Triangulo("Triangulo", A1, B1, C1); 
                                                System.out.println(C.toString() + "con área de: " + C.area() + " y por la construccion es un triángulo" + tipoTriang[C.tipTriang()]);
                                        break; 
                                        case 2: 
                                        System.out.println("Ingrese los puntos xy (esquina inferior)");                                                
                                                x1 = consola.nextInt();                                                 
                                                y1 = consola.nextInt();
                                                System.out.println("Ingrese los puntos xy (esquina superior)");                                                
                                                x2 =consola.nextInt();                                                 
                                                y2 =consola.nextInt();
                                                A = new Rectangulo("Rec1", x1,y1,x2,y2);
                                                System.out.println("Ingrese la coordenada xy del punto A");                                                
                                                ax1 = consola.nextInt();                                                
                                                ay2 = consola.nextInt(); 
                                                A1 = new Punto(ax1, ay2);
                                                System.out.println("Ingrese la coordenada xy del punto B");                                                
                                                bx1 = consola.nextInt();                                                
                                                by2 = consola.nextInt(); 
                                                B1 = new Punto(bx1, by2);
                                                System.out.println("Ingrese la coordenada xy del punto C");                                                
                                                cx1 = consola.nextInt();                                                
                                                cy2 = consola.nextInt(); 
                                                C1 = new Punto(cx1, cy2);
                                                C = new Triangulo("Triangulo", A1, B1, C1);
                                                int compTR = A.comparar(C); 
                                                if(compTR== -1) System.out.println("El rectangulo es mas chico");
                                                else if (compTR==0) System.out.println("El rectangulo es igual que el triangulo" );
                                                else System.out.println("El rectangulo es mas grande");
                                        break;
                                        case 3: 
                                                System.out.println("Ingrese la coordenada xy del punto A del triangulo 1");                                        
                                                ax1 = consola.nextInt();                                        
                                                ay2 = consola.nextInt(); 
                                                A1 = new Punto(ax1, ay2);
                                                System.out.println("Ingrese la coordenada xy del punto B del triangulo 1");                                        
                                                bx1 = consola.nextInt();                                        
                                                by2 = consola.nextInt(); 
                                                B1 = new Punto(bx1, by2);
                                                System.out.println("Ingrese la coordenada xy del punto C del triangulo 1");                                        
                                                cx1 = consola.nextInt();                                        
                                                cy2 = consola.nextInt(); 
                                                C1 = new Punto(cx1, cy2);
                                                C = new Triangulo("Triangulo1", A1, B1, C1);
                                                System.out.println("Ingrese la coordenada xy del punto A del triangulo 2");                                        
                                                ax1 = consola.nextInt();                                        
                                                ay2 = consola.nextInt(); 
                                                A1 = new Punto(ax1, ay2);
                                                System.out.println("Ingrese la coordenada xy del punto B del triangulo 2");                                        
                                                bx1 = consola.nextInt();                                        
                                                by2 = consola.nextInt(); 
                                                B1 = new Punto(bx1, by2);
                                                System.out.println("Ingrese la coordenada xy del punto C del triangulo 2");                                        
                                                cx1 = consola.nextInt();                                        
                                                cy2 = consola.nextInt(); 
                                                C1 = new Punto(cx1, cy2);
                                                D = new Triangulo("Triangulo2", A1, B1, C1);
                                                Triangulo Res = C.interseccion(D); 
                                                if(Res==null) System.out.print("No hay interseccion");
                                                else System.out.println(Res.toString());
                                                break;
                                        case 4:  
                                                System.out.println("Ingrese la coordenada xy del punto A");
                                                ax1 = consola.nextInt();                                        
                                                ay2 = consola.nextInt(); 
                                                A1 = new Punto(ax1, ay2);
                                                System.out.println("Ingrese la coordenada xy del punto B");                                        
                                                bx1 = consola.nextInt();                                        
                                                by2 = consola.nextInt(); 
                                                B1 = new Punto(bx1, by2);
                                                System.out.println("Ingrese la coordenada xy del punto C");                                        
                                                cx1 = consola.nextInt();                                        
                                                cy2 = consola.nextInt(); 
                                                C1 = new Punto(cx1, cy2);
                                                C = new Triangulo("Triangulo", A1, B1, C1); 
                                                System.out.println("Ingrese la coordenada x y despues y");                                        
                                                x1 = consola.nextInt();                                         
                                                y1 = consola.nextInt();
                                                Punto p1 = new Punto("p",x1,y1);
                                                if(C.puntoDentro(p1)== true) System.out.println("El punto esta dentro del triangulo");
                                                else System.out.println ("El punto no esta dentro del triangulo");
                                        break;
                                        case 5:
                                                System.out.println("Ingrese la coordenada xy del punto A del triangulo 1");                                        
                                                ax1 = consola.nextInt();                                        
                                                ay2 = consola.nextInt(); 
                                                A1 = new Punto(ax1, ay2);
                                                System.out.println("Ingrese la coordenada xy del punto B del triangulo 1");                                        
                                                bx1 = consola.nextInt();                                        
                                                by2 = consola.nextInt(); 
                                                B1 = new Punto(bx1, by2);
                                                System.out.println("Ingrese la coordenada xy del punto C del triangulo 1");                                        
                                                cx1 = consola.nextInt();                                        
                                                cy2 = consola.nextInt(); 
                                                C1 = new Punto(cx1, cy2);
                                                C = new Triangulo("Triangulo1", A1, B1, C1); 
                                                System.out.println("Ingrese la coordenada xy del punto A del triangulo 2");                                        
                                                ax1 = consola.nextInt();                                        
                                                ay2 = consola.nextInt(); 
                                                A1 = new Punto(ax1, ay2);
                                                System.out.println("Ingrese la coordenada xy del punto B del triangulo 2");                                        
                                                bx1 = consola.nextInt();                                        
                                                by2 = consola.nextInt(); 
                                                B1 = new Punto(bx1, by2);
                                                System.out.println("Ingrese la coordenada xy del punto C del triangulo 2");                                        
                                                cx1 = consola.nextInt();                                        
                                                cy2 = consola.nextInt(); 
                                                C1 = new Punto(cx1, cy2);
                                                D = new Triangulo("Triangulo2", A1, B1, C1); 
                                                int compTrian = C.comparar(D); 
                                                if(compTrian==-1) System.out.println(C.toString() + " es menor que " + D.toString());
                                                if(compTrian==0) System.out.println(C.toString() + " es igual que " + D.toString());
                                                if(compTrian==1) System.out.println(C.toString() + " es mayor que " + D.toString());
                                        break;
                                        case 6: 
                                                System.out.println("Ingrese la coordenada xy del punto A");                                        
                                                ax1 = consola.nextInt();                                        
                                                ay2 = consola.nextInt(); 
                                                A1 = new Punto(ax1, ay2);
                                                System.out.println("Ingrese la coordenada xy del punto B");                                        
                                                bx1 = consola.nextInt();                                        
                                                by2 = consola.nextInt(); 
                                                B1 = new Punto(bx1, by2);
                                                System.out.println("Ingrese la coordenada xy del punto C");                                        
                                                cx1 = consola.nextInt();                                        
                                                cy2 = consola.nextInt(); 
                                                C1 = new Punto(cx1, cy2);
                                                C = new Triangulo("Triangulo", A1, B1, C1); 
                                                System.out.println(C.toString() + "esta en el cuadrante " + C.cuadTriang());
                                        break;
                                        case 7: 
                                                System.out.println("Ingrese la coordenada xy del punto A");                                        
                                                ax1 = consola.nextInt();                                        
                                                ay2 = consola.nextInt(); 
                                                A1 = new Punto(ax1, ay2);
                                                System.out.println("Ingrese la coordenada xy del punto B");                                        
                                                bx1 = consola.nextInt();                                        
                                                by2 = consola.nextInt(); 
                                                B1 = new Punto(bx1, by2);
                                                System.out.println("Ingrese la coordenada xy del punto C");                                        
                                                cx1 = consola.nextInt();                                        
                                                cy2 = consola.nextInt(); 
                                                C1 = new Punto(cx1, cy2);
                                                C = new Triangulo("Triangulo1", A1, B1, C1); 
                                                System.out.println("Ingrese la coordenada xy para mover al punto A");                                        
                                                ax1 = consola.nextInt();                                        
                                                ay2 = consola.nextInt(); 
                                                A1 = new Punto(ax1, ay2);
                                                System.out.println("Ingrese la coordenada xy para mover al punto B");                                        
                                                bx1 = consola.nextInt();                                        
                                                by2 = consola.nextInt(); 
                                                B1 = new Punto(bx1, by2);
                                                System.out.println("Ingrese la coordenada xy mover al punto C");                                        
                                                cx1 = consola.nextInt();                                        
                                                cy2 = consola.nextInt(); 
                                                C1 = new Punto(cx1, cy2);
                                                C.toString();
                                                System.out.println("Cambiando los valores del triangulo");
                                                C.movTriang(A1,B1,C1); 
                                                C.toString();
                                        break;
                                        default:
                                                System.out.println("Error al elegir");
                                        break;
                                }
                        break; 
                        
                        default:
                        System.out.println("Error al elegir");
                        break;
                }
                System.out.println("¿Desea repetir? \n 1)Si \n Cualquier otro Numero:No");
                control = consola.nextInt();
                if(control!=1) repetir*=0 ; 
                }
        }
        
}