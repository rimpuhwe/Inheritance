public class Dog extends  Animal{
    Dog(String animal ,String sound) {
        super(animal , sound);
    }
    public void run(){
        System.out.println(animal + " goes: running");
    }
}
