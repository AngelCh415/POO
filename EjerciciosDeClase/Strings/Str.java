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
        /*
        Podemos decir que algunos sufijos y prefijos se pueden escribir iniciando con mayusculas
        
        */
        A = A.toLowerCase();
        B = B.toLowerCase();
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
        int [] cubA = new int [256];
        int [] cubB = new int [256];
        int ban = 0;
        int AsciiValue;
        /*
        Como tal no es necesario ya que Sa != sa
        A = A.toLowerCase();
        B = B.toLowerCase();*/
        for(int i=0; i<256;i++){
            cubB[i]=0;
            cubA[i]=0;
        }
        for(int i=0; i<B.length(); i++){
            char aux = B.charAt(i);
            AsciiValue = (int) aux;
            cubB[AsciiValue] ++;
            aux = A.charAt(i); 
            AsciiValue = (int) aux;
            cubA [AsciiValue]++;
        }
        for(int i=0; i<256;i++){
            if(cubA[i]!=cubB[i]) ban++;
        }
        if(ban==0) System.out.println("Contienen los mismos caracteres ");
        else {
            System.out.println("No contienen los mismos caracteres.");
            System.out.println("Se diferencian por " + ban + "caracteres");
        }
    }
    public void Contenedor(String A, String B){
        if(A.length()!=B.length()) Imprimir();
        else Cubetas(A,B);
    }
    private void Imprimir(){
        System.out.println("Como no tienen tamaño igual es imposible que contengan los mismos caracteres");
    }
    private void Imprimir(int total, int maximo, int minimo, int []arre){
        System.out.println("Palabras totales " + total);
        System.out.println("La palabra más larga tiene " +maximo +" caracteres");
        System.out.println("La palabra más corta tiene " + minimo +" caracteres");
        System.out.println("La frecuencia es: ");
        for(int i=0; i< 20000000; i++){
            if(arre[i]!=0){
                System.out.println("Hay " + arre[i] + " palabras con " +i + " caracteres de longitud.");
            }
        }
    }
    public void Palabras(String A){
        int mini = 20000000, maxi=-1, pal_total=0,lact=0;
        char a='a', b='a';
        int [] arre = new int[20000000];
        for(int i=0; i<20000000; i++) arre[i]=0;
        for(int i=0; i<A.length();i++){
            a = A.charAt(i);
            if(a==' ' && A.charAt(i-1)!= ' '){
                pal_total++;
                if(lact>maxi) maxi = lact;
                else if(lact<mini) mini = lact;
                arre[lact]++;
                lact =0;
                b=a;
            }else{
                lact++;
            }
        }
        if(a!=' '){
            pal_total++; 
            if(lact>maxi) maxi = lact;
            else if(lact<mini) mini = lact;
            arre[lact]++;
        }
        if(mini==20000000) mini = maxi;
        Imprimir(pal_total,maxi,mini,arre);
    }
}
