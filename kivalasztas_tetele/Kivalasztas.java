/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kivalasztas;
import java.util.Scanner;
/**
 *
 * @author vagne
 */
public class Kivalasztas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("\n KIVÁLASZTÁS TÉTELE\n");
        System.out.println(" VDZ 113C\n");
        
        Scanner bemenet = new Scanner(System.in);
        
        int elemszam = 20;
                
        int tomb1[] = new int [elemszam];
        
        for (int i = 0; i < elemszam; i++) {
            tomb1[i] = (int) (Math.random()*100)+1;
        }
        System.out.println("eredeti:");
        for (int i = 0; i < elemszam; i++) {
            System.out.print(tomb1[i]+" ");
        }
        System.out.println("\n3-asával");
        for (int i = 3; i < elemszam; i+=3) {
            System.out.print(tomb1[i]+" ");
        }
        
        System.out.print("\nMelyik elem sorszámára vagy kíváncsi? ");
        int keresettSzam = bemenet.nextInt();
        
        System.out.println("\n");
        int j = 0;
        for (int i = 0; i < elemszam; i++) {
            if (tomb1[i] == keresettSzam){
                System.out.print("A keresett szám indexe: "+(i+1));
                break;
            }   
            j++;
            
        }
        
        if (elemszam == j){
            System.out.println("Nem volt benne.");
        }
        
        
        
        
        System.out.println("\n");
        int i = 0;
        while(tomb1[i] != keresettSzam){
            i++;
        }
        System.out.print("A keresett szám indexe: "+(i+1));
        
        
        bemenet.close();
    }
    
}
