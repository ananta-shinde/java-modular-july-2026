package IOdemos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.imageio.IIOException;

public class FileHandlingDemo {

    // reading file byte byte and printng it
    public void readFileAndPrintToConsole() throws IOException,FileNotFoundException{
         File myFile = new File("demo.txt");
            if(!myFile.exists()){
                myFile.createNewFile();
            }
            FileInputStream input = new FileInputStream(myFile);
            int data;
            while((data = input.read()) != -1)
            {
                System.out.println((char)data);
            }
    }

    // copying content from one file to another byte by byte
    public void copyFiles() throws IOException,FileNotFoundException{
           File sourceFile = new File("demo.txt");
            if(!sourceFile.exists()){
               return;
            }else{
                File targetFile = new File("copyfile.txt");
                if(!targetFile.exists()){
                    targetFile.createNewFile();
                }
                FileInputStream input = new FileInputStream(sourceFile);
                FileOutputStream output = new FileOutputStream(targetFile);
                int data;
                while((data = input.read()) != -1){
                         output.write(data);
                }
                System.out.println("file copied successfully");

            }
           
    }

    public static void main(String[] args) {
        FileHandlingDemo app = new FileHandlingDemo();
        try{
           
            app.copyFiles();
        }
        catch(FileNotFoundException e){
              System.out.println("file not found or is not readable");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            System.out.println("error in creating file");
        }
       
    }
    
}
