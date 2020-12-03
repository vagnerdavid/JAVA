/*
1. Hozz létre két tömböt: szamok1, szamok2 néven!
2. A tömbök elemszámát is véletlenszám generátorral állítsd elő 10 és 30 között.
3. Az elemek a -50 és +50 értéktartományba essenek.
4. Írasd ki a két tömböt egy-egy sorban ügyelve, hogy az elemek helyiérték szerint egymás alá kerüljenek.
5. Helyezd át a két tömb öttel osztható páros számait egy ujTomb nevű tömbbe, majd írasd ki sorbarendezve.
6. Írasd ki a legkisebb és legnagyobb számot az ujTomb-ből.
7. Írasd ki, többszöröse-e a legnagyobb szám a legkisebbnek?
8. Írasd ki, hogy 0-át tartalmaz-e az ujTomb?
9. Kérdezd meg, szeretné-e újrafuttatni a felhasználó a programot (i/n)! Ha igen, hajrá...
 */
package osszetett_feladat;
import java.util.Scanner;
/**
 *
 * @author vagne
 */
public class Osszetett_feladat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("\n ÖSSZETETT FELADATSOR\n");
        System.out.println(" VDZ 113C\n");
        
        Scanner bemenet = new Scanner(System.in);
        char valasz = 0;
        do{
            int darabszam = (int) (Math.random() * 10) + 30;
        
        int szamok1[] = new int[darabszam];
        int szamok2[] = new int[darabszam];

        for (int i = 0; i < darabszam; i++) {
            szamok1[i] = (int) (Math.random() * -50) + 50;
            szamok2[i] = (int) (Math.random() * -50) + 50;
        }
        System.out.println("\nA szamok1 tömb elemei: ");
        for (int i = 0; i < darabszam; i++) {
            System.out.print(String.format("%,4d", szamok1[i]) + " ");
        }
        System.out.println("\nA szamok2 tömb elemei: ");
        for (int i = 0; i < darabszam; i++) {
            System.out.print(String.format("%,4d", szamok2[i]) + " ");
        }

        int ujTomb[] = new int[darabszam];
        int ujTombdb = 0;
        for (int i = 0; i < darabszam; i++) {
            if (szamok1[i] % 5 == 0) {
                ujTomb[ujTombdb++] = szamok1[i];
            }
            if (szamok2[i] % 5 == 0) {
                ujTomb[ujTombdb++] = szamok2[i];
            }

        }
        System.out.println("\nAz ujTomb elemei: ");
        for (int i = 0; i < ujTombdb; i++) {
            System.out.print(String.format("%,4d", ujTomb[i]) + " ");
        }
        
        for (int i = 0; i < ujTombdb; i++) {
            if (ujTomb[i] == 0) {
                System.out.println("Az ujTomb 0-t tartalmaz");
            }
        }
        int legnagyobb = szamok1[0];
        int legkisebb = szamok1[0];
        for (int i = 0; i < darabszam; i++) {
            if (szamok1[i] > legnagyobb) {
                legnagyobb = szamok1[i];
            }
        }
        for (int i = 0; i < darabszam; i++) {
            if (szamok1[i] < legkisebb) {
                legkisebb = szamok1[i];
            }
        }
        
        if (legnagyobb % legkisebb == 0) {
            System.out.println("\nA szamok1 tömb legnagyobb eleme a legkisebb többszöröse");
        }
        else {
            System.out.println("\nA szamok1 tömb legnagyobb eleme nem többszöröse a legkisebbnek");
        }
        int legnagyobb2 = szamok2[0];
        int legkisebb2 = szamok2[0];
        for (int i = 0; i < darabszam; i++) {
            if (szamok1[i] > legnagyobb2) {
                legnagyobb2 = szamok1[i];
            }
        }
        for (int i = 0; i < darabszam; i++) {
            if (szamok1[i] < legkisebb2) {
                legkisebb2 = szamok1[i];
            }
        }
        
        if (legnagyobb2 % legkisebb2 == 0) {
            System.out.println("\nA szamok2 tömb legnagyobb eleme a legkisebb többszöröse");
        }
        else {
            System.out.println("\nA szamok2 tömb legnagyobb eleme nem többszöröse a legkisebbnek");
        }
            System.out.println("Újra lefuttatja a programot? i/n: ");
            valasz = bemenet.next().charAt(0);
    } while ((valasz == 'i') || (valasz == 'I'));
}
}