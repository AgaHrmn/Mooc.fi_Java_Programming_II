
public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeNoise();
        dog.eat();

        Dog fido = new Dog("Fido");
        fido.makeNoise();

        Cat cat = new Cat();
        cat.makeNoise();
        cat.eat();

        Cat garfield = new Cat("Garfield");
        garfield.makeNoise();

    }

}
