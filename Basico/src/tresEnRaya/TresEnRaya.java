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
		String ganador = "";
		
		String[] elementos = {" ", " ", " ", " ", " ", " ", " ", " ", " "};
		
		pintarTabla(elementos);
		
		comenzarJuego(elementos, lector, casilla, r, jugador, turno, ganador);
		
	
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
	
	public static void comenzarJuego(String[] elementos, Scanner lector, int casilla, Random r, int jugador, int turno, String ganador) {
		
		
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
					
					System.out.println("Esta casilla ya esta seleccionada, prueba con otra...");
					
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
		
		ganador = comprobarVictoria(elementos);
		
		if(ganador != "") {
			
			
			System.out.println(ganador);
			System.out.println("El juego a terminado");
			
		}else {
			
			if(tableroVacio(elementos)) {
				
				comenzarJuego(elementos, lector, casilla, r, jugador, turno, ganador);
				
			}else {
				
				System.out.println("El juego a terminado");
				
			}
			
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
	
	public static String comprobarVictoria(String[] elementos) {
		
		int contadorX = 0;
		int contadorO = 0;
		String ganador = "";
		
		for(int i = 0; i < elementos.length; i++) {
			
			if (elementos[i] == "X") {
				
				contadorX++;
				contadorO = 0;
				
			}else if (elementos[i] == "O") {
				
				contadorO++;
				contadorX = 0;
				
			}else {
				
				contadorX = 0;
				contadorO = 0;
			}
			
			if (contadorX == 3) {
				
				ganador = "El ganador es el jugador 1";
				break;
				
			}else if (contadorO == 3) {
				
				ganador = "El ganador es el jugador 2";
				break;
				
			}
			
		}
		
		return ganador;
		
	}

}
