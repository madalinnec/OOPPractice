package inheritance;

public interface Mammal{

    boolean hasFur();

    default void hasBabies(){
        System.out.println("test");
    }

}
