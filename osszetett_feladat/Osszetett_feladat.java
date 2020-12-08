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
        char valasz;
        do{
            int darabszam = (int) (Math.random() * 10 + 30);
        
        int szamok1[] = new int[darabszam];
        int szamok2[] = new int[darabszam];

        for (int i = 0; i < darabszam; i++) {
            szamok1[i] = (int) (Math.random() * 100) + -50;
            szamok2[i] = (int) (Math.random() * 100) + -50;
        }
        System.out.println("\nA szamok1 tömb elemei: ");
        for (int i = 0; i < szamok1.length; i++) {
            System.out.print(String.format("%,4d", szamok1[i]) + " ");
        }
        System.out.println("\nA szamok2 tömb elemei: ");
        for (int i = 0; i < szamok2.length; i++) {
            System.out.print(String.format("%,4d", szamok2[i]) + " ");
        }
        int ujTomb[] = new int[darabszam];
        for (int i = 0; i < darabszam; i++) {
            if (szamok1[i] % 5 == 0) {
                ujTomb[i] = szamok1[i];
            }
        for (int j = 0; j < darabszam; j++) {
            if (szamok2[j] % 5 == 0){
                ujTomb[j+1] = szamok2[j];
            }    
        }    
        }
        System.out.println("\nAz ujTomb elemei: ");
        for (int i = 0; i < ujTomb.length; i++) {
            System.out.print(String.format("%,4d", ujTomb[i]) + " ");
        }
        
        int legkisebb = ujTomb[0];
        int legnagyobb = ujTomb[0];
            for (int i = 1; i < ujTomb.length; i++) { 
                if (ujTomb[i] > legnagyobb) {
                    legnagyobb = ujTomb[i];
                }
            }
        for (int i = 0; i < ujTomb.length; i++) {
            if (ujTomb[i] < legkisebb) {
                legkisebb = ujTomb[i];
            }
        }
        
            System.out.println("\nA legnagyobb elem: " + legnagyobb + ", a legkisebb elem: " + legkisebb);

        for (int i = 0; i < ujTomb.length; i++) {
            if (ujTomb[i] == 0) {
                System.out.println("Az ujTomb 0-t tartalmaz");
                break;
            }
        }
        
        System.out.println("Újra lefuttatja a programot? i/n: ");
        valasz = bemenet.next().charAt(0);
    } while ((valasz == 'i') || (valasz == 'I'));
  }
}
