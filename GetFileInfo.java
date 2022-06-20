import java.io.File;

//To get file information java provides methods like.
//.exists()- it returns Boolean- true or false
//.getName()- name of the file
//.getAbsolute()- String of the file path
//.canWrite()-it returns Boolean- true or false
//canRead()- it returns Boolean- true or false
//.length()- To get the file size in bytes.
public class GetFileInfo {
    public static void main(String[] args) {
        File file=new File("F:\\VeryImp\\CollectionExample\\NewFile.txt");
        if (file.exists()){

            System.out.println("File Name: "+file.getName());
            System.out.println("File Path: "+file.getAbsolutePath());
            System.out.println("Readable? : "+file.canRead());
            System.out.println("Writable? : "+file.canWrite());
            System.out.println("File Size? : "+file.length());
        }
    }
}
