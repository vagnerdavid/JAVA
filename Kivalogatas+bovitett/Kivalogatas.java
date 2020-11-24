/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kivalogatas;

import java.util.Scanner;

/**
 *
 * @author vagne
 */
public class Kivalogatas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner bemenet;
        bemenet = new Scanner(System.in);
        
        System.out.println("\t KIVÁLOGATÁS TÉTELE\n");
        int mennyi;
        
        System.out.print("Hány jegy legyen? ");
            mennyi = bemenet.nextInt();
            
        int erdemjegyek[]= new int [mennyi];       
        int masolat [] = new int [mennyi];
        
        for (int i = 0; i < mennyi; i++) {
            erdemjegyek[i]= (int)(Math.random()*4)+1;
        }
        System.out.print("A jegyek: ");
        for (int i = 0; i < mennyi; i++) {
            System.out.print(erdemjegyek[i]+" ");
        }
        
        System.out.println("");
        
        int kettesekDb=0;
        for (int i = 0; i < mennyi; i++) {
            if (erdemjegyek[i]==2) {
                masolat[kettesekDb++]=erdemjegyek[i];
            }
        }
        System.out.print("Másolat tömb elemei: ");
        
            if (kettesekDb > 0){
                for (int i = 0; i < kettesekDb; i++) {
                    System.out.print(masolat[i]+" ");               
                }
            }
            else {
                System.out.print("nincs 2-es");
            }
        
        System.out.println("\nKettesek száma: "+kettesekDb);
        
        
        
        bemenet.close();
    }
    
}

