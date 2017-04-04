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
public class Abramov51 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a=2,b=4,c=5;
        if ((a == 0) || (b == 0) || (c != 0)){
            System.out.println("Error");
            
        }
        double x1,x2;
        if (a != 0) {
            if (b * b - 4 * a * c > 0) {
                int d=b * b - 4 * a * c ;
                
                x1=(-b+(Math.sqrt(d)))/2*a;
                x2=(-b-(Math.sqrt(d)))/2*a;
                x1=Math.sqrt(x1);
                x2=Math.sqrt(x2);
            }
            
        }
        
    }
    
}
