package exceptions;

public class Math {
    public static int divideNumbers(int a, int b) throws Exception{
        try {
            return a / b;
        }catch(ArithmeticException e) {
            throw new Exception("Gata");
        }finally{
            System.out.println("Finally ran");
        }
    }
}
