import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author angelchavez
 */
public class Racional {
    private int num; 
    private int den; 
    private int multiplo; //Minimo comun multiplo
    public Racional(){
        num =1;
        den = 1;
    }
    
    public Racional (int n, int d){
        num = n; 
        if(d==0)
            den = 1;
        else
            den = d;
    }
    public void establecer (int num, int den){
        this.num = num; 
        if(den==0)
            this.den= 1;
        else
            this.den = den;
    }
    public void establecer (){
        Random numero = new Random();
        int num =0, den = 0; 
        num = numero.nextInt(10);
        while(den==0) //Con esto verificamos que el denominador nunca sera 0
        den = numero.nextInt(10); 
        establecer(num,den);
    }
    public void establecer (char a){
        /*Esta funcion resuelve los conflictos con la division */
        Random numero = new Random();
        int num = 0, den = 0;
        while(num==0)
            num = numero.nextInt(10);
        while(den==0)
            den = numero.nextInt(10); //Con esto verificamos que el denominador nunca sera 0
        establecer(num,den);
    }
    public void imprimir(){
        System.out.println("[" + num + ", " + den + "]");
    }
    public void mult(Racional x){
        num = num * x.num;
        den = den * x.den;
        reducir();
    }
    public void div(Racional x){
        num = num * x.den; 
        if(x.num==0){
            num = 0;
            den = 1;
        }
        else
        den = den * x.num;
        reducir();
    }
    public void suma (Racional x){
        //a/b + c/d = (ad+cb)/bd
        num = (num*x.den) + (x.num *den);
        den = den * x.den;
        //(ad+cb)/ bd -> 
        reducir();
    }
    public void resta (Racional x){
        //a/b - c/d = (ad-cb)/bd
        num = (num*x.den) - (x.num *den);
        den = den * x.den;
        //(ad-cb)/ bd -> 
        reducir();
    }
    public void reducir(){
        int dividir=mcd();
        num/=dividir;
        den/=dividir;
    }
    public int mcd(){
        multiplo=Math.abs(num);
        int v=Math.abs(den);
        if(v==0){
            return multiplo;
        }
        int r;
        while(v!=0){
            r=multiplo%v;
            multiplo=v;
            v=r;
        }
        return multiplo;
    }
    public int igual(Racional A){
        if(num == A.num && den == A.den || (num==0 && A.num==0) )
        return 1;
        else
        return 0;
    }
    
}
