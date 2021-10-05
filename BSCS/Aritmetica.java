//Programa Aritmetica.java
//Raul X Gonzalez
//Y00339371

import java.io.*;
public class Aritmetica {
public static void main (String args [])
throws IOException {
BufferedReader in = new BufferedReader ( new InputStreamReader ( System.in));

double entero1, //int entero1;
   entero2,  //int entero2;
   suma,     //int suma;
   base,
   exponente;
   
   double real1,  //Double real1;
           real2, //double real2;
           cociente; //double cociente;
           
  System.out.print ("Entre un numbero entero: "); //El Print del Programa
  entero1 = Integer.valueOf(in.readLine ()) .intValue (); //Input para primer entero
  System.out.print ("Entre un otro numbero entero: ");  //El Print del Programa
   entero2 = Integer.valueOf(in.readLine ()) .intValue (); //Input del segundo entero
   System.out.print ("Entra Base para calcular: "); //El Print del Programa
   base = Integer.valueOf(in.readLine ()) .intValue (); //Input de la base para calculo
   System.out.print ("Entra exponente a calcular: "); //El Print del Programa
   exponente = Integer.valueOf (in.readLine ()) .intValue (); //Input del exponente para calculo
suma= entero1+entero2;  //Suma de ambos enteros
System.out.println("Entero1 + Entero2 =" + suma); //El Print del Resultado

suma= entero1-entero2;  //Resta de amobos enteros
System.out.println("Entero1 - Entero2 =" + suma);  //El Print del Resultado

suma= entero1*entero2;  //Multiplicacion de los enteros
System.out.println("Entero1 * Entero2 =" + suma);    //El print del resultado

suma= Math.pow(base, exponente); //Calculo de el exponencial
System.out.println("Entero al exponente =" + suma); //resultado del exponencial

System.out.print ("Entre un numbero real: ");  //El Print del Programa
real1 = Double.valueOf(in.readLine ()) .doubleValue(); // Calclo del numero real

System.out.print ("Entre otro numbero real: "); //El Print del Programa
real2 = Double.valueOf(in.readLine ()) .doubleValue(); //Calculo del numero real
cociente = real1 / real2;
System.out.println("real1 /real2 = " + cociente);

}
}