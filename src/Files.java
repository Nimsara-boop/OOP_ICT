import java.io.File;
import java.io.IOException;

public class Files {
    public static void main(String[] args) {
        File myDirectory = new File("src/thirdDirectory");
        System.out.println(myDirectory.mkdir());

        File myFile = new File("src/thirdDirectory/myFile");
        try{
        System.out.println(myFile.createNewFile());}
        catch (IOException e){
            System.out.println("File already exists");
        }
    }
}
