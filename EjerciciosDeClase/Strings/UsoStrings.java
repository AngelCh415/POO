import java.util.*;

public class UsoStrings {
    static void SubPre() {
        Str controlador = new Str();
        String A;
        String B;
        System.out.println("Ingrese la posible cadena pre o suf fijo: ");
        Scanner entrada = new Scanner(System.in);
        A = entrada.nextLine();
        System.out.println("Ingrese una cadena: ");
        Scanner entrada2 = new Scanner(System.in);
        B = entrada2.nextLine();
        controlador.Comparador(A, B);
    }
    static void Conitiene(){
        Str controlador = new Str();
        String A, B; 
        System.out.println("Ingrese la primera cadena");
        Scanner entrada = new Scanner(System.in);
        A = entrada.nextLine();
        System.out.println("Ingrese la segunda cadena: ");
        Scanner entrada2 = new Scanner(System.in);
        B = entrada2.nextLine();
        controlador.Contenedor(A, B);
    }
    public static void main(String[] args) {
        int caso;
        System.out.println(
                "Ingrese que quiere hacer: 1)Checar subfijos y prefijos  \n 2)Saber si una cadena contiene caracteres de la segunda");
        Scanner decision = new Scanner(System.in);
        caso = decision.nextInt();
        if (caso == 1)
            SubPre();
        else if(caso==2)
            Conitiene();
        
    } 
}         



