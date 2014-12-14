package org.ansimar.ejemplos.refactoring.extracttointerface;

/**
 * Created by angel on 14/12/14.
 */
public class AnimalsDoingSomethingBadSmell {

    /*
    * args: d(Dog), c(Cat), h(Horse)
    * */
    public static void main(String[] args){
        Character arg = args[0].toCharArray()[0];
        Object animal = null;

        switch (arg){
            case 'd':
                System.out.println(Dog.bark());
                break;
            case 'c':
                System.out.println(Cat.miaow());
                break;
            case 'h':
                System.out.println(Horse.neigh());
                break;
            default:
                System.out.println(Dog.bark());
        }

        switch (arg){
            case 'd':
                System.out.println(Dog.numberOfLegs());
                break;
            case 'c':
                System.out.println(Cat.numberOfLegs());
                break;
            case 'h':
                System.out.println(Horse.numberOfLegs());
                break;
            default:
                System.out.println(Dog.numberOfLegs());
        }
    }
    public static class Dog{

        public static String bark(){
            return "Guau Guau!!";
        }

        public static int numberOfLegs(){
            return 4;
        }
    }

    public static class Cat{

        public static String miaow(){
            return "Miau Miau!!";
        }

        public static int numberOfLegs(){
            return 4;
        }
    }

    public static class Horse{

        public static String neigh(){
            return "Hiii Hiii!!";
        }

        public static int numberOfLegs(){
            return 4;
        }
    }
}
