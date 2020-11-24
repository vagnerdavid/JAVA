/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kivalogatas_bovitett;

import java.util.Scanner;

/**
 *
 * @author vagne
 */
public class Kivalogatas_bovitett {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("\n\tKIVÁLOGATÁS TÉTEL KIBŐVÍTVE\n");
       
        
        Scanner bemenet=new Scanner(System.in);
        System.out.print("Hány jegyet generáljunk? ");
        int jegyekSzama=bemenet.nextInt();
        
        int[] jegyek=new int[jegyekSzama];
        int[] egyesek=new int[jegyekSzama];
        int[] kettesek=new int[jegyekSzama];
        int[] harmasok=new int[jegyekSzama];
        int[] negyesek=new int[jegyekSzama];
        int[] otosok=new int[jegyekSzama];
        
        System.out.println("\nÉrdemjegyek: ");
        
        for (int i = 0; i <jegyekSzama; i++){
            jegyek[i]=(int)(Math.random()*5)+1;
            System.out.print(jegyek[i]+" ");
        }
        System.out.println("");
        
        int egyesekDb=0;
        int kettesekDb=0;
        int harmasokDb=0;
        int negyesekDb=0;
        int otosokDb=0;
        
        for (int i = 0; i < jegyekSzama; i++){
            if (jegyek[i]==1){
                egyesek[egyesekDb++]=jegyek[i];
            }
            if (jegyek[i]==2){
                kettesek[kettesekDb++]=jegyek[i];
            }
            if (jegyek[i]==3){
                harmasok[harmasokDb++]=jegyek[i];
            }
            if (jegyek[i]==4){
                negyesek[negyesekDb++]=jegyek[i];
            }
            if (jegyek[i]==5){
                otosok[otosokDb++]=jegyek[i];
            }
        }
                
        System.out.print("\nEgyesek tömb elemei: ");
        for (int i = 0; i <egyesekDb; i++){
            System.out.print(egyesek[i]+" ");
        }
        System.out.print("\nKettesek tömb elemei: ");
        for (int i = 0; i <kettesekDb; i++){
            System.out.print(kettesek[i]+" ");
        }
        System.out.print("\nHármasok tömb elemei: ");
        for (int i = 0; i <harmasokDb; i++){
            System.out.print(harmasok[i]+" ");
        }
        System.out.print("\nNégyesek tömb elemei: ");
        for (int i = 0; i <negyesekDb; i++){
            System.out.print(negyesek[i]+" ");
        }
        System.out.print("\nÖtösök tömb elemei: ");
        for (int i = 0; i <otosokDb; i++){
            System.out.print(otosok[i]+" ");
        }
        System.out.println("\n\nEgyesek száma:"+egyesekDb);
        System.out.println("\n\nKettesek száma:"+kettesekDb);
        System.out.println("\n\nHármasok száma:"+harmasokDb);
        System.out.println("\n\nNégyesek száma:"+negyesekDb);
        System.out.println("\n\nÖtösök száma:"+otosokDb);
    }
}
