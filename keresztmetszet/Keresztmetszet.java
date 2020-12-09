/*
1. Hozz létre HÁROM azonos elemszámú tömböt: szamtomb1, szamtomb2, szamtomb3 néven!
2. A tömbök elemszámát is véletlenszám generátorral állítsd elő 5 és 10 között.
3. Az elemek a -100 és +100 értéktartományba essenek.
4. Írasd ki a három tömböt egy-egy sorban ügyelve, hogy az elemek helyiérték szerint egymás alá kerüljenek.
5. Írasd ki az azonos indexű tömbelemeket egymás mellé az összegükkel az alábbi módon (az 1. index esetén):
     1. számok: 98 + 65 + 34 = 197
6. Írasd ki a páros indexű tömbelemek legkisebb elemét.
    Legkisebb számok:  56 (2. ), -44 (4.), -5 (6.), ...
7. Fésüld össze a három tömböt egy közös tömbbe teljesTomb néven és írasd ki az elemeket sorbarendezve! 
8. Írasd ki azokat az elemeket, melyekből több is található a teljesTombben! (sorbarendezés tételét gondold újra....)
9. Kérdezd meg, szeretné-e újrafuttatni a felhasználó a programot (i/n)! Ha igen, hajrá...

A feladatrészek elé emeljétek be kommentbe az adott feladat számát + leírását! Ctr C - Ctrl V innen... + (ahol programozási tételt használtok a megoldáshoz () -ben nevezzétek meg, melyiket!) 
Mindenki meg tudja indokolni, mit miért csinált!
Jó munkát!
*/
package keresztmetszet;

import java.util.Scanner;

/**
 *
 * @author vagne
 */
public class Keresztmetszet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("\n KERESZTMETSZET\n");
        System.out.println(" VDZ 113C\n");
        
        Scanner bemenet = new Scanner(System.in);
        char valasz;
        do{
            
            //2.feladat
            int darabszam = (int) (Math.random() * 6 + 5);
        
        //1.feladat
        int[] szamtomb1 = new int[darabszam];
        int[] szamtomb2 = new int[darabszam];
        int[] szamtomb3 = new int[darabszam];
        int osszeg1=0;
        int osszeg2=0;
        int osszeg3=0;
        int sorOsszeg=0;
        
        //3.feladat
        for (int i = 0; i < darabszam; i++) {
        szamtomb1[i] = (int) (Math.random() * 200) + -100;
        osszeg1=osszeg1+szamtomb1[i];
        szamtomb2[i] = (int) (Math.random() * 200) + -100;
        osszeg2=osszeg2+szamtomb2[i];
        szamtomb3[i] = (int) (Math.random() * 200) + -100;
        osszeg3=osszeg3+szamtomb3[i];
        }
        
        //4.feladat
        System.out.println("\nA szamok1 tömb elemei: ");
        for (int i = 0; i < szamtomb1.length; i++) {
            System.out.print(String.format("%,4d", szamtomb1[i]) + " ");
        }
        System.out.println("\nA szamok2 tömb elemei: ");
        for (int i = 0; i < szamtomb2.length; i++) {
            System.out.print(String.format("%,4d", szamtomb2[i]) + " ");
        }
        System.out.println("\nA szamok3 tömb elemei: ");
        for (int i = 0; i < szamtomb3.length; i++) {
            System.out.print(String.format("%,4d", szamtomb3[i]) + " ");
        }
            
            System.out.println("\n ");
         
        //5.feladat    
        for (int i = 0; i < darabszam; i++) {
            sorOsszeg = szamtomb1[i]+szamtomb2[i]+szamtomb3[i];
            System.out.print((i+1) + ". számok: " + (String.format("%,3d", szamtomb1[i])+" + "));
            System.out.print(String.format("%,3d", szamtomb2[i])+" + ");
            System.out.print(String.format("%,3d", szamtomb3[i])+" = ");
            System.out.println(String.format("%,5d",sorOsszeg));
        }
        System.out.println("\n ");
        
        //  6.feladat
        int index=2;
        System.out.println("Legkisebb számok:");
        for (int i = 0; i <=darabszam; i++) {
            if(index>darabszam || index>darabszam-1  ){break;}
            else if (szamtomb1[index]<szamtomb2[index] && szamtomb1[index]<szamtomb3[index]){
              System.out.println(String.format("Legkisebb:"+szamtomb1[index])+" ("+index+".)");
              index+=2;
            }
            else if (szamtomb2[index]<szamtomb1[index] && szamtomb2[index]<szamtomb3[index]){
               System.out.println(String.format("Legkisebb:"+szamtomb2[index])+" ("+index+".)");
               index+=2;
            }
            else if (szamtomb3[index]<szamtomb1[index] && szamtomb3[index]<szamtomb2[index]){
               System.out.println(String.format("Legkisebb:"+szamtomb3[index])+" ("+index+".)");
               index+=2;
            }

        }
            //7.feladat
            int [] teljes=new int [darabszam*3]; 
            int teljesTomb = 0;
          
            
            for (int i = 0; i < darabszam; i++) {
               teljes[teljesTomb++] += szamtomb1[i];
               teljes[teljesTomb++] += szamtomb2[i];
               teljes[teljesTomb++] += szamtomb3[i];
            }
            for (int i = 0; i < teljesTomb-1; i++) {
                for (int j = 0; j <teljesTomb-i-1 ; j++) {
                     if (teljes[j]>teljes[j+1]){
                         int csere=teljes[j]; 
                         teljes[j]=teljes[j+1];
                         teljes[j+1]=csere;
                 }           
            }
        }
            System.out.println("\nA teljesTomb elemei:");  
            for (int i = 0; i < teljesTomb; i++) {
               System.out.print(String.format("%,4d", teljes[i]) + " ");

      }
            
            //8.feladat
            System.out.println("\n");
            System.out.println("Több is szerepel belőlük a teljes tömbben:");
            
            int len=-1;                                              
            int ho=0;                                              
            for (int j = 0; j < teljesTomb-1 ; j++) {
                if (teljes[j]==teljes[j+1]){
                     len+=1;   
                     ho+=1;
                     int tobb [] =new int[ho];
                     tobb[len]+=teljes[j];
                     System.out.println(tobb[len]+" ");
                 }
                     }
            if (len==-1){System.out.println("Nincs ilyen szam!");} 
        
    //9.feladat
    System.out.println("\n ");    
    System.out.println("\nÚjra lefuttatja a programot? i/n: ");
    valasz = bemenet.next().charAt(0);
    } while ((valasz == 'i') || (valasz == 'I'));
   }
    
}
