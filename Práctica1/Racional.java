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
        
    }
    public void div(Racional x){
        num = num * x.den; 
        if(x.num==0){
            num = 0;
            den = 1;
        }
        else
        den = den * x.num;
        //reducir();
    }
    public void suma (Racional x){
        //a/b + c/d = (ad+cb)/bd
        num = (num*x.den) + (x.num *den);
        den = den * x.den;
        //(ad+cb)/ bd -> 
        //reducir();
    }
    public void resta (Racional x){
        //a/b - c/d = (ad-cb)/bd
        num = (num*x.den) - (x.num *den);
        den = den * x.den;
        //(ad-cb)/ bd -> 
       // reducir();
    }
    public void reducir(){
        int mcm = mcm(den,num);
        this.den /=mcm;
        this.num /=mcm;
    }
    public int mcm(int num1, int num2){
        int multiplo = 1; 
        int i = 2; 
        if(num1==0) return num2;
        while(i <= num1 || i <= num2)
        {
            if(num1%i==0 || num2%i==0)
            {
            multiplo*=i;
            if(num1%i==0) num1=num1/i;
            if(num2%i==0) num2=num2/i;
            }
            else
                i=i+1;               
        } 
        return multiplo;
    }
    public int igual(Racional A){
        if(num == A.num && den == A.den )
        return 1;
        else
        return 0;
    }
    
}
