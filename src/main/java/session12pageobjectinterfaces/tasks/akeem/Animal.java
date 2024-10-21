package session12pageobjectinterfaces.tasks.akeem;

public class Animal implements IAnimal {
    @Override
    public String getSound() {
        return "Animal noise";
    }

    public static class Dog extends Animal {
        @Override
        public String getSound() {
            return "Woof";
        }

    }

    public static class Cat extends Animal {
        @Override
        public String getSound() {
            return "Meow";
        }
    }
}
