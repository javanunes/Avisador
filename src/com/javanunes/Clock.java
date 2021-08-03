/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javanunes;

import java.applet.Applet;
import java.applet.AudioClip;
import java.io.File;
import java.net.URL;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane ;

/**
 *
 * @author ricardo
 */
public class Clock extends Thread{

    public void alert(String texto){
        JOptionPane.showMessageDialog (null, texto) ;
    }
    
    public static void tocar(){
        try{
         URL u = Avisador.class.getResource("alerta.wav");
         Clip clip = AudioSystem.getClip();
         clip.open(AudioSystem.getAudioInputStream(u));
         clip.start();
        }
        catch(Exception e){
            System.out.println("erro ao tocar a bosta do som: "+e);
        }
        
    }
    
    
    
    @Override
    public void run() {
       while(true){
           try{
              // Ficamos num looping infinito rodando numa thread de 2 em 2 segundos verificando se os horários inseridos
              // pelo usuário são os atuais, se for, emite um alerta e poe o valor do label como ok.
              Thread.sleep(2000);
              
              System.out.println(".");
              if(View.txtHora1.getText().equals(Avisador.getHora())){
                  tocar();
                  alert("Deu a hora do seu intervalo de descanso!");
                  View.lbHora1.setText("OK");
              }
              if(View.txtHora2.getText().equals(Avisador.getHora())){
                  tocar();
                  alert("Deu a hora do intervalo de LANCHE !");
                  View.lbHora2.setText("OK");
              }
              if(View.txtHora3.getText().equals(Avisador.getHora())){
                  tocar();
                  alert("Deu a hora do ultimo descanso seu !");
                  View.lbHora3.setText("OK");
              }
              if(View.txtHora4.getText().equals(Avisador.getHora())){
                  tocar();
                  alert("É hora do seu treinamento, vai treinar !");
                  View.lbHora4.setText("OK");
              }
              
           }
           catch(Exception e){
               System.out.println("Falha no thread verificado de clock: "+ e);
           }
           
       }
    }
    
    
    
}
