import java.util.Arrays;
import java.util.Collections;
class Sort {
 
  public static void main(String[] args) {
    // int Array
    Integer[] intArray = new Integer[] {
        new Integer(15),
        new Integer(9),
        new Integer(16),
        new Integer(2),
        new Integer(30)
    };

    // Ordenar la matriz en orden decendiente
    Arrays.sort(intArray, Collections.reverseOrder());
 
    // Output de los elementos del int Array
    System.out.println("Int Array elementos en el orden inverso:");
    for (int i = 0; i < intArray.length; i++)
       System.out.println(intArray[i]);
 
    // String Array
    String[] stringArray = 
       new String[] { "FF", "PP", "AA", "OO", "DD" };

    // Organizando String Array en el orden decendiente
    Arrays.sort(stringArray, Collections.reverseOrder());

    // Output de los elementos String Array
    System.out.println("String Array de elementos en el orden inverso:");
    for (int i = 0; i < stringArray.length; i++)
       System.out.println(stringArray[i]);
  }
}