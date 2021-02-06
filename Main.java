import java.util.Stack;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;


public class Main {  
  public static void main(String[] args) {
    ReadFile rf = new ReadFile();
    String input = rf.convertToString();
    System.out.println("Postfix ingresado:");
    System.out.println(input); 
    

    Calculadora cal = new Calculadora();
    System.out.println(cal.resolver(input));// para la resolucion
    
  }  
} 
