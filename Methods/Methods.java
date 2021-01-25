/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods;
import java.util.Scanner;
import java.lang.Math;
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
    private static double szamitKerulet(double a, double b,double c){
      return a+b+c;
}
    private static double szamitTerulet(double a, double m){
      return (a*m)/2.0;
}
    private static double szamitTerulet2(double a, double b, double c){
      double s = (a+b+c)/2.0;
      return Math.sqrt(s*(s-a)*(s-b)*(s-c));
}
  
  
  
    public static void main(String[] args) {
        elvalaszto();
        System.out.println("Vágner Dávid Zoltán");
        elvalaszto();
        teljesNev("Lakatos", "Brendon");
        teljesNev("Rézmíves", "Emánuel");

        elvalaszto();
    
        System.out.println("Háromszög terület, kerület számító program!");
        
        System.out.printf("Kerulet: %.2f\n", szamitKerulet(25,30,35));
        System.out.printf("Terulet: %.2f\n", szamitTerulet(25,30));
        System.out.printf("Terulet: %.2f\n", szamitTerulet2(25,30,35));
    
    }
    
}
