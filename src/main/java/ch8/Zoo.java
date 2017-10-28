package ch8;

public class Zoo {

    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println("Dog cry");
        dog.cry();
        Cat cat = new Cat();
        System.out.println("Cat cry");
        cat.cry();
        Sheep sheep = new Sheep();
        System.out.println("Sheep cry");
        sheep.cry();
    }
}
