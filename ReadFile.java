import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text filesimport java.util.Scanner;

public class ReadFile {
  private String data;

  public ReadFile(){
    data="";
  }

  public String convertToString(){
    try {
      File myObj = new File("data.txt");
      Scanner scan = new Scanner(myObj);
      while (scan.hasNextLine()){
        data = scan.nextLine();
      }
      scan.close();
    } catch(FileNotFoundException e){
      data= "Ha ocurrido un error.";
      e.printStackTrace();
    }
    return data;
  }
}