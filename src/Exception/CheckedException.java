package Exception;

import java.io.FileReader;
import java.io.IOException;

public class CheckedException {
    public static void main(String[] args) {
        try{
            FileReader reader = new FileReader("nonexitentfile.txt");
        }catch (IOException e){
            System.out.println("File not found "+e.getMessage());
        }
    }
}
