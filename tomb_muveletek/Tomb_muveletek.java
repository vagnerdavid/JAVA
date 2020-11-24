
package tomb_muveletek;

import java.util.Scanner;
import java.lang.Math; 

public class Tomb_muveletek {

    
    public static void main(String[] args) {
    
        Scanner bemenet;
        bemenet = new Scanner(System.in);
        int osszeg1=0;
        int osszeg2=0;
        int sorOsszeg=0;
        int szam;
        
        System.out.println("\tTÖMBŰVELETEK\n");
        System.out.println("Készítette VDZ 113C\n");
        System.out.print("Hány eleműek legyenek a tömbök?");
            szam = bemenet.nextInt();
        System.out.println("");
        int tomb1[] = new int [szam]; 
        int tomb2[] = new int [szam]; 
        
        for (int i = 0; i < szam; i++) {
            tomb1[i] = (int) (Math.random()*999)+1;
            osszeg1=osszeg1+tomb1[i];
            tomb2[i] = (int) (Math.random()*999)+1;
            osszeg2=osszeg2+tomb2[i];
        }
        
         for (int i = 0; i < szam; i++) {
            sorOsszeg = tomb1[i]+tomb2[i];
            System.out.print("A tömbök "+(i+1) + ". elemei: " + (String.format("%,3d", tomb1[i])+" + "));
            System.out.print(String.format("%,3d", tomb2[i])+" = ");
            System.out.println(String.format("%,5d",sorOsszeg));
        }
         
        System.out.println("\nAz első tömb elemeinek összege: "+String.format("%,5d",osszeg2));
        System.out.println("A második tömb elemeinek összege: "+String.format("%,5d",osszeg1));
        
        
        
        
        //2 db tömb, felhasználó adja meg hány elemű, egymás mellé az elemek, 1-1000 között
    
    bemenet.close();
    }
}