/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package megszamlalas;

/**
 *
 * @author vagne
 */
public class Megszamlalas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int tomb[] = new int[5];
        
        int szamlalo = 0;
        for (int i = 0; i < 5; i++) {
            tomb[i] = (int) (Math.random() * 99) + 1;
            szamlalo++;
        }
        System.out.println("A tömb elemei: \n");
        for (int i=0;i<5; i++){
            System.out.print(i+1+".elem: "+" ");
            System.out.print(String.format("%,2d",tomb[i])+" \n");
        }
        System.out.println("");
        System.out.println(szamlalo+" elemű a tömbünk\n");
    }

}
