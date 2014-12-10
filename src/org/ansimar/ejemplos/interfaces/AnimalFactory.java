package org.ansimar.ejemplos.interfaces;

/**
 * Created by angel on 10/12/14.
 */
public class AnimalFactory {

    private  static void speak(Animal animal){
        System.out.println(animal.saySomething());
    }

    public static void main (String[] args){
        speak(new Dog());
        speak(new Cat());
    }
}
