package debugger;

public class EclipseDebuggingExample {
    public int add(int a, int b) {
        int result = a + b;
        return result;
    }

    public static void main(String[] args) {
        EclipseDebuggingExample ede = new EclipseDebuggingExample();
        int a = 3;
        int b = 7;
        int result = ede.add(a, b);
        System.out.printf("result of adding a and b is:  "+result);
    }
}