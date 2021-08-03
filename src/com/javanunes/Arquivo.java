/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javanunes;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Properties;

/**
 *
 * @author ricardo
 */
public class Arquivo {
    
    private static String nomeArquivoHoras="idposHorarios.txt";
    
    public static String getHoras(int campo){
        try{
          FileInputStream le = new FileInputStream(nomeArquivoHoras); 
          Properties props = new Properties();
          props.load(le) ;
          
          if(campo == 1){
              return props.getProperty("hora1");
          }
          if(campo == 2){
              return props.getProperty("hora2");
          }
          if(campo == 3){
              return props.getProperty("hora3");
          }
          if(campo == 4){
              return props.getProperty("hora4");
          }
          return "00:00"; 
        }
        catch(Exception e){
          System.out.println("Erro ao obter arquivo "+e);
          return "00:00";
        }
    }
    
    public static void setHoras(String hora1, String hora2, String hora3, String hora4){
        try{
           Properties prop = new Properties();
           OutputStream escreve = new FileOutputStream(nomeArquivoHoras);
           prop.setProperty("hora1", View.txtHora1.getText());
           prop.setProperty("hora2", View.txtHora2.getText());
           prop.setProperty("hora3", View.txtHora3.getText());
           prop.setProperty("hora4", View.txtHora4.getText());
           prop.store(escreve, "");
        }
        catch(Exception e){
          System.out.println("Erro ao salvar arquivo "+e);
        }
        
    } 
    
}
