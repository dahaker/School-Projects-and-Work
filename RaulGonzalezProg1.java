//Raul X Gonzalez
//Y00339371
//rago9371@agu.inter.edu
//Programa Asig 1

import java.util.Scanner; //Libreria java Scanner para guardar la informacion del budget
import java.text.NumberFormat; //Libreria java de formato para curency 

class MyProcess extends Thread


{
    static String completedProcesses[] = new String[10];
    static int completed = 0;
    String processName;
    String myDependencies[];
    static int x = 10000; //declaracion de variable del dinero asignado a los usuarios
    static int m = RaulGonzalezProg1.n; //
    
    
    MyProcess(String pname, String md[])
    {
        super();
        processName = pname;
        myDependencies = md;
    }
    public void run() 
    {
    	
        returnWhenDependenciesMet();
        
        NumberFormat fmt = NumberFormat.getCurrencyInstance(); //Hace que tome la localizacion del usuario y le ponga los
        													//simbolos de currency y decimales.
		System.out.println(processName + " started with a required budget of " + fmt.format(x) ); // Aqui se le a~adio el texto de budget y la cantidad con currency y su variable.
        
		completed();
		x+=10000; //Cada vez que el thread se genera se le a~ade 10000 mas al prox usuario como el ejemplo de la pagina de la asignacion
    }
    
    void returnWhenDependenciesMet()
    {
        boolean finished = false;
        if (myDependencies.length > 0)
        {
            while (!finished)
            {
                finished = true;
                for (int i = 0; i < myDependencies.length; i++)
                {
                    if (!isInFinished(myDependencies[i]))
                    {
                        finished = false;
                    }
                }
            } 
        }  
    }
    
    boolean isInFinished(String p)
    {
        boolean finished = false;
        for (int i = 0; i < completedProcesses.length; i++)
        {
            if (p.equals(completedProcesses[i]))
            {
                finished = true;
            }
        }
        return finished;
    }
    
    synchronized void completed()
    {
    
    	NumberFormat fmt = NumberFormat.getCurrencyInstance(); ////Hace que tome la localizacion del usuario y le ponga los
																//simbolos de currency y decimales.
        System.out.println(processName + " finished"); //Aqui se le a~adio el texto finished
       
		System.out.println("Available budget: " + fmt.format(m)); //Se modifico el processo para calcular budget disponible y su formato de dinero.
        completed++;
        
        completedProcesses[completed - 1] = processName;
        m-=x; //
    }
}


public class RaulGonzalezProg1

{
	public static Scanner input = new Scanner(System.in); //Scanner input para obtener y guardar el input del usuario
	static //Utilize static para poner el system.out antes del main.
	{
		System.out.println("Enter available budget: "); // Print out del programa preguntando por el dinero
	}
	static int n = input.nextInt(); //Declaracion de el valor n que representa el input del usuario
	public static void main(String[] args) 
    
    {
    	
    	NumberFormat fmt = NumberFormat.getCurrencyInstance(); //Hace que tome la localizacion del usuario y le ponga los
																//simbolos de currency y decimales.
    	
    	
    	input.close(); //El close del proceso input
    	System.out.println("Available budget: "+ fmt.format(n)); //El print out del budget escrito por el usuario.
    	
    
        MyProcess p1 = new MyProcess("P1", new String[]{});
        MyProcess p2 = new MyProcess("P2", new String[]{});
        MyProcess p3 = new MyProcess("P3", new String[]{});
        MyProcess p4 = new MyProcess("P4", new String[]{"P2", "P3"});
        MyProcess p5 = new MyProcess("P5", new String[]{"P3"});
        MyProcess p6 = new MyProcess("P6", new String[]{"P1","P4"});
        MyProcess p7 = new MyProcess("P7", new String[]{"P4"});
        MyProcess p8 = new MyProcess("P8", new String[]{"P6","P7"});
        MyProcess p9 = new MyProcess("P9", new String[]{"P5"});
        
        
        p1.start();
        p2.start();
        p3.start();
        p4.start();
        p5.start();
        p6.start();
        p7.start();
        p8.start();
        p9.start();
    }
}