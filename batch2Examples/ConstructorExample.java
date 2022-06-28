package batch2Examples;

//it is block of code which is similar to the method.
//It is used to initialize the variables from the class when we create object of that class.
public class ConstructorExample {
    public static void main(String[] args) {

        ConstructClass constructClass=new ConstructClass(33,"Ravindra");
        System.out.println("Age: "+constructClass.age+" Name: "+constructClass.name);
    }
}
