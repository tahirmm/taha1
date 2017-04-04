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
public class Abramov45 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a=1,b=2,c=3,d=4;
        if(a<=b&&b<=c&&c<=d){
            a=Math.max(Math.max(a,b),Math.max(c, d));
            b=Math.max(Math.max(a,b),Math.max(c, d));
            c=Math.max(Math.max(a,b),Math.max(c, d));
            d=Math.max(Math.max(a,b),Math.max(c, d));
        }else if(!(a>b&&b>c&&c>d)){
            a=a*a;
            b=b*b;
            c=c*c;
            d=d*d;
        }
    }
    
}
