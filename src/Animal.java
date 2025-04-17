public class Animal {
    String animal;
    String voice;
    Animal(String animal , String voice){
        this.animal = animal;
        this.voice = voice;
    }
    public  void makeSound(){
        System.out.println(animal +" says: "+ voice);
    }

}
