/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods;
import java.util.Scanner;
/**
 *
 * @author vagne
 */
public class Methods {
    static void elvalaszto(){
        System.out.println("\n--------------------------------------------------------------------------------------------------------------------------------------------------------\n");
}
  static void teljesNev(String uto, String nev) {
    System.out.println(uto +" "+nev);
  }
  
  
  
  
    public static void main(String[] args) {
        elvalaszto();
        System.out.println("Vágner Dávid Zoltán");
        elvalaszto();
        teljesNev("Lakatos", "Brendon");
        teljesNev("Rézmíves", "Emánuel");

        elvalaszto();
    }
    
}
