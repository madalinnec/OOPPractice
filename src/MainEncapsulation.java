import encapsulation.Employee;

public class MainEncapsulation {
    public static void main(String[] args) throws Exception{
        Employee employee1 = new Employee("Madalin", 27);
        //String name = "Madalin";
        //employee1.setName(name);
        employee1.setName("Madalin");
        employee1.setAge(27);
        System.out.println(employee1.getName() + " " + employee1.getAge());
    }
}
