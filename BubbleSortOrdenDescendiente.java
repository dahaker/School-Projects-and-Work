public class BubbleSortOrdenDescendiente {
 
	public static void main(String[] args) {
		
		//crear una matriz int que queremos ordenar usando el algoritmo de ordenación de burbujas
		int intArray[] = new int[]{5,90,35,45,150,3};
		
		//imprime una matriz antes de ordenar usando el algoritmo de ordenación de burbujas
		System.out.println("Array anter Bubble Sort");
		for(int i=0; i < intArray.length; i++){
			System.out.print(intArray[i] + " ");
		}
		
		//ordenar una matriz en orden descendente usando el algoritmo de ordenación de burbujas
		bubbleSort(intArray);
		
		System.out.println("");
		
		//imprime una matriz después de ordenar usando el algoritmo de ordenación de burbujas
		System.out.println("Array despues del Bubble Sort");
		for(int i=0; i < intArray.length; i++){
			System.out.print(intArray[i] + " ");
		}
 
	}
 
	private static void bubbleSort(int[] intArray) {
		
		/*
		
1. Compare array [0] y array [1]
2. Si array [0] <array [1] lo intercambia.
3. Compare array [1] y array [2]
4. Si el array [1] <array [2] lo intercambia.
 etc.
5. Compare array [n-1] y array [n]
6. si [n-1] <matriz [n] luego cambiarlo.
		 etc. etc.
       */
		
		int n = intArray.length;
		int temp = 0;
		
		for(int i=0; i < n; i++){
			for(int j=1; j < (n-i); j++){
				
				if(intArray[j-1] < intArray[j]){
					//cambio de los elementos
					temp = intArray[j-1];
					intArray[j-1] = intArray[j];
					intArray[j] = temp;
				}
				
			}
		}
	
	}
}
 
