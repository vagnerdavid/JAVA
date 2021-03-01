/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poliformizmus;

/**
 *
 * @author vagne
 */
public abstract class Animal {
    private String name;
    private int weight;
    
    protected void makeSound(){
        System.out.println("AAAAA");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
