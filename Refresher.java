/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refresher;

import java.util.Scanner;
/**
 *
 * @author kendrabooker
 */
public class Refresher {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ky = new Scanner(System.in);
        
        String userName;
        
        System.out.print("Whats your name? ");
        userName = ky.next();
        
        if("mitchell".equals(userName)){
        
            for(int i = 1; i <= 5; i++){
            
                System.out.println(userName);
            }
            
        }else{
        
            for(int i =1; i <= 10; i++){
            
                System.out.println(userName);
            }
        }
    }
    
}
