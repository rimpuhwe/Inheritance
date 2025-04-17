public class Main {
    public static  void main(String[] args){
        Bird bird = new Bird("Dove", "coo-roo-coo");
        bird.makeSound();
        bird.fly();
        Dog dog = new Dog("puppy" , "woof");
        dog.makeSound();
        dog.run();
    }

}
