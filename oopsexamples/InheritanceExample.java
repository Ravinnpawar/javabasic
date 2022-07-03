package oopsexamples;

//OOps Concepts -
//Inheritance, Polymorphism, Encapsulation, Abstraction.
//Inheritance- there is relation between two classes- Parent And Child.
//Child class (subclass) can access all the properties(variables) and behavious(functions or methods) of the parent class(Super class)
//code reusability is achieved.
//extends keyword is used to extend the parent class.

//Child Class
public class InheritanceExample extends Parent {
    public static void main(String[] args) {
        InheritanceExample inheritanceExample=new InheritanceExample();
        System.out.println("This name is printed from PArent class: "+inheritanceExample.name);

        inheritanceExample.job();
    }
}
//Parent Class
class Parent{
    //PArent class property
    String name="Aniket";

    //parent class behaviour
    void job(){
        System.out.println("Parent is doing property dealing business");
    }

}
