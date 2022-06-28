package basicexamples;
//Class is a logical entity- as it is a group entities or objects, it is having instructions for system, calculation and for data.
//syntax- class <classname>{
    //statements to be executed or instructions.
// }
//Object-it is a real time entity which is having identity, behavior, state.
//We can create a object using new keyword .
//Object is java base class. it contains methods- hashcode(), finalize(), tostring() notify(), wait()
public class ClassExamples {
    public static void main(String[] args) {
        Student student=new Student();
        System.out.println("Hello World: " +student.getName());
    }


}
