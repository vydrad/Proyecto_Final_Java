/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabajopracticointegradorgrupo7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author david
 */


public class ManipularCSV {
    private BufferedReader lector;
    private String linea;
    private String partes[]=null;
    
    
    public void leerArchivo(String nombreArchivo){
        try{
        lector =new BufferedReader(new FileReader(nombreArchivo));
        while((linea=lector.readLine())!=null){
            partes=linea.split(",");
            imprimirLinea();
            System.out.println("");   
        }
        lector.close();
        linea=null;
        partes=null;
        
    } catch(Exception e){
        JOptionPane.showMessageDialog(null,e);
    }
        
    }
    
    public void imprimirLinea(){
        
       for(int i=0;i<partes.length;i++){
           System.out.print(partes[i]+" | ");
       }
    }
    
   
     public int ContarArchivo(String nombreArchivo){
         int i=0;
        try{
        lector =new BufferedReader(new FileReader(nombreArchivo));
        while((linea=lector.readLine())!=null){
            i++;
 
        }
        lector.close();
        linea=null;
        partes=null;
        
    } catch(Exception e){
        JOptionPane.showMessageDialog(null,e);
    }
        return i;
    }
     
     
       public Partido[] SacarPartidos(String nombreArchivo, Partido[] partido){
         int i=0;
        try{
        lector =new BufferedReader(new FileReader(nombreArchivo));
        while((linea=lector.readLine())!=null){
            
            String parte0= linea.split(",")[0];///NUMERO RONDA
            int ronda=Integer.parseInt(parte0);
            String parte1= linea.split(",")[1];///PAIS 1
            String parte2= linea.split(",")[2];//GOLES 1
            int goles1=Integer.parseInt(parte2);
            String parte3= linea.split(",")[3];///GOLES 2
            int goles2=Integer.parseInt(parte3);
            String parte4= linea.split(",")[4];///PAIS 2
            
            Ronda rondita=new Ronda(ronda,0,0);
            Equipo Equipo1=new Equipo(parte1,0);
            Equipo Equipo2=new Equipo(parte4,0);
      
            Partido parti=new Partido(rondita,Equipo1,Equipo2,goles1,goles2);
            partido[i]=parti;
            
              i++;       
        }
        lector.close();
        linea=null;
        partes=null;
        
    } catch(IOException | NumberFormatException e){
        JOptionPane.showMessageDialog(null,e);
    }
        return partido;
    
       }
       
       public Pronostico[] SacarPronosticos(String nombreArchivo, Pronostico[] pronos){
         int i=0;
        try{
        lector =new BufferedReader(new FileReader(nombreArchivo));
        String Ganador=new String();
        while((linea=lector.readLine())!=null){
            
            String parte0= linea.split(",")[0];///NOMBRE
            String parte1= linea.split(",")[1];///PAIS 1
            String parte2= linea.split(",")[2];//  X GANA PAIS1
            String parte3= linea.split(",")[3];///  X EMPATE
            String parte4= linea.split(",")[4];///  X GANA PAIS2
             String parte5= linea.split(",")[5];///PAIS 2
            
             if(parte2.equals("X")){
                 Ganador=parte1;
             }
             else if(parte3.equals("X")){
                 Ganador="EMPATE";
                  }
             else if(parte4.equals("X")){
                 Ganador=parte5;
             }
            
            Equipo Equipo1=new Equipo(parte1,0);
            Equipo Equipo2=new Equipo(parte5,0);
      
            Pronostico pronosti=new Pronostico(parte0,Equipo1,Equipo2,Ganador);
            pronos[i]=pronosti;
            
              i++;       
        }
        lector.close();
        linea=null;
        partes=null;
        
    } catch(IOException | NumberFormatException e){
        JOptionPane.showMessageDialog(null,e);
    }

        return pronos;
    
       }
     
    
    
    
    
    
    
    
    
    
       }