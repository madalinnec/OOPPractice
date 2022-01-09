package inheritance;

public class Dog extends Animal implements Mammal {

    private String s;

    public Dog(boolean isMammal, String name, String s) {
        super(isMammal, name);
        this.s = s;
    }

    Object object = new Object();

    public void setS() {
        this.s = super.getName();
    }

    public static void isAlive(){
        System.out.println("Animal is alive");
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
        System.out.println("Dog eats.");
    }

    @Override
    public boolean hasFur() {
        return false;
    }

    @Override
    public Cat returnAnimal(){
        return null;
    }

}