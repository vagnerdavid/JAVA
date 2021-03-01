
package poliformizmus;


public class Cat extends Animal implements Pet {
    
    public Cat(){
        this.setName("Dani");

    }
    public Cat(String name){
    this.setName(name);

    }
    public Cat(String name, int weight){
    this.setName(name);
    this.setWeight(weight);

    }
    
    @Override
    public void makeSound(){
        System.out.println("Meow");
    }

    @Override
    public void cuddle() {
        System.out.println("Cuddle");
    }

    @Override
    public void sit() {
        
    }

    @Override
    public void layDown() {
        
    }
}
