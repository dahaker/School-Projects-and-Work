//Raul X Gonzalez
//Y00339371
class BNode {
 char caracter; BNode leftPtr,
 rightPtr;
 BNode(char c, BNode lft, BNode rght )
 {
 caracter = c;
 leftPtr = lft;
 rightPtr = rght;
 }
 BNode (char c)
 {
 this (c,null,null);
 }
 protected void editNodeInNet(String path, char c) {
 BNode tempPtr;
 int i,
 strLength = 0;
 boolean validPath = true;

 if (this != null)
 {
 strLength = path.length();
 tempPtr = this;
 for (i = 0; (i < strLength) && (validPath); i++)
 {
 if (path.charAt(i) == 'L')
 {
 tempPtr = tempPtr.leftPtr;
 }
 else if (path.charAt(i) == 'R')
 {
 tempPtr = tempPtr.rightPtr;
 } else
 {
 validPath = false;
 }
 if ((tempPtr == null) && (i < strLength - 1))
 {
 validPath = false;
 }
 }
 if (i == strLength)
 {
 tempPtr.caracter = c;
 }
 }
 else {
 //net is empty
 }
 }
}
public class BinaryNetDemo2{
 public static void main(String[] args){ BNode root = new
BNode('A');
 BNode tempPtr;
 root.rightPtr = new BNode('E');
 root.rightPtr.leftPtr = root;
 root.leftPtr = new BNode('B');
 root. leftPtr. rightPtr = root. rightPtr;
root.rightPtr.rightPtr = new BNode('D');
 root. rightPtr. rightPtr. rightPtr = root. leftPtr;
root.leftPtr.leftPtr = new BNode('C');
root.leftPtr.leftPtr.leftPtr = root;
root.leftPtr.leftPtr.rightPtr =
 root. leftPtr. rightPtr. rightPtr;
 // El siguiente código se utiliza para imprimir el
 // contenido de los nodos antes y después de modificarlos.
 // Note que se usan rutas distintas para imprimir el
//contenido
 // antes de modificarlos y para modificar los mismos.
 // forma demostramos que el método nos permite acceder a los
 // nodos a través de cualquier ruta.
 tempPtr = root.rightPtr.leftPtr.leftPtr.leftPtr; System. out
.println (tempPtr. caracter) ;
 root.editNodeInNet("LL", 'X'); System. out .println (tempPtr.
caracter) ;
 tempPtr = root.leftPtr.leftPtr.rightPtr; System. out .println
(tempPtr. caracter) ;
 root.editNodeInNet ("LRLLRR", 'W'); System. out .println
(tempPtr. caracter) ;
 root.editNodeInNet("", 'M'); System. out .println (root.
caracter);
 }
}
