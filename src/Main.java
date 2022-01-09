import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

public class Main {
    public static final String pi = "3,14";
    public static String s1;
    public static void main(String[] args) {
//        productOfTwoNumbers();
//        multipleCalculations();
//        multiplicationTable();
//        showAPattern();
//        specifiedExpressionComputeIt();
//        circleAreaAndPerimeter();
//        averageOfThreeNumbers();
    playWithDatesAndTimes();
    boolean b = pi.equals(s1);
    }

    static void playWithDatesAndTimes(){
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());
    }

    static void averageOfThreeNumbers() {
        System.out.println("Type in the 3 numbers: ");
        Scanner sc = new Scanner(System.in);
        double[] numbers = new double[3];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("The number on position " + i + " is " + (numbers[i] = sc.nextDouble()));
        }
        double total = 0;
        for (int i = 0; i < numbers.length; i++) {
            total += numbers[i];
        }
        System.out.println("The average is " + (total / numbers.length));

    }

    static void circleAreaAndPerimeter() {
        System.out.println("Type in circle radius: ");
        Scanner sc = new Scanner(System.in);
        double rad = sc.nextDouble();
        System.out.println("Perimeter is: " + (2 * Math.PI * rad));
        System.out.println("Area is :" + (Math.PI * rad * rad));
    }

    static void specifiedExpressionComputeIt() {
        //double a = ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));
        System.out.println((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));
    }

    static void showAPattern() {
        System.out.println("   J    a   v     v  a   ");
        System.out.println("   J   a a   v   v  a a  ");
        System.out.println("J  J  aaaaa   V V  aaaaa ");
        System.out.println(" JJ  a     a   V  a     a");
    }

    static void multiplicationTable() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Show multiplication table for: ");
        int a = sc.nextInt();
        int i = 0;
        do {
            System.out.println(a + " multiplied by " + i + " is " + (a * i));
            i++;
        } while (i <= 10);
    }

    static void multipleCalculations() {
        Scanner sc = new Scanner(System.in);
        System.out.print("1st value: ");
        int a = sc.nextInt();
        System.out.print("2nd value: ");
        int b = sc.nextInt();
        System.out.println("Sum is: " + (a + b));
        System.out.println("Substraction is: " + (a - b));
        System.out.println("Multiplication is: " + a * b);
        System.out.println("Division is: " + (a / b));
        System.out.println("The remainder is: " + (a % b));

    }

    static void productOfTwoNumbers() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input first value: ");
        int a = sc.nextInt();
        System.out.print("Input 2nd value: ");
        int b = sc.nextInt();
        System.out.println("Product is: " + (a * b));
    }

}
