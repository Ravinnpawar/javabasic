package batch2Examples;
//Method is block of code(Instructions) which is executed once we call them.
//We can pass the data to method or return the data.
//Methods are used to perform certain actions which is called as methods or functions.
public class MethodsExample {
    public static void main(String[] args) {

        System.out.println(method1());

        System.out.println("Value is printed outside the method where it is called: "+method());
        methods();

    }

    private static void methods() {
        System.out.println("Non Parameter method is called..");
    }

    private static int method() {
        int i1= 10 *10;
        System.out.println("Value is printed inside the Method: "+i1);
        return i1;
    }

    private static int method1() {
        return 2 + 3;
    }
}
