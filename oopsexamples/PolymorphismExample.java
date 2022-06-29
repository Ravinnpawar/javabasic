package oopsexamples;
//Polymorphism- It is many forms of object-
//There are two types of polymorphism-
// 1 -Method overloading(Compile time polymorphimsm- It means we are creating two methods with
// same name but parameters or parameter types are different .
// 2- Method Overriding(Runtime Polymorhism).
public class PolymorphismExample {
    public static void main(String[] args) {
        //Calling methods names are same.
        add(1,2);
        add(1,2,3);
        add(1,3.5);
        add(3,2);
        add(4,2);
        add(1,6);
        add(7,2);

    }

    private static void add(int i, int i1, int i2) {
        System.out.println(+i+i1+i2);
    }
    private static void add(int i, double v) {
        System.out.println(i+v);
    }
    private static void add(int i, int v) {
        System.out.println(i+v);
    }
}
