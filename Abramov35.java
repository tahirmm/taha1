/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abramov1;




import java.util.Scanner;

/**
 *
 * @author Tahir
 */
public class Abramov35 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int month=sc.nextInt();
        String season;
        switch(month){
        case 1: case 2:case 12:
            season="Winter";
            break;
        case 3:case 4:case 5:
            season="Spring";
            break;
        case 6:case 7:case 8:
            season="Summer";
            break;
        case 9:case 10:case 11:
            season="Authmn";
            break;
            
        }
        System.out.println(season);
 
    }
    
}
