package flowcontrolandloops;

//Flow Control Statements and Loops
//Flow Control- If condition, If Else, Switch
//Java program execution flow is Top to Bottom.
public class FlowControl {
    public static void main(String[] args) {
        int i=11;
        if (i>10){
            //This code will be executed if i is greater than 10 means TRUE
            System.out.println("Value is Greater than 10");
            //Inner Flow Control Statement- IF else statement.
            if (i>10){
                //This code will be executed if i is greater than 10 means TRUE
                System.out.println("Value is Greater than 10");
            }else if(i==10){
                //This code will be executed if i is greater than 10 means False.
                System.out.println("Value is same");
            }
        }else if(i==10){
            //This code will be executed if i is greater than 10 means False.
            System.out.println("Value is same");
        }

        //Switch is used when we have to perform multiple conditions on same data type.
        /*
        switch(var){
            case val1:
                //Statement to be executed
                //break;
            case val2:
                //Statement to be executed
                //break;

        }
        * */
        int num=50;

        switch (num){
            case 10:
                System.out.println("10");
                break;
            case 20:
                System.out.println("20");
                break;
            case 30:
                System.out.println("30");
                break;
            default:
                System.out.println("Default");
                break;
        }

    }
}

