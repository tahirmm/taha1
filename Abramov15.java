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
public class Abramov15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double h=5,a=4,b,r;
        b=Math.sqrt((h*h)-(a*a));
        double p;
        p=0.5*(a+b+h);
        r=Math.sqrt(((p-a)*(p-b)*(p-h))/p);
        System.out.println(r+" "+b);
        
        
    }
    
}
