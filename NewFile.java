//File- File is class in java.

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;

public class NewFile {
    public static void main(String[] args) {

        try {
            File file=new File("F:\\VeryImp\\CollectionExample\\NewFile.txt");
            //file.creatNewFile()- If it returns true then file is created else file is already exist.
          if (file.createNewFile()){
              System.out.println("New File Created: "+file.getName());
          }else {
              System.out.println("File is already exist");
          }
        } catch (IOException e) {
            System.out.println("Exception Occured");
            e.printStackTrace();
        }
    }
}
