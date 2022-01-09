package inheritance;

public class Cat extends Animal{

    public Cat(boolean isMammal, String name) {
        super(isMammal, name);
    }

    @Override
    public void sleep(int hours) {

    }

    @Override
    public boolean isDead() {
        return false;
    }

    @Override
    public void eat(){
        System.out.println("Cat eats.");
    }

}
