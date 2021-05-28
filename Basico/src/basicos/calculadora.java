package basicos;
import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {
		
		int n1 = 0;
		int n2 = 0;
		int opcion = 0;
		int resultado = 0;
		
		Scanner lector;
		
		lector = new Scanner(System.in);
		
		System.out.println("Introduce el primer número:");                     
        n1 = lector.nextInt();
        
        System.out.println("Introduce el segundo numero:");
        n2 = lector.nextInt();
        
        System.out.println("Selecciona una de las siguientes opciones:"
        		+ "\n 1.Sumar"
        		+ "\n 2.Restar"
        		+ "\n 3.Multiplicar"
        		+ "\n 4.Dividir"
        		+ "\n 5.Salir");
        
        opcion = lector.nextInt();
        
        switch(opcion){
        	
        	case 1:
        		resultado = sumar(n1, n2);
        		System.out.println("El resultado de la suma es: "+resultado);
        		break;
        	case 2:
        		resultado = restar(n1, n2);
        		System.out.println("El resultado de la resta es: "+resultado);
        		break;
        	case 3:
        		resultado = multiplicar(n1, n2);
        		System.out.println("El resultado de la multiplicacion es: "+resultado);
        		break;
        	case 4:
        		resultado = dividir(n1, n2);
        		System.out.println("El resultado de la division es: "+resultado);
        		break;
        	case 5:
        		System.out.println("Adios, hasta la proxima...");
        		break;
        
        }
		

	}
	
	public static int sumar(int n1, int n2) {
		
		return n1+n2;
		
	}
	
	public static int restar(int n1, int n2) {
		
		return n1-n2;
		
	}

	public static int multiplicar(int n1, int n2) {
	
		return n1*n2;
	
	}

	public static int dividir(int n1, int n2) {
	
		return n1/n2;
	
	}

}
