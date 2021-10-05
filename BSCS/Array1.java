public class Array1
{
public static void main (String[] args) {
int array[] =new int [10], //declaracion de la variable
i;
for (i=0; i<10; i++) //asigna valores del elemento, ej: de 0 a 10 y mientras sea cierto va de 1, 2, 3 etc.
{
array[i] = i*i;  //formula
}
for (i=9; i>=0; i--) //declaracion para salida en orden
{
System.out.println(i+"^2 = " + array[i] + '\n');
}
}
}
