package batch2Examples;

public class ConstructClass {
    int age;
    String name;
    ConstructClass(){
    //Inside the constructor
        System.out.println("Constructor is created/Called");
    }

    public ConstructClass(int age, String name) {
        this.age=age;
        this.name=name;
    }

}
