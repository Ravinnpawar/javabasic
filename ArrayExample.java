//Array Example
//array is data type where we store the data list format or table format. Data should be similar type of data
//we have give size of array at intialization. without initialization we cannot add values in array.
//It is Index baesd- 0 is first index in array.
//Benefits--Code Optimization, Random access.
public class ArrayExample {
    public static void main(String[] args) {
        System.out.println("Array Example");

        int[] arr =new int[10];
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        arr[3]=4;
        arr[4]=5;
        arr[5]=6;
        arr[6]=7;
        arr[7]=8;
        arr[8]=9;
        arr[9]=10;

        //System.out.println("Element value is: "+arr[11]);
        for (int i = 0; i < arr.length-1; i++) {

            System.out.println(arr[i]);
        }

    }
}
