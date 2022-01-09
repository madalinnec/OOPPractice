package inheritance;

public abstract class Animal {
    private String name;// variabila de instanta - fieldurile obiectului
    private int age;// variabila de instanta
    private boolean isMammal;// variabila de instanta
    public static String species; //variabila de clasa/static - valoarea se modifica peste tot

    public Animal(boolean isMammal, String name) {
    }


    public abstract void sleep(int hours);

    abstract boolean isDead();

    public Animal returnAnimal(){
        return null;
    }


    public static void isAlive(){
        System.out.println("Animal is alive");
    }

    void eat(){
        String food = "animal food"; //variabila locala
        System.out.println("Animal eats.");
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public void setIsMammal(boolean isMammal){
        this.isMammal = isMammal;
    }

    public boolean IsMammal(){
        return this.isMammal;
    }
}

