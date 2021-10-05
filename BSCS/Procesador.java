/**
 *
 * @authors Cruz Collazo, Christopher
 *          Acosta Calero, Brain L.
 *          Gonzales Matias, Raul
 * 6/11/2019
 */
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Procesador {
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      
      //Objetos que representan respectivas partes del CPU
      PC pc = new PC();
      AC ac = new AC();
      IR ir = new IR();
      
      //Arreglo donde se cargaran las instrucciones
      String[] memoria = new String[20];
      
      //Comienza el programa preguntandole al usuario la direccion de las instrucciones en formato .txt
      System.out.println("File with memory contents: ");
      String direccion = input.nextLine();   //Se guarda la direccion
      try(BufferedReader br = new BufferedReader(new FileReader(direccion)))
      {
         String str;
         int counter = 0;
         //Mientras el archivo no este vacio, todo se almacenara en el arreglo
         while((str = br.readLine()) != null){
            memoria[counter] = str;
            counter++;
         }
         
         //Si las instrucciones no llenaron por completo la memoria esta se llenara las lineas sobrantes por "0000"
         for(int i = 0; i < memoria.length; i++){
            if(memoria[i] == null){
               memoria[i] = "0000";
            }
         }              
      }catch (IOException e)
      {
         System.out.println("File Read Error " + e.toString());
      }
      System.out.println("Memory loaded");
      System.out.println("Enter G to run the program from start to end or S to run it step by step: ");
      char seleccion = input.nextLine().charAt(0);
      
      switch (seleccion){
         //Misma ejecucion que la opcion S, solo que no se detiene 
         case 'G':
            System.out.println("CPU Registers");
            pc.printContent();
            ac.printContent();
            ir.printContent();
         
            System.out.println("\nMemory");
            System.out.println("Address     Content");
            //Formato predefino 
            for(int i = 0; i < memoria.length; i++){
               //Propositos estatico, coloca un 0 en las primeros 10 direcciones
               if(i < 10){
                  System.out.print(0);
               }
               System.out.println(i + "          [" + memoria[i] + "]");
            }
            //Correr mientras la instruccion en IR no sea "0000"
            while(!ir.getContent().equals("0000")){             
               System.out.println("Fetching instruction at address " + pc.getContent() + " [" + memoria[Integer.parseInt(pc.getContent())] + "]");            
               //Su contenido sera el resultado de la 
               //instruccion que decodificara la unidad IR. Para el lograr esto a IR se le da acceso a la memoria y a la instruccion que contiene PC.
               String acContent = ir.decodeInstruction(memoria, Integer.parseInt(pc.getContent()));
               if(acContent.length() == 1){
                  //Si el IR decodifica la instruccion y es de almacenamiento a la memoria le dira a AC donde guardar la informacion que este contiene
                  ac.storeToAddress(memoria, acContent);
               }else{
                  //AC es la unidad de almacenamiento, este puede ser a€œ0000â€ o cualquier otro valor.
                  ac.setContent(acContent);
               }
               //Se aumenta por uno el PC
               pc.nextInstruction(memoria);
            }
            System.out.println("CPU Registers");
            pc.printContent();
            ac.printContent();
            ir.printContent();
            
            System.out.println("\nMemory");
            System.out.println("Address     Content");
            //Formato predefino 
            for(int i = 0; i < memoria.length; i++){
               //Propositos estatico, coloca un 0 en las primeros 10 direcciones
               if(i < 10){
                  System.out.print(0);
               }
               System.out.println(i + "          [" + memoria[i] + "]");
            }
            break;
         case 'S':     
            //Correr mientras la instruccion en IR no sea "0000"
            while(!ir.getContent().equals("0000")){                 
               System.out.println("CPU Registers");
               pc.printContent();
               ac.printContent();
               ir.printContent();
            
               System.out.println("\nMemory");
               System.out.println("Address     Content");
               //Formato predefino 
               for(int i = 0; i < memoria.length; i++){
                  //Propositos estatico, coloca un 0 en las primeros 10 direcciones
                  if(i < 10){
                     System.out.print(0);
                  }
                  System.out.println(i + "          [" + memoria[i] + "]");
               }
               
               System.out.println("\nPress Enter to fetch/decode/execute next instruction.");
               input.nextLine();
               System.out.println("Fetching instruction at address " + pc.getContent() + " [" + memoria[Integer.parseInt(pc.getContent())] + "]");            
               //Su contenido sera el resultado de la 
               //instruccion que decodificara la unidad IR. Para el lograr esto a IR se le da acceso a la memoria y a la instruccion que contiene PC.
               String acContent = ir.decodeInstruction(memoria, Integer.parseInt(pc.getContent()));
               if(acContent.length() == 1){
                  //Si el IR decodifica la instruccion y es de almacenamiento a la memoria le dira a AC donde guardar la informacion que este contiene
                  ac.storeToAddress(memoria, acContent);
               }else{
                  //AC es la unidad de almacenamiento, este puede ser a€œ0000a€ o cualquier otro valor.
                  ac.setContent(acContent);
               }
               //Se aumenta por uno el PC
               pc.nextInstruction(memoria);              
            }
            break;
         default:
            System.out.println("Wrong Key");         
      } 
   }
   
   //Clase que representa a PC
   static class PC{
      //Representa el estado
      private String content = "0";
      
      //Imprime en la pantalla en un formato especifico 
      public void printContent(){
         System.out.println("[" + content + "]" + " PC");
      }
     
      
      public String getContent(){
         return this.content;
      }
      
      public void nextInstruction(String[] memoria){
         //Esta instruccion es lo mismo a PC++
         this.content = String.valueOf((Integer.parseInt(content) + 1));
      }
   }
   //Clase que representa a AC
   static class AC{
      //Representa el estado
      private String content = "0";
      
      //Imprime en la pantalla en un formato especifico 
      public void printContent(){
         System.out.println("[" + content + "]" + " AC");
      }
      
      public void setContent(String content){
         this.content = content;
      }
      
      public String getContent(){
         return this.content;
      }
      
      public void storeToAddress(String[] memoria, String direction){
         memoria[Integer.parseInt(direction)] = content;
      }
   }
   //Clase que representa a IR
   static class IR{
      //Representa el estado
      private String content = "0";
      
      //Imprime en la pantalla en un formato especifico 
      public void printContent(){
         System.out.println("[" + content + "]" + " IR");
      }
      
      public String getContent(){
         return this.content;
      }
      
      //Metodo que se dedica a interpretar el tipo de instruccion, se le pasa una copia del arreglo y la instruccion actual del PC
      public String decodeInstruction(String[] memoria, int pc){
         //Copia de la instruccion actual, al principio es €œ0a€
         String acCurrentContent = content;
         //El contenido de IR sera la instruccion que contiene la direccion que senala PC 
         content = memoria[pc];
         //Obtiene el Opcode de la instruccion 
         char opcode = this.content.charAt(0);
         String returnContent = "";
         
         switch(opcode){
            case '1':
               System.out.println("Decoding instruction: Load from address " + content.substring(1) + " [" + memoria[Integer.parseInt(content.substring(3))] + "]");
               returnContent = memoria[Integer.parseInt(content.substring(3))];
               break;
            case '2':
               System.out.println("Decoding instruction: Store to address " + content.substring(1));
               returnContent = content.substring(3);
               break;
            case '5':
               System.out.println("Decoding instruction: Add from address " + content.substring(1) + " [" + memoria[Integer.parseInt(content.substring(3))] + "]");
               acCurrentContent = memoria[Integer.parseInt(acCurrentContent.substring(3))];
               int calcContent = Integer.parseInt(memoria[Integer.parseInt(content.substring(3))], 16)  +  Integer.parseInt(acCurrentContent, 16);    
               returnContent = Integer.toHexString(calcContent);
               break;              
         }
         System.out.println("Executing instruction\n");
         return returnContent;
      }
   }
}


