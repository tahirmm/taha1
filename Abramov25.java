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
public class Abramov25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int  x1,x2,y1,y2,x3,y3;
        double a,b,c;
        a=Math.sqrt(Math.pow(x1-x2,2)*Math.pow(y1-y2,2));
        b=Math.sqrt(Math.pow(x2-x3,2)*Math.pow(y2-y3,2));
        c=Math.sqrt(Math.pow(x1-x3,2)*Math.pow(y1-y3,2));
        double p=0.5*(a+b+c);
        double s=p*Math.sqrt((p-a)*(p-b)*(p-c));
        
    }
    
}
