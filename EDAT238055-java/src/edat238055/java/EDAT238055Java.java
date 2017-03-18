/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edat238055.java;

import java.util.Scanner;

/**
 *
 * @author jonatas
 */
public class EDAT238055Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Scanner entrada = new Scanner(System.in);
        
        float soma=0,media =0;
        int evt,abaixo = 0;
        String abxmedia = "";
        String indice = "";
        
        do {
            System.out.println("Bem-vindo as Olimpíadas! \n");
            System.out.println("Por favor informe a quantidade de eventos realizados");
            evt = entrada.nextInt();
        
        } while (!(evt >= 5 & evt <=30));
        
        int[] evento = new int[evt];
        
        System.out.println("A quantidade de eventos é: "+evt);
        
        for (int i = 0; i < evt; i++) {
            
            System.out.println("Quantos ingressos foram vendidos no "+(i+1)+"º evento");
            int ing = entrada.nextInt();
          
            evento[i] = ing;
            soma += evento[i];
            
        }
        
            
            media = (float)soma / (float)evt;
            
           
       
            for (int i = 0; i < evt; i++) {
                
                if (evento[i] < media) {
                    
                    abaixo += evento[i]; 
                   
                    //String abxmedia = Integer.toString(evento[i]);
                    abxmedia += evento[i] +"\t";
                    indice += Integer.toString(i+1)+"\t";
                }
                
                
                 
        }
            
        System.out.println("A media dos ingressos vendidos nos eventos é: "+media);
        if (abaixo <= 0) {
            System.out.println("Nenhum evento ficou abaixo da média");
        }else{
            System.out.println("A quantidade de igressos que estão abaixo da media são: "+abaixo);
            System.out.println("Evento    "+indice+"\nQuantidade"+abxmedia);
        }

    }
    
}
