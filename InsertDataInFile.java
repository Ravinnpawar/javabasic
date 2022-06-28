import java.io.FileWriter;
import java.io.IOException;

//Insert Data into File
//FileWriter class is provided to insert data.
//.write and .close
public class InsertDataInFile {
    public static void main(String[] args) {

        try {
            FileWriter fileWriter=new FileWriter("F:\\VeryImp\\CollectionExample\\NewFile.txt");

            //write method is used to write the data into file.
            fileWriter.write("Insert Data File is created and inserted data into file Date- 20/06/2022");
            fileWriter.close();//This method is used to close the file
            System.out.println("Data inserted successfully.");
        } catch (IOException e) {
            System.out.println("Exception Occured");
            e.printStackTrace();
        }

    }
}
