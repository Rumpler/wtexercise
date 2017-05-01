/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ue05;

/**
 *
 * @author Gerrit
 */
public class BMILogic {
    
    
    public static double computeBMI(double size, double weight){
        if(size == 0) return 404;
        return (weight / (size * size));
    }

    
    
    
 
}
