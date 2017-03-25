/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abramov1;

/**
 *
 * @author Tahir
 */
public class Abramov23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a=4,b=5,c=6;
        double h,p=0.5*(a+b+c);
        h=(Math.sqrt(p*(p-a)*(p-b)*(p-c)))/a;
        double m;
        m=0.5*((2*Math.pow(b,2))+(2*Math.pow(c,2))-(Math.pow(a,2)));
        double B;
        B=(2/(b+c))*Math.sqrt(b*c*p*(p-1));
        double r1,r2;
        r1=Math.sqrt(((p-a)*(p-b)*(p-c))/p);
        r2=(a*b*c)/(4*Math.sqrt(p*(p-a)*(p-b)*(p-c)));
    }
    
}
