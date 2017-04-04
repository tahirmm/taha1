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
public class Abramov42 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a=4,b=5;
        if(a>b){
            a=(a+b)/2;
            b=(a*a)*(b*b);
        }
        if(a<b){
            b=(a+b)/2;
            a=(a*a)*(b*b);
        }
    }
    
}
