package inheritance;

public class MainInheritance {
    public static void main(String[] args) {
        Dog dog = new Dog(true,"Sasa","E catel");
        dog.setName("Sasa");
        dog.eat();
/*        Animal dog1 = new Dog();
        dog1.sleep(5);
        Animal animal = new Dog();*/
        Animal.isAlive();

        dog.isAlive();

        Mammal mammal = new Mammal() {
            @Override
            public boolean hasFur() {
                return false;
            }
        };
    }
}
