package basicos;
import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {
		
		int n1 = 0;
		int n2 = 0;
		int resultado = 0;
		int opcion = 0;
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Introduce el primer número:");                     
        n1 = reader.nextInt();
        
        System.out.println("Introduce el segundo numero:");
        n2 = reader.nextInt();
        
        System.out.println("Selecciona una de las siguientes opciones:"
        		+ "\n 1.Sumar"
        		+ "\n 2.Restar"
        		+ "\n 3.Multiplicar"
        		+ "\n 4.Dividir"
        		+ "\n 5.Salir");
        
        opcion = reader.nextInt();
        
        switch(opcion){
        	
        	case 1:
        		System.out.println("Sumar");
        		break;
        	case 2:
        		System.out.println("Restar");
        		break;
        	case 3:
        		System.out.println("Multiplicar");
        		break;
        	case 4:
        		System.out.println("Dividir");
        		break;
        	case 5:
        		System.out.println("Adios, hasta la proxima...");
        		break;
        
        }
		

	}

}
