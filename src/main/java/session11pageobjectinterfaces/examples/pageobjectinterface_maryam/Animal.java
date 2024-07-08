package session11pageobjectinterfaces.examples.pageobjectinterface_maryam;
// top level animal class
public class Animal {


    interface IAnimal {
        String getSound ();
    }

    public void activeAnimal(){

        IAnimal dog = new Dog();
        IAnimal cat = new Cat();
        IAnimal cow = new Cow();


        System.out.println("Dog Sound" + " " + dog.getSound());
        System.out.println("Cat Sound" + " " + cat.getSound());
        System.out.println("Cow Sound" + " " + cow.getSound());



    }
    private static class Dog implements IAnimal {

        @Override
        public String getSound() {
            return "Woof";
        }
    }

    private static class Cat implements IAnimal{
        @Override
        public String getSound() {
            return "Meaow";
        }

        }
    private static class Cow implements IAnimal {

        @Override
        public String getSound() {
            return "Moo";
        }

    }

    }







