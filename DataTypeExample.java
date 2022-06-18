//Data Types- 
//Primitive-- byte, short, long, int, float, double, char and boolean.
//Non primitive- String, Array, User Defined Classes.
//Data types define size and value a variable can hold
//variable- to hold the data - Three types- Local, Global/Instance and static. 
//Local- it is inside method 
//instance or global- outside and inside the class.
//static- it is common property
//variable syntax- type variableName= value; naming convention- first letter should be small and if additional keywords then it should be capital.
public class DataTypeExample {
	static float  fNumber=10.5f;
public static void main(String[] args) {
	int number=10;
	String className="Success Key";
	System.out.println("Local Variable is used: "+number);
	System.out.println("Instance Variable is used: "+fNumber);
	System.out.println("String Local Variable is used: "+className);
	
}
}
