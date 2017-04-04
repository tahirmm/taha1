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
public class Abramov44 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x=-3,y=-5,z=-8;
        if(x<1&&y<1&&z<1){
            if(x<z&&x<y){
                x=(y+z)/2;
            }
            if(y<z&&y<x){
                y=(x+z)/2;
            } 
            if(z<x&&z<y){
                z=(y+x)/2;
            }
        }else{
            if(x<y){
                x=(y+z)/2;
            }
            if(y<x){
                y=(x+z)/2;
            } 
            
        }
    }
    
}
