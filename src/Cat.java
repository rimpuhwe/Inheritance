public class Cat extends Animal {
    Cat(String animal, String voice) {
        super(animal, voice);
    }

    @Override
    public void makeSound(){
        System.out.println(animal +" does say : "+ voice);
    }
}
