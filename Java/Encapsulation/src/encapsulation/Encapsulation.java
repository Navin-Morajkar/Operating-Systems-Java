/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulation;

/**
 *
 * @author user
 */
class Dog
{
    String name;
    float age;
    String color;
    
    void getInfo(String name, float age, String color){
         System.out.println("Name:"+name);
         System.out.println("Age:"+age);
         System.out.println("Color:"+color);
    }
}
public class Encapsulation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Dog R = new Dog();
        R.getInfo("Rocky", 5.0f, "Cream");
    }
    
}
