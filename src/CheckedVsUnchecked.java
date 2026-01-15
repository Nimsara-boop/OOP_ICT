import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckedVsUnchecked{

    public static void main(String[] args) throws FileNotFoundException {
        try{
        readFile("myFile.txt");
        anotherReadFile("anotherMyFile.txt");
        System.out.println("Main method finished executing");}
        catch(FileNotFoundException e){
            System.out.println("anotherReader exception caught");
        }
    }

    private static void readFile(String fileName){
        FileReader reader= null;
        try{
           reader = new FileReader(fileName);
        }
        catch(FileNotFoundException fnfe){
            System.out.println("Hey, that file does not exist");
        }
        finally{
            if (reader!=null){
                try
                {reader.close();
                    System.out.println(" reader exists and readFile method finished executing");}
                catch (IOException e){
                   System.out.println("Failed to close file");
                }
            }
            else{
                System.out.println("reader DOES NOT exists and readFile method finished executing");
            }
        }
    }

    private static void anotherReadFile(String fileName) throws FileNotFoundException{
        FileReader reader = null;
        try{
            reader = new FileReader(fileName);
        }

        finally{
            if (reader!=null){
                try{
                reader.close();
                System.out.println("Closing reader. method finished executing");}
                catch(IOException e){
                    System.out.println("IOException caught. reader successfully closed.");
                }
            }
            System.out.println("anotherReader did not open or execute properly. anotherReadFile method finished executing");
        }
    }
}

