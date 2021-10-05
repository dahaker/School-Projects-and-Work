//Raul X Gonzalez
//Y00339371

import java.util.Scanner;

public class SumaMatrices {

	//Prompt para entrar informacion sobre el numero de filas y columnas
   public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       System.out.print("Entrar el numero de filas: ");
       int filas = s.nextInt();
       System.out.print("Entrar el numero de columnas: ");
       int columnas = s.nextInt();
       int[][] a = new int[filas][columnas];
       int[][] b = new int[filas][columnas];
       System.out.println("Entra los numeros de la primera matriz:");  //Aqui se entra los numeros de la primera matriz
       for (int i = 0; i < filas; i++) {   //Numeros para la fila de la matriz A
           for (int j = 0; j < columnas; j++) {   //Numeros para la fila de la matriz B
               a[i][j] = s.nextInt();    //Proximo prompt
           }
       }
       System.out.println("Entra los numeros de la segunda matriz:");
       for (int i = 0; i < filas; i++) {
           for (int j = 0; j < columnas; j++) {
               b[i][j] = s.nextInt();
           }
       }
       int[][] c = new int[filas][columnas];
       for (int i = 0; i < filas; i++) {
           for (int j = 0; j < columnas; j++) {
               c[i][j] = a[i][j] + b[i][j];
           }
       }
       System.out.println("La suma de ambas matrices es:"); //Suma de ambas matrices
       for (int i = 0; i < filas; i++) {
           for (int j = 0; j < columnas; j++) {
               System.out.print(c[i][j] + " ");
           }
           System.out.println();
       }
   }
}
