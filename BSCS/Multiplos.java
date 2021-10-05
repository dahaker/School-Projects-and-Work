//Raul X Gonzalez
//Y00339371

import java.io.*;
public class Multiplos  //Nombre del archivo
{
	public static void main (String args[]) throws IOException  /
	 {
 	   BufferedReader in = new BufferedReader( new InputStreamReader( System.in));

    	int valorInicial,  //Declaracion de variables
        	valorFinal,
        	contador,
         multiplo;
      
   	 System.out.print("Entre el valor inicial "); //Siguentes lineas son inputs para los valores o variables
   	 valorInicial = Integer.valueOf(in.readLine()).intValue();
   	 System.out.print("Entre el valor final: ");
   	 valorFinal = Integer.parseInt(in.readLine());
       System.out.print("Entre el multiplo: ");
       multiplo = Integer.parseInt(in.readLine());
		
		 for(contador = valorInicial; contador <= valorFinal; contador++) //Counter para dividir valores
		 {
	   	if ((contador % 3) == 0) //condicion
			{
		  		System.out.print(multiplo + " multiplos entre " + valorInicial + " y " + valorFinal + "son: "); //Print del programa

  for (int counter = 0 ; counter < multiplo ; counter++) {
    System.out.print(valorInicial*(2 + counter) + " ");			
   	 	}
         }
         }
         }
         }
 	 
