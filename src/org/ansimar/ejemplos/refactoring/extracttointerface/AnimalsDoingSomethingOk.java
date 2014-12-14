package org.ansimar.ejemplos.refactoring.extracttointerface;

/**
 * Created by angel on 14/12/14.
 */
public class AnimalsDoingSomethingOk {

    /*
     * args: d(Dog), c(Cat), h(Horse)
     * */
    public static void main(String[] args){
        Character arg = args[0].toCharArray()[0];
        Animal animal = AnimalFactory.create(arg);

        System.out.println(animal.saySomething());
        System.out.println(animal.numberOfLegs());
    }

    public interface Animal{
        String saySomething();
        int numberOfLegs();
    }

    public static class Dog implements Animal{

        @Override
        public String saySomething() {
            return "Guau Guau!!";
        }
        @Override
        public int numberOfLegs(){
            return 4;
        }
    }

    public static class Cat implements Animal{

        @Override
        public String saySomething() {
            return "Miau Miau!!";
        }
        @Override
        public int numberOfLegs(){
            return 4;
        }
    }

    public static class Horse implements Animal{

        @Override
        public String saySomething() {
            return "Hiii Hiii!!";
        }
        @Override
        public int numberOfLegs(){
            return 4;
        }
    }

    public static class AnimalFactory{
        public static Animal create(char a){
            switch (a){
                case 'd':
                    return new Dog();
                case 'c':
                    return new Cat();
                case 'h':
                    return new Horse();
                default:
                    return new Dog();
            }
        }
    }
}
