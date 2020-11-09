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
        num = numero.nextInt(9);
        den = numero.nextInt(9); 
        this.num = num;
        this.den = den;
    }
    public void imprimir(){
        System.out.println("[" + num + ", " + den + "]");
    }
    public void mult(Racional x){
        num = num * x.num;
        den = den * x.den;
    }
    public void multr(Racional x, Racional y){
        num = x.num * y.num; 
        den = x.den * y.den;
    }
    public void mult(int n, int d){
        num = num * n; 
        den = den * d;
    }
    public Racional mul(Racional x){
        this.num *= x.num;
        this.den *= x.den; 
        return this;
    }
    public void div(Racional x){
        num = num * x.den; 
        den = den * x.num;
    }
    public void div(int n,int d){
        num *=d; 
        den *=n;
    }
    /*Codigo creado por José Juan Suárez Elizalde, tomado el 22 de octubre del 2020*/
    public int gcd(int a,int b){
        if(b==0)return a;
        return a>b?gcd(b,a%b):gcd(a,b%a);
    }
        /*Codigo creado por José Juan Suárez Elizalde, tomado el 22 de octubre del 2020*/
    public void reduce(){
        int gcd = gcd(this.den,this.num);
        this.den/=gcd;
        this.num/=gcd;
    }
    
}
