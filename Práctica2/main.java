import java.util.Scanner;
public class main{
public static void main( String[] args ){
        int opcion;
        int control;
        int repetir; 
        int x1,y1,x2,y2;
        Rectangulo A,B;
        opcion = 0; 
        repetir = 1; 
        while(repetir==1){
                Scanner consola = new Scanner (System.in);
                System.out.println("Aprendiendo Geometria");
                System.out.println("Ingrese una opción \n 1)Rectángulo \n 2)Triángulo");
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
                
                */
                consola = new Scanner (System.in);
                opcion = consola.nextInt();
                switch(opcion){
                        case 1:
                                System.out.println("1)Dibujar un rectangulo y su Area");
                                System.out.println("2)Union de 2 rectangulos");
                                System.out.println("3)Interseccion de 2 rectangulos");
                                System.out.println("4)Buscar un punto dentro de un rectangulo");
                                System.out.println("5)Comparar dos rectangulos");
                                System.out.println("6)Saber en que cuadrante esta un rectangulo");                                
                                consola = new Scanner (System.in);
                                opcion = consola.nextInt();
                                switch(opcion){
                                        case 1:
                                                System.out.println("Ingrese los puntos xy (esquina superior)");
                                                consola = new Scanner(System.in);
                                                x1 = consola.nextInt(); 
                                                consola = new Scanner(System.in);
                                                y1 = consola.nextInt();
                                                System.out.println("Ingrese los puntos xy (esquina inferior)");
                                                consola = new Scanner(System.in);
                                                x2 =consola.nextInt(); 
                                                consola = new Scanner(System.in);
                                                y2 =consola.nextInt();
                                                A = new Rectangulo("Rec1", x1,y1,x2,y2);                                                
                                                System.out.println(A.toString());
                                                System.out.println("El Area es: ");
                                                System.out.println(A.area());
                                        break; 
                                        case 2: 
                                                System.out.println("Ingrese los puntos xy (esquina superior) del Rectangulo 1");
                                                consola = new Scanner(System.in);
                                                x1 = consola.nextInt(); 
                                                consola = new Scanner(System.in);
                                                y1 = consola.nextInt();
                                                System.out.println("Ingrese los puntos xy (esquina inferior) del Rectangulo 1");
                                                consola = new Scanner(System.in);
                                                x2 = consola.nextInt(); 
                                                consola = new Scanner(System.in);
                                                y2 = consola.nextInt();
                                                A = new Rectangulo("Rec1", x1,y1,x2,y2);
                                                System.out.println("Ingrese los puntos xy (esquina superior) del Rectangulo 2");
                                                consola = new Scanner(System.in);
                                                x1 = consola.nextInt(); 
                                                consola = new Scanner(System.in);
                                                y1 = consola.nextInt();
                                                System.out.println("Ingrese los puntos xy (esquina inferior) del Rectangulo 2");
                                                consola = new Scanner(System.in);
                                                x2 = consola.nextInt(); 
                                                consola = new Scanner(System.in);
                                                y2 = consola.nextInt();
                                                B = new Rectangulo("Rec2", x1,y1,x2,y2);
                                                Rectangulo UAB = A.union(B);
                                                System.out.println("Mostrando todas las uniones posibles");
                                                System.out.println(UAB.toString());
                                        break;
                                        case 3:
                                                System.out.println("Ingrese los puntos xy (esquina superior) del Rectangulo 1");
                                                consola = new Scanner(System.in);
                                                x1 = consola.nextInt(); 
                                                consola = new Scanner(System.in);
                                                y1 = consola.nextInt();
                                                System.out.println("Ingrese los puntos xy (esquina inferior) del Rectangulo 1");
                                                consola = new Scanner(System.in);
                                                x2 = consola.nextInt(); 
                                                consola = new Scanner(System.in);
                                                y2 = consola.nextInt();
                                                A = new Rectangulo("Rec1", x1,y1,x2,y2);
                                                System.out.println("Ingrese los puntos xy (esquina superior) del Rectangulo 2");
                                                consola = new Scanner(System.in);
                                                x1 = consola.nextInt(); 
                                                consola = new Scanner(System.in);
                                                y1 = consola.nextInt();
                                                System.out.println("Ingrese los puntos xy (esquina inferior) del Rectangulo 2");
                                                consola = new Scanner(System.in);
                                                x2 = consola.nextInt(); 
                                                consola = new Scanner(System.in);
                                                y2 = consola.nextInt();
                                                B = new Rectangulo("Rec2", x1,y1,x2,y2);
                                                Rectangulo IAB = A.inter(B);
                                                System.out.println("Mostrando todas las intersecciones posibles");
                                                System.out.println(IAB.toString());
                                        break; 
                                        case 4:
                                                System.out.println("Ingrese los puntos xy (esquina superior) del Rectangulo 1");
                                                consola = new Scanner(System.in);
                                                x1 = consola.nextInt(); 
                                                consola = new Scanner(System.in);
                                                y1 = consola.nextInt();
                                                System.out.println("Ingrese los puntos xy (esquina inferior) del Rectangulo 1");
                                                consola = new Scanner(System.in);
                                                x2 = consola.nextInt(); 
                                                consola = new Scanner(System.in);
                                                y2 = consola.nextInt();
                                                A = new Rectangulo("Rec1", x1,y1,x2,y2);
                                                System.out.println("Ingrese la coordenada x y despues y");
                                                consola = new Scanner(System.in);
                                                x1 = consola.nextInt(); 
                                                consola = new Scanner(System.in);
                                                y1 = consola.nextInt();
                                                Punto p = new Punto("p",x1,y1);
                                                if(A.dentroDe(p)==true){
                                                        System.out.println("El punto esta dentro del rectangulo");
                                                }else{
                                                        System.out.println("El punto no esta dentro del rectangulo");
                                                }
                                        break; 
                                        case 5:
                                                System.out.println("Ingrese los puntos xy (esquina superior) del Rectangulo 1");
                                                consola = new Scanner(System.in);
                                                x1 = consola.nextInt(); 
                                                consola = new Scanner(System.in);
                                                y1 = consola.nextInt();
                                                System.out.println("Ingrese los puntos xy (esquina inferior) del Rectangulo 1");
                                                consola = new Scanner(System.in);
                                                x2 = consola.nextInt(); 
                                                consola = new Scanner(System.in);
                                                y2 = consola.nextInt();
                                                A = new Rectangulo("Rec1", x1,y1,x2,y2);
                                                System.out.println("Ingrese los puntos xy (esquina superior) del Rectangulo 2");
                                                consola = new Scanner(System.in);
                                                x1 = consola.nextInt(); 
                                                consola = new Scanner(System.in);
                                                y1 = consola.nextInt();
                                                System.out.println("Ingrese los puntos xy (esquina inferior) del Rectangulo 2");
                                                consola = new Scanner(System.in);
                                                x2 = consola.nextInt(); 
                                                consola = new Scanner(System.in);
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
                                                System.out.println("Ingrese los puntos xy (esquina superior) del Rectangulo 1");
                                                consola = new Scanner(System.in);
                                                x1 = consola.nextInt(); 
                                                consola = new Scanner(System.in);
                                                y1 = consola.nextInt();
                                                System.out.println("Ingrese los puntos xy (esquina inferior) del Rectangulo 1");
                                                consola = new Scanner(System.in);
                                                x2 = consola.nextInt(); 
                                                consola = new Scanner(System.in);
                                                y2 = consola.nextInt();
                                                A = new Rectangulo("Rec1", x1,y1,x2,y2);
                                                int cuadrante = A.cuadRect();
                                                System.out.println("El rectangulo se encuentra en el cuadrante: "+cuadrante);
                                        break;
                                        default:
                                                System.out.println("Error al elegir");
                                        break;
                                }
                        break;
                        case2:
                        break; 
                        
                        default:
                        System.out.println("Error al elegir");
                        break;
                }
                System.out.println("¿Desea repetir? \n 1)Si \n Cualquier otro Numero:No");
                Scanner consola1 = new Scanner (System.in);
                control = consola1.nextInt();
                if(control!=1) repetir*=0 ; 
        }
        

        
        /*
        Rectangulo r1c1 = new Rectangulo( "r1c1", 3,7,2,4 );
        Rectangulo r2c1 = new Rectangulo( "r2c1", 5,10,3,7 );
        Rectangulo r1c2 = new Rectangulo( "r1c2", -3,-9,8,2 );
        Rectangulo r2c2 = new Rectangulo( "r2c2", -4,-7,6,4 );
        Rectangulo r1c3 = new Rectangulo( "r1c3", -7,-3,-5,-2 );
        Rectangulo r2c3 = new Rectangulo( "r2c3", -6,-4,-7,-3 );
        Rectangulo r1c4 = new Rectangulo( "r1c4", 2,5,-6,-3);
        Rectangulo r2c4 = new Rectangulo( "r2c4", 4,8,-8,-4 );

	System.out.println("Rectangulos");
        System.out.println( r1c1.toString() );
        System.out.println( r2c1.toString() );
        System.out.println( r1c2.toString() );
        System.out.println( r2c2.toString() );
        System.out.println( r1c3.toString() );
        System.out.println( r2c3.toString() );
        System.out.println( r1c4.toString() );
        System.out.println( r2c4.toString() );

	System.out.println("Areas");
        System.out.println( r1c1.area() );
        System.out.println( r2c1.area() );
        System.out.println( r1c2.area() );
        System.out.println( r2c2.area() );
        System.out.println( r1c3.area() );
        System.out.println( r2c3.area() );
        System.out.println( r1c4.area() );
        System.out.println( r2c4.area() );

        Rectangulo u1 = r1c1.union(r2c1);
        Rectangulo u2 = r1c2.union(r2c2);
        Rectangulo u3 = r1c3.union(r2c3);
        Rectangulo u4 = r1c4.union(r2c4);

	System.out.println("Uniones");
        System.out.println( u1.toString() );
        System.out.println( u2.toString() );
        System.out.println( u3.toString() );
        System.out.println( u4.toString() );

        Rectangulo i1 = r1c1.inter(r2c1);
        Rectangulo i2 = r1c2.inter(r2c2);
        Rectangulo i3 = r1c3.inter(r2c3);
        Rectangulo i4 = r1c4.inter(r2c4);

	System.out.println("Intersecciones");
        System.out.println( i1.toString() );
        System.out.println( i2.toString() );
        System.out.println( i3.toString() );
        System.out.println( i4.toString() );
        }*/
}
