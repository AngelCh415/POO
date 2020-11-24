public class Str {
    private int Prefijo (String A, String B){
        String comp; 
        comp = B.substring(0,A.length()); 
        if(comp.equals(A)) return 1;
        else return -1;
    }
    private int Subfijo( String A, String B){
        String comp;
        int iniSub = A.length(); 
        iniSub = B.length() - iniSub; 
        
        comp = B.substring(iniSub, B.length());
        if(comp.equals(A)) return 2;
        else return -1;
    }
    public void Comparador(String A, String B){
        if(A.equals(B)) Imprimir(0);
        else if(Prefijo(A, B)==1) Imprimir(1);
        else if (Subfijo(A,B)== 2) Imprimir(2);
        else Imprimir(-1);
    }
    private void Imprimir (int i){
        if(i==0){
            System.out.println("Son la misma cadena");
        }
        else if(i==1){
            System.out.println("Es prefijo");
        }
        else if(i==2){
            System.out.println("Es subfijo");
        }
        else{
            System.out.println("No es nada");
        }
    }
    private void Cubetas (String A, String B){
        char [] cubA = new char [256];
        char [] cubB = new char [256];
        

    }
    public void Contenedor(String A, String B){
        Cubetas(A,B);
    }
}
