//Raul X Gonzalez
//Y00339371
import java.util.*;

public class temperatura {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        // Entra el numero de dias atraves del usuario.
        System.out.print("Cuantos dias? ");
        int days = console.nextInt( );

        // Declara y crea el array
        int[ ] temp = new int[days];

        // Entra y guarda la temperatura en el array
        for (int i = 0; i < temp.length; i++) {
            System.out.print("Temperatura alta del dia " + i + ":");
            temp[i] = console.nextInt( );
        }

        // Calcual e imprime el promedio
        int suma = 0;
        for (int i = 0; i < temp.length; i++) {
            suma += temp[i];
        }
        // Para prevenir la division del integro
        double promedio = (double) suma / temp.length;
        System.out.println("Temperatura promedio = " + promedio);

        // Cuenta el numero de valores que fueron sobre el promedio
        int count = 0;
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] > promedio) {
                count++;
            }
        }
        System.out.println(count + " dias son sobre el promedio");
    }
}