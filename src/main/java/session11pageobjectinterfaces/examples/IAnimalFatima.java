package session11pageobjectinterfaces.examples;

interface IAnimalFatima {
    void getSound();
}

class Animal implements IAnimalFatima {


    @Override
    public void getSound() {
        System.out.println("Animal makes a noise");
    }
}

class Cat extends Animal{
    @Override
    public void getSound() {
        System.out.println("Meow");
    }
}

class Dog extends Animal{
    @Override
    public void getSound() {
        System.out.println("Woof");
    }
}