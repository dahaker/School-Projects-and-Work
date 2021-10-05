import java.util.Scanner;   //clase scanner
import javax.swing.JOptionPane;  //Caja de dialogo (mas visual)
public class triangulo    //nombre del programa y archivo
 {

    public static double exponente;  //declaracion de strings/variables
    public static double base;
    public static double resultado;


    public static void main(String[] args) //Argumento de tipo string, publico
    {

        exponente = Double.parseDouble(JOptionPane.showInputDialog("Entre la altura de el triangulo o X: "));  //Popup prompt para entrada de X o altura
        base = Double.parseDouble(JOptionPane.showInputDialog("Entre la base de el triangulo o Y: "));   //Popup prompt para entrada de Y o base

        resultado = total(base, exponente);  //Parte de la equacion (declaracion de hipotenusa)

        JOptionPane.showMessageDialog(null,resultado);

    }


    public static double total(double exponente, double base)  //declaracion para formula tipo double
    {

        return Math.pow(base, exponente); //Formula para hipotenusa
    }

}