//Raul Gonzalez 
//Y00339371
import java.util.Scanner;   //clase scanner
import javax.swing.JOptionPane;  //Caja de dialogo (mas visual)
public class exponente    //nombre del programa y archivo
 {

    public static double exponente,  //declaracion de strings/variables
                           base,
                      resultado,
                        raiz,
                        raiz2;

    public static void main(String[] args) //Argumento de tipo string, publico
    {

        exponente = Double.parseDouble(JOptionPane.showInputDialog("Entre el exponente: "));  //Popup prompt para entrada del exponente
        base = Double.parseDouble(JOptionPane.showInputDialog("Entre la base: "));   //Popup prompt para entrada de la base
         raiz2= Double.parseDouble(JOptionPane.showInputDialog("Entre numero para sacar raiz si desea hacerlo: "));  //Popup prompt para sacar raiz
        
        resultado = total(base, exponente);  //Parte de la equacion 
         raiz= Math.sqrt(raiz2);  //Formula para raiz

        JOptionPane.showMessageDialog(null,resultado); //Popup resultado total 
         JOptionPane.showMessageDialog (null,raiz);    //Popup resultado raiz
         
         
    }


    public static double total(double exponente, double base)  //declaracion para formula tipo double
    {

        return Math.pow(base, exponente); //Formula exponencial
    }


     
     

}
