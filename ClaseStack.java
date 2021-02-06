/*Implementar la clase stack*/

import java.util.Stack;
import java.util.EmptyStackException;
import java.util.Scanner;

public class ClaseStack {
  public ClaseStack (){
    Scanner scan = new Scanner(System.in);
    Stack<String> pila = new Stack<String>(); 
    imprimirPila(pila);                        
  }                     

    
  private void imprimirPila(Stack<String> pila) {
    if (pila.empty()) {
      System.out.print("la pila esta vacia\n\n");
    } else {
      System.out.print("la pila contiene: ");
      for (String numero : pila) {
          System.out.printf("%s ", numero);
      }
      System.out.print("(superior) \n\n");
    }
  }
}
