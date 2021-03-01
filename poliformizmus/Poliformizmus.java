
package poliformizmus;


public class Poliformizmus {


    public static void main(String[] args) {
        Cat macska = new Cat("Jakab",5);
        Cat macska2 = new Cat();
        
        System.out.println(macska.equals(macska2));
        System.out.println(macska == macska2);
        
        macska.makeSound();
        
        macska.cuddle();
        
        
        System.out.println(macska.getName()+ " "+ macska.getWeight()+" kg");
    }
    
}
