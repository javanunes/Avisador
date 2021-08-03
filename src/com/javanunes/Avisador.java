/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javanunes;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author ricardo
 */
public class Avisador {
   
    public static String getHora(){
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        Date dia = new Date();
        String hora24 = sdf.format(dia);
        return hora24;
    }
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(getHora());
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View().setVisible(true);
            }
        }) ;
        
    }
    
   
}
