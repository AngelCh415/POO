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
        den = numero.nextInt(10); 
        establecer(num, den);
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
        int u=Math.abs(num);
        int v=Math.abs(den);
        if(v==0){
            return u;
        }
        int r;
        while(v!=0){
            r=u%v;
            u=v;
            v=r;
        }
        return u;
    }
    public int igual(Racional A){
        if(num == A.num && den == A.den )
        return 1;
        else
        return 0;
    }
    
}
