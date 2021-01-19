/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;
import java.util.Scanner;
/**
 *
 * @author vagne
 */
public class Menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Menü VDZ");
        
        Scanner sc;
        sc = new Scanner(System.in);
        
        int szamok[] = new int [20];
        for(int i =0;i<20;i++){
            szamok[i] = (int) (Math.random()*100)-50;
        }
        for(int i =0;i<20;i++){
            System.out.print(szamok[i]+" ");
        }
        System.out.println("\nIrj egy számot mi szeretnél");
        System.out.println("1 - összeget számoltatni: tömbök összegét kiíratni");
        System.out.println("2 - szélsőértékeket kiíratni: legkisebb és legnagyobb értéket kiíratni");
        System.out.println("3 - van-e benne 40-50: megtudni, tartalmaz-e számot 40 és 50 között?");
        System.out.println("4 - 5-tel osztható páros számok db-száma: mennyi?");
        System.out.println("5 - adott számot tartalmazza-e");
        
        int var = sc.nextInt();
        switch (var)
            {
                case 1:
                    //code
                    int sum=0;
                    for(int i =0;i<20;i++){
                        sum += szamok[i];
                    }
                    System.out.println(sum);
                    break;
                case 2:
                    //code
                    int max =0;
                    int min = 51;
                    for(int i =0;i<20;i++){
                        if (min>szamok[i]){
                            min = szamok[i];
                        }
                        else{
                            max = szamok[i];
                        }
                                     
                    }
                    System.out.println("a maximum: "+max+" a minimum: "+min);
                    break;
                case 3:
                    //code
                    int vane = 0;
                    for(int i =0;i<20;i++){
                        if(szamok[i]>=40){
                            vane = 1;
                            break;
                        }
                    }
                    if(vane==1){
                        System.out.println("Tartalmaz");
                    }
                    else{
                        System.out.println("Nem tartalmaz");
                    }
                    break;
                case 4:
                    int db = 0;
                    for(int i =0;i<20;i++){
                        if(szamok[i]%5==0){
                            db++;
                        }
                    }
                    if(db!=0){
                        System.out.println("Tartalmaz 5 tel oszthatót, ennyit: "+db);
                    }
                    else{
                        System.out.println("Nem tartalmaz 5 tel oszthatót");
                    }
                    break;
                    //code
                case 5:
                    System.out.println("Add meg a számot amire kiváncsi vagy: ");
                    int szam = sc.nextInt();
                    int tart = 0;
                    for(int i =0;i<20;i++){
                        if(szam==szamok[i]){
                            tart++;
                            break;
                        }
                    }
                    if(tart!=0){
                        System.out.println("Tartalmaz");
                    }
                    else{
                        System.out.println("Nem tartalmaz");
                    }
                    break;
            }
        
    }
     
     
     
     
        
    }