//Raul X. Gonzalez-Matias
//Y00339371

import java.util.Scanner; //necesitamos la clase Scanner para
                          //poder leer valores del teclado

class primerPrograma2
{
  public static void main(String args[])
  {
    Scanner input = new Scanner(System.in);  //creamos a "input" como un 
	                                          //objeto de clase Scanner
	 
	 double valor1,   //definimos tres variables que usaremos en el 
	        valor2,   //programa
			  suma;
			  
	 System.out.print("Entre valor 1: ");
	 valor1 = input.nextDouble();	        //leemos el primer valor
    System.out.print("Entre valor 2: ");
	 valor2 = input.nextDouble();         //leemos el segundo valor
	 
	 suma = valor1 + valor2;

    //En Java el signo de suma "+" se puede utilizar para concatenar
	 //Strings como en Basic

	 System.out.println(valor1 + " + " + valor2 + " = " + suma);
  }
}