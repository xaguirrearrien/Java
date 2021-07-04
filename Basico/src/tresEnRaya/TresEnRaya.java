package tresEnRaya;
import java.util.Random;
import java.util.Scanner;

public class TresEnRaya {

	public static void main(String[] args) {
		
		int turno = 1;
		int casilla = 0;
		Scanner lector;
		lector = new Scanner(System.in);
		Random r = new Random();
		int jugador = r.nextInt(2);
		
		String[] elementos = {" ", " ", " ", " ", " ", " ", " ", " ", " "};
		
		pintarTabla(elementos);
		
		comenzarJuego(elementos, lector, casilla, r, jugador, turno);
		
	
	}
	
	public static void pintarTabla(String[] elementos) {
		
	
		for (int i = 0; i < elementos.length; i++) {
			
			if((i+1)%3 == 0) {
				
				System.out.println(elementos[i]);
				
			}else {
				
				System.out.print(elementos[i]+"|");
				
			}
			
		}
		
	}
	
	public static void comenzarJuego(String[] elementos, Scanner lector, int casilla, Random r, int jugador, int turno) {
		
		
		System.out.println("Turno "+turno);
		
		if (jugador == 0) {
			System.out.println("Le toca a la maquina!");  
			
			do {
					
				casilla = r.nextInt(9);
					
			}while(elementos[casilla] != " ");
				
			jugador = 1;
				
		}else {
			System.out.println("Te toca!"); 
			do {
					
				System.out.println("Numero de casilla: ");                 
				casilla = lector.nextInt();
					
				if(elementos[casilla] != " ") {
					System.out.println("Esta casilla ya esta seleccionada, vuelve a intentarlo...");
				}
					
			}while(elementos[casilla] != " ");
				
			jugador = 0;
				
		}
			
		
		if (turno%2 == 0) {
			
			elementos[casilla] = "O";
			
		}else {
			
			elementos[casilla] = "X";
		}
		
		pintarTabla(elementos);
		
		turno++;
		
		if(tableroVacio(elementos)) {
			comenzarJuego(elementos, lector, casilla, r, jugador, turno);
		}else {
			System.out.println("El juego a terminado");
		}
	}
	
	public static boolean tableroVacio(String[] elementos) {
		
		boolean vacio = false;
		
		for(int i = 0; i < elementos.length; i++) {
			
			if(elementos[i] == " ") {
				vacio = true;
			}
		}
		
		return vacio;
		
	}

}
