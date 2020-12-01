/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorbarendezes;

import java.util.Scanner;

/**
 *
 * @author vagne
 */
public class Sorbarendezes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("\nSORBARENDEZÉS TÉTELE (buborékos módzser)\n");

        System.out.print("Hány elemű tömböt szeretne? ");
        Scanner bemenet = new Scanner(System.in);
        int elemSzam = bemenet.nextInt();
        int[] szamok = new int[elemSzam];

        //tömb feltöltése - elemek random értéket kapnak
        for (int i = 0; i < elemSzam; i++) {
            szamok[i] = (int) (Math.random() * 100) - 50;
        }

        //tömb kiíratása
        System.out.println("\nTömbünk elemei:");
        for (int i = 0; i < elemSzam; i++) {
            System.out.print(szamok[i] + " ");
        }

        //tömb sorbarendezett kiíratása: buborékos rendezés
        for (int i = 0; i < elemSzam - 1; i++) {
            for (int j = 0; j < elemSzam - i - 1; j++) {
                if (szamok[j] > szamok[j + 1]) {
                    int temp = szamok[j];
                    szamok[j] = szamok[j + 1];
                    szamok[j + 1] = temp;
                }
            }
        }
        System.out.println("\nRendezett tömbünk:");
        for (int i = 0; i < elemSzam; i++) {
            System.out.print(szamok[i] + " ");
        }

    }

}
