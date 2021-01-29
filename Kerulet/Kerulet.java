/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kerulet;
import java.util.Scanner;
/**
 *
 * @author vagne
 */
public class Kerulet {

        private static double teglalapKer(double a, double b){
        return (a + b)*2;
    }
    private static double korKer(double r){
        return (r*Math.PI)*2;
    }
    private static double haromszogKer(double a, double b, double c){
        return a + b + c;
    }
    private static double otszogKer(double a){
        return a * 5;
    }
    private static double hatszogKer(double a){
        return a * 6;
    }    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner bemenet = new Scanner(System.in);
        int valasz; 
        int ujra;
        System.out.println("\tMenüs Kerület számító program!");
        System.out.println("\tVégner Dávid Zoltán 113C");
        
        do{
            System.out.println("\nMelyik alakzat kerületét szertné kiszámolni?");
            System.out.println("1-téglalap");
            System.out.println("2-kör");
            System.out.println("3-háromszög");
            System.out.println("4-szabályos ötszög");
            System.out.println("5-szabályos hatszög");
            System.out.print("Válasz: ");
                valasz = bemenet.nextInt();

            while(!(valasz == 1 || valasz == 2 || valasz == 3 || valasz == 4 || valasz == 5)){
                System.out.print("\nRossz számot adott meg!\nAdjon meg egy számot 1-5-ig: ");
                    valasz=bemenet.nextInt();
            }
                if (valasz == 1) {
                    double aOldal, bOldal;

                    System.out.print("\nAdja meg az 'a' oldalt: ");
                        aOldal=bemenet.nextDouble();
                    System.out.print("Adja meg a 'b' oldalt: ");
                        bOldal=bemenet.nextDouble();

                    System.out.printf("\nA téglalap kerülete: %,2f\n", teglalapKer(aOldal, bOldal));                  
                }
                else if (valasz == 2) {
                    double sugar;

                    System.out.print("\nAdja meg a kör sugarát: ");
                        sugar=bemenet.nextDouble();

                    System.out.printf("\nA kör kerülete: %,2f\n", korKer(sugar));                   
                }
                else if (valasz == 3) {
                    double aOldal, bOldal, cOldal;

                    System.out.print("\nAdja meg az 'a' oldalt: ");
                        aOldal=bemenet.nextDouble();
                    System.out.print("Adja meg a 'b' oldalt: ");
                        bOldal=bemenet.nextDouble();
                    System.out.print("Adja meg a 'c' oldalt: ");
                        cOldal=bemenet.nextDouble();

                    System.out.printf("\nA háromszög kerülete: %,2f\n", haromszogKer(aOldal, bOldal, cOldal));                   
                }
                else if (valasz == 4) {
                    double aOldal;

                    System.out.print("\nAdja meg az ötszög oldalát: ");
                        aOldal=bemenet.nextDouble();

                    System.out.printf("\nAz ötszög kerülete: %,2f\n", otszogKer(aOldal));                
                }
                else if (valasz == 5) {
                    double aOldal;

                    System.out.print("\nAdja meg a hatszög oldalát: ");
                        aOldal=bemenet.nextDouble();

                    System.out.printf("\nA hatszög kerülete: %,1f\n", hatszogKer(aOldal));                  
                }
                
                System.out.println("Szeretné újra lefuttatni? (1=Igen/0=Nem");
                    ujra=bemenet.nextInt();
            }
            while (ujra == 1);
        
        
            bemenet.close();
    }
    
}