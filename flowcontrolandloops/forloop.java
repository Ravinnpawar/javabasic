package flowcontrolandloops;

//Loops provided to execute the tasks repeatadely
//For Loop
//While Loop
//Do While Loop

/*syntax
* * for(init;condition;increment/decrement){
*   //Statements to be executed repeatadely.
* }
*
* while(condition){
*   //Statements to be executed
*   //increment or decrement
* }
* */

public class forloop {
    public static void main(String[] args) {

        //For Loop Example
        for (int i=1;i<=10;i++){
            int temp=2*i;
            System.out.println(temp);
        }

        //While Loop
        System.out.println("2's Table using While Loop\n");
        int i=1;
        while(i<=10){
            int temp=2*i;
            System.out.println(temp);
            i++;
        }

        //Do While Loop
        int j=1;
        System.out.println("2's Table using Do While Loop\n");
        do{
            int temp=2*j;
            System.out.println(temp);
            j++;
        }while (j<=10);

    }
}
