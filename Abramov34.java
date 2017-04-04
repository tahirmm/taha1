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
public class Abramov34 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x=2,y=3,z=5,r;
        int max;
        
        max=x>y?x:y>z?y:z;
        System.out.println(max);
        
        if(x>y&&x>z){
            max=x;
            System.out.println(max);
        }else if(z>y){
            max=z;
            System.out.println(max);
        }else if(y>z){
            max=y;
            System.out.println(max);
        }
    }
    
}
