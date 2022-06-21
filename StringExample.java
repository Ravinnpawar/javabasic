/*String is class in java-
        It is non-premitive Data Type
        it is sequence of chars.
        It is immuatble in nature-  we cannot modify the value of initialized variable.
        Methods provided by String Class
        compare()
        equals()
        split()
        length()
        replace()
        replaceAll()
        compareTo()
        substring()
        String-- It implements three interfaces
        Serializable
        Comparable
        Charsequence

        String str1= "Hello";- this value is going to store in string lateral Constant pool.
        String str2="Hello"; - it will first if the value is present in String Constant pool or not. if value is present then it is going to return the
        address of that value.
        String str3=new String("Hello");- It is going create new object.

        StringBuffer And StringBuilder- These are Mutable in nature. -We can change the value of the variables.

        StringBuffer- Synchronized- Thread Safe.
        Introduced in
        StringBuilder- Non- Synchronized.- No Thread Safe.
*/

public class StringExample {
    public static void main(String[] args) {
        String string="Hello";
        String string1="Hello";

        String string2=new String("Hello");

        System.out.println("String Lenght: "+string2.length());
        if(string==string1){
            System.out.println("Memory Address compared and both are same");
        }
        if (string.equals(string1)){
            System.out.println("Values compared");
        }
        System.out.println("Substring Used: "+string.substring(1));

        String s[]=string.split("e");
        System.out.println("Splitted Sting at 1st position: "+s[0]);
    }
}
