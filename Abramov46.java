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
public class Abramov46 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double x=-4,y=-5;
        if(x<0&&y<0){
            Math.abs(x);
            Math.abs(y);
        }
        else if(x<0&&y>0){
            x=x+0.5;
            y=y+0.5;
        }
        else if(x>0&&y<0){
            x=x+0.5;
            y=y+0.5;
        }
        if(x<0&&y<0){
           if((0.5>x&&x<2.0)&&!(0.5>y&&y<2.0)){
               x=x*10;
               y=y*10;
           }
           if((0.5>y&&y<2.0)&&!(0.5>x&&x<2.0)){
               x=x*10;
               y=y*10;
           }
           
        }
}
}