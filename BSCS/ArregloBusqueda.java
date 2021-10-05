public class ArregloBusqueda {
static int getPosition(double listOfValues[] ,
 double targetValue )
 {
 int i,
 position = -1;
 for (i=0; i < listOfValues.length; i++)
 {
 if (listOfValues[ i] == targetValue)
 {
 position = i;
 }
 }
 return position;
 }

 static int getPosition2 (double listOfValues[] ,
 double targetValue )
 {
 int i,
 position = -1;
 boolean found = false;
 for (i=0; (i < listOfValues.length) && (!found); i++)
 {
 if (listOfValues[ i] == targetValue)
 {
 position = i;
 found = true;
 }
 }
 return position;
 }
 public static void main(String[] args) {
 double list[] = {1,6,3,8,5,8,3,4,8,3};
 int position;
 position = getPosition(list, 3);
 if (position != -1)
 {
 System.out.println("Value found at position " +
position + "\n\n");
 }
 else
 {
 System.out.println("Value not found \n\n");
 }
 position = getPosition2(list, 3);
 if (position != -1)
 {
 System.out.println("Value found at position " +
position + "\n\n");
 }
 else
 {
 System.out.println("Value not found \n\n");
 }
 }
 }