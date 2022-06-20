import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//To Read File java provides Scanner class
// hasNextLine()- Boolean -True false
//nextLine()- it reads the file line by line.
public class ReadFile {
    public static void main(String[] args) {


        try {
            File file=new File("F:\\VeryImp\\CollectionExample\\NewFile.txt");
            Scanner scanner=new Scanner(file);
            while (scanner.hasNextLine()){
                String str=scanner.nextLine();
                System.out.println(str);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Exception Occured");
            e.printStackTrace();
        }
    }
}
