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
public class Abramov49 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double a,b,c,h=2;
        a=Math.sqrt((Math.abs(Math.sin(8*h))+17)/(Math.pow(1-Math.sin(4*h*Math.cos((h*h+18))),2)));
        b=1-Math.sqrt(3/(3+Math.abs(Math.tan(a*(h*h)))-Math.sin(a*h)));
        c=(a*(h*h)*Math.sin(a*h))+(b*Math.pow(h,3)*Math.cos(a*h));
        if ((a == 0) || (b == 0) || (c != 0)){
            System.out.println("Error");
            
        }
        if (a != 0) {
            if (b * b - 4 * a * c > 0) {
                double d=b * b - 4 * a * c ;
                double x1,x2;
                x1=(-b+(Math.sqrt(d)))/2*a;
                x2=(-b-(Math.sqrt(d)))/2*a;
            }
        }
    }
    
}
