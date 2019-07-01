/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import gui.Mesa;
public class Principal {
    
    public static void main(String [] args){
        
        Mesa mesa1 = new Mesa();
        mesa1.setVisible(true);
        mesa1.novoJogo();
    }
    
}
