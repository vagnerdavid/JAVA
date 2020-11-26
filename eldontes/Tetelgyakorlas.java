
package tetelgyakorlas;


public class Tetelgyakorlas {


    public static void main(String[] args) {
        
        int szam = (int) (Math.random()*10)+10;
        int tombNegativ[] = new int[szam*2];
        int k = 0;
        boolean szerepelE1 = false;
        boolean szerepelE2 = false;
        int tomb1[] = new int[szam];
        int tomb2[] = new int[szam];
        for(int i =0;i<szam;i++){
            tomb1[i] = (int) (Math.random()*200)-100;
            tomb2[i] = (int) (Math.random()*200)-100;
            if(tomb1[i]<0){
                tombNegativ[k] = tomb1[i];
                k++;
            }
            if(tomb2[i]<0){
                tombNegativ[k] = tomb2[i];
                k++;
            }
            if(tomb1[i] == 0){
                szerepelE1 = true;
            }
            if(tomb2[i] == 0){
                szerepelE2 = true;
            }
           
        }
        for(int i =0;i<szam;i++){            
            System.out.print(String.format("%,3d",tomb1[i])+" ");
        }
        System.out.println("");
        for(int i =0;i<szam;i++){            
            System.out.print(String.format("%,3d",tomb2[i])+" ");
        }
        System.out.println("");
        int osszegNeg= 0;
        boolean venEOttelOsztho = false;
        for(int i =0;i<k;i++){
            osszegNeg+=tombNegativ[i];
            System.out.print(String.format("%,3d",tombNegativ[i])+" ");
            if(tombNegativ[i]%5 == 0){
                venEOttelOsztho = true;
            }
        }
        System.out.println("\nEnnyi negatív szám volt: "+k);
        System.out.println("Ennyi a negativ tömb elemeinek az összege: "+osszegNeg);
        System.out.println("Ennyi a negativ tömb elemeinek az átlaga: "+(double)osszegNeg/k);
        if(szerepelE1 == true){
            System.out.println("Az első tömben szerepel nulla");
        }
        if(szerepelE2 == true){
            System.out.println("Az második tömben szerepel nulla");
        }
        if(venEOttelOsztho == true){
            System.out.println("Van benne 5-el osztató");
        }
        else{
            System.out.println("Nincs benne 5-el osztató");
        }
    }
    
}