package encapsulation;

public class Employee {
    private String name;
    private int age;

    public Employee(String name2, int age){
        this(name2);
        this.age = age;
    }

    public Employee(String name){
        this.name = name;
    }

    public void setName(String name){
        this.name =  name;
    }

    public void setAge(int age) throws Exception{
        if(age<=0 || age >100){
            throw new InvalidAgeException("Age isn't right.");
        }
        this.age = age;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

}
