//Javier Emilio Alvarez Cifuentes 18051
//Diego José Ruíz Ozaeta 18761
import java.util.Stack;
import java.util.EmptyStackException;
import java.util.Arrays;

public class Calculadora implements ICalculadora {
  Stack<String> pila = new Stack<String>();
  


  public Calculadora(){
    System.out.println("Calculando....");
  }

  public double resolver(String input){
    Character[] operandos = {'\u0030','\u0031','\u0032','\u0033','\u0034','\u0035','\u0036','\u0037','\u0038','\u0039'};
    Character[] operadores = {'\u002b','\u002d','\u002a','\u002f'};
    double s;

    for (int i=0; i<input.length(); i++){ 
      if (Arrays.asList(operandos).contains(input.charAt(i))){
        String x= String.valueOf(input.charAt(i)); 
        pila.push(x);
      } else if (Arrays.asList(operadores).contains(input.charAt(i))){
        char y= input.charAt(i);
        String c1 = pila.pop();
        double n1 = Double.parseDouble(c1); 
        String c2 = pila.pop();
        double n2 = Double.parseDouble(c2);
        if (y=='\u002b'){
          s = n2+n1;
          String n3=String.valueOf(s);
          pila.push(n3);
        } else if (y=='\u002d'){
          s = n2-n1;
          String n3=String.valueOf(s);
          pila.push(n3);
        } else if (y=='\u002a'){
          s = n2*n1;
          String n3=String.valueOf(s);
          pila.push(n3);
        } else if (y=='\u002f'){
          s = n2/n1;
          String n3=String.valueOf(s);
          pila.push(n3);
        }     
      }
    }
    String rslt = pila.pop();
    double resultado = Double.parseDouble(rslt);
    return resultado;
  } 
}
