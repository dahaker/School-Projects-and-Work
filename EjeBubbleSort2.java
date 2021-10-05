 class Student {
 int age;
 String name,
id;
 Student(int a, String n, String i){
 age = a;
 name = n;
 id = i;
}
 public String toString()
 {
 return (age + ", " + name + ", " + id);
}
}
 public class EjeBubbleSort2{
 public static void main(String args[]){
 Student lista[] = new Student[6],
tempValue;
 int i,
j;
 lista[0] = new Student(56,"Jose" , "11111111");
 lista[1] = new Student(77,"Maria" , "22222222");
 lista[2] = new Student(25,"Luis" , "33333333");
 lista[3] = new Student(38,"Juan" , "44444444");
 lista[4] = new Student(15,"Carmen", "55555555");
 lista[5] = new Student(45,"Luisa" , "66666666");
 for (i = 0; i <lista.length - 1; i++ ){
 System.out.println("Pass # " + (i+1));
 for (j = 0; j<lista.length-i-1; j++)
 {
 if (lista[j].age > lista[j+1].age){
 System.out.println("Exchange " + lista[j] +
" <-> " + lista[j+1]);
 tempValue = lista[j];
 lista[j] = lista[j+1];
 lista[j+1] = tempValue;
}
}
}
 for (i=0; i<lista.length; i++) {
 System.out.println(lista[i]);
}
}
}