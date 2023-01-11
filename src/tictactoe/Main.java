package tictactoe;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException{
		
		char [][] tablero = {{' ',' ',' '},
				{' ',' ',' '},
				{' ',' ',' '}};
		int posicion; 

		System.out.println("Introduce la posición donde quieres jugar. \n"
				+ "Usa el siguiente ejemplo donde el número indica la posición:");
		System.out.println("Para salir del juego introduzca 0. Empieza siempre la 'x'");
		
        System.out.println("+---+---+---+");
        System.out.println("| " + "1" + " | " + "2" + " | " + "3" + " |");
        System.out.println("+---+---+---+");
        System.out.println("| " + "4" + " | " + "5" + " | " + "6" + " |");
        System.out.println("+---+---+---+");
        System.out.println("| " + "7" + " | " + "8" + " | " + "9" + " |");
        System.out.println("+---+---+---+");

        posicion = PosicionTablero();
		Juego(posicion, tablero);	

		//Exit
		System.out.println("\n ***********\nHasta pronto. ¡Gracias por jugar!");

	}//Fin Class
	
	
	
	
	//metodo por el que se introduce la posicion del jugador en el tablero
	public static int PosicionTablero() {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int posicion = 0; 
		boolean confirm = false;
		
		//Validación de la posición del jugador en el tablero. While para evitar que la consola se pare si se introduce un texto
		while(!confirm) {
			
			//capturo NumberFormatException en caso de que introduzca un texto
			try {
				System.out.println("Introduce un numero");
		       		posicion = Integer.parseInt(br.readLine());
				
		        	//While que se ejecuta solo si se introduce un numero fuera de rango 1 - 9
					while(posicion <0 || posicion >9) {
						System.out.println("El número debe estar entre 1 y 9. El 0 es para salir.");
						System.out.println("Introduce un numero");
				        	posicion = Integer.parseInt(br.readLine());
					}
				//si todo ha ido bien, obtenemos la posición y salimos del while
				confirm = true;

			}catch (NumberFormatException e){
				System.out.println("Debes aportar un número");
			} catch (IOException e) {
				e.printStackTrace();
			}
		
		}//FIN While Validación
		return posicion;
	}

	
	
	//metodo por el que se ejecutan las posiciones
	public static void Juego(int posicion, char [][] tablero) throws NumberFormatException, IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int turno = 1;
		char j1 = 'x';
		char j2 = 'o';
		
		//el numero 0 está reservado para salir del juego
		while(posicion != 0) {

			System.out.println("\n\nHas seleccionado la posicion: " + posicion);

		//sustituye la posicion indicada en el espacio del tablero, x/o según el turno
			switch(posicion){
				case 1:
					if (turno %2 == 0) {
						tablero[0][0] = j2;
						System.out.println("+---+---+---+");
						System.out.println("| " + tablero[0][0] + " | " + tablero[0][1] + " | " + tablero[0][2] + " |");
						System.out.println("+---+---+---+");
						System.out.println("| " + tablero[1][0] + " | " + tablero[1][1] + " | " + tablero[1][2] + " |");
						System.out.println("+---+---+---+");
						System.out.println("| " + tablero[2][0] + " | " + tablero[2][1] + " | " + tablero[2][2] + " |");
						System.out.println("+---+---+---+");
					}else {
						tablero[0][0] = j1;
						System.out.println("+---+---+---+");
						System.out.println("| " + tablero[0][0] + " | " + tablero[0][1] + " | " + tablero[0][2] + " |");
						System.out.println("+---+---+---+");
						System.out.println("| " + tablero[1][0] + " | " + tablero[1][1] + " | " + tablero[1][2] + " |");
						System.out.println("+---+---+---+");
						System.out.println("| " + tablero[2][0] + " | " + tablero[2][1] + " | " + tablero[2][2] + " |");
						System.out.println("+---+---+---+");
					}
				break;
				
				case 2:
					if (turno %2 == 0) {
						tablero[0][1] = j2;
						System.out.println("+---+---+---+");
						System.out.println("| " + tablero[0][0] + " | " + tablero[0][1] + " | " + tablero[0][2] + " |");
						System.out.println("+---+---+---+");
						System.out.println("| " + tablero[1][0] + " | " + tablero[1][1] + " | " + tablero[1][2] + " |");
						System.out.println("+---+---+---+");
						System.out.println("| " + tablero[2][0] + " | " + tablero[2][1] + " | " + tablero[2][2] + " |");
						System.out.println("+---+---+---+");
					}else {
						tablero[0][1] = j1;
						System.out.println("+---+---+---+");
						System.out.println("| " + tablero[0][0] + " | " + tablero[0][1] + " | " + tablero[0][2] + " |");
						System.out.println("+---+---+---+");
						System.out.println("| " + tablero[1][0] + " | " + tablero[1][1] + " | " + tablero[1][2] + " |");
						System.out.println("+---+---+---+");
						System.out.println("| " + tablero[2][0] + " | " + tablero[2][1] + " | " + tablero[2][2] + " |");
						System.out.println("+---+---+---+");
					}
				break;
				
				case 3:
					if (turno %2 == 0) {
						tablero[0][2] = j2;
						System.out.println("+---+---+---+");
						System.out.println("| " + tablero[0][0] + " | " + tablero[0][1] + " | " + tablero[0][2] + " |");
						System.out.println("+---+---+---+");
						System.out.println("| " + tablero[1][0] + " | " + tablero[1][1] + " | " + tablero[1][2] + " |");
						System.out.println("+---+---+---+");
						System.out.println("| " + tablero[2][0] + " | " + tablero[2][1] + " | " + tablero[2][2] + " |");
						System.out.println("+---+---+---+");
					}else {
						tablero[0][2] = j1;
						System.out.println("+---+---+---+");
						System.out.println("| " + tablero[0][0] + " | " + tablero[0][1] + " | " + tablero[0][2] + " |");
						System.out.println("+---+---+---+");
						System.out.println("| " + tablero[1][0] + " | " + tablero[1][1] + " | " + tablero[1][2] + " |");
						System.out.println("+---+---+---+");
						System.out.println("| " + tablero[2][0] + " | " + tablero[2][1] + " | " + tablero[2][2] + " |");
						System.out.println("+---+---+---+");
					}
				break;
					
				case 4:
					if (turno %2 == 0) {
						tablero[1][0] = j2;
						System.out.println("+---+---+---+");
						System.out.println("| " + tablero[0][0] + " | " + tablero[0][1] + " | " + tablero[0][2] + " |");
						System.out.println("+---+---+---+");
						System.out.println("| " + tablero[1][0] + " | " + tablero[1][1] + " | " + tablero[1][2] + " |");
						System.out.println("+---+---+---+");
						System.out.println("| " + tablero[2][0] + " | " + tablero[2][1] + " | " + tablero[2][2] + " |");
						System.out.println("+---+---+---+");
					}else {
						tablero[1][0] = j1;
						System.out.println("+---+---+---+");
						System.out.println("| " + tablero[0][0] + " | " + tablero[0][1] + " | " + tablero[0][2] + " |");
						System.out.println("+---+---+---+");
						System.out.println("| " + tablero[1][0] + " | " + tablero[1][1] + " | " + tablero[1][2] + " |");
						System.out.println("+---+---+---+");
						System.out.println("| " + tablero[2][0] + " | " + tablero[2][1] + " | " + tablero[2][2] + " |");
						System.out.println("+---+---+---+");
					}
				break;
					
				case 5:
					if (turno %2 == 0) {
						tablero[1][1] = j2;
						System.out.println("+---+---+---+");
						System.out.println("| " + tablero[0][0] + " | " + tablero[0][1] + " | " + tablero[0][2] + " |");
						System.out.println("+---+---+---+");
						System.out.println("| " + tablero[1][0] + " | " + tablero[1][1] + " | " + tablero[1][2] + " |");
						System.out.println("+---+---+---+");
						System.out.println("| " + tablero[2][0] + " | " + tablero[2][1] + " | " + tablero[2][2] + " |");
						System.out.println("+---+---+---+");
					}else {
						tablero[1][1] = j1;
						System.out.println("+---+---+---+");
						System.out.println("| " + tablero[0][0] + " | " + tablero[0][1] + " | " + tablero[0][2] + " |");
						System.out.println("+---+---+---+");
						System.out.println("| " + tablero[1][0] + " | " + tablero[1][1] + " | " + tablero[1][2] + " |");
						System.out.println("+---+---+---+");
						System.out.println("| " + tablero[2][0] + " | " + tablero[2][1] + " | " + tablero[2][2] + " |");
						System.out.println("+---+---+---+");
					}
				break;
					
				case 6:
					if (turno %2 == 0) {
						tablero[1][2] = j2;
						System.out.println("+---+---+---+");
						System.out.println("| " + tablero[0][0] + " | " + tablero[0][1] + " | " + tablero[0][2] + " |");
						System.out.println("+---+---+---+");
						System.out.println("| " + tablero[1][0] + " | " + tablero[1][1] + " | " + tablero[1][2] + " |");
						System.out.println("+---+---+---+");
						System.out.println("| " + tablero[2][0] + " | " + tablero[2][1] + " | " + tablero[2][2] + " |");
						System.out.println("+---+---+---+");
					}else {
						tablero[1][2] = j1;
						System.out.println("+---+---+---+");
						System.out.println("| " + tablero[0][0] + " | " + tablero[0][1] + " | " + tablero[0][2] + " |");
						System.out.println("+---+---+---+");
						System.out.println("| " + tablero[1][0] + " | " + tablero[1][1] + " | " + tablero[1][2] + " |");
						System.out.println("+---+---+---+");
						System.out.println("| " + tablero[2][0] + " | " + tablero[2][1] + " | " + tablero[2][2] + " |");
						System.out.println("+---+---+---+");
					}
				break;
					
				case 7:
					if (turno %2 == 0) {
						tablero[2][0] = j2;
						System.out.println("+---+---+---+");
						System.out.println("| " + tablero[0][0] + " | " + tablero[0][1] + " | " + tablero[0][2] + " |");
						System.out.println("+---+---+---+");
						System.out.println("| " + tablero[1][0] + " | " + tablero[1][1] + " | " + tablero[1][2] + " |");
						System.out.println("+---+---+---+");
						System.out.println("| " + tablero[2][0] + " | " + tablero[2][1] + " | " + tablero[2][2] + " |");
						System.out.println("+---+---+---+");
					}else {
						tablero[2][0] = j1;
						System.out.println("+---+---+---+");
						System.out.println("| " + tablero[0][0] + " | " + tablero[0][1] + " | " + tablero[0][2] + " |");
						System.out.println("+---+---+---+");
						System.out.println("| " + tablero[1][0] + " | " + tablero[1][1] + " | " + tablero[1][2] + " |");
						System.out.println("+---+---+---+");
						System.out.println("| " + tablero[2][0] + " | " + tablero[2][1] + " | " + tablero[2][2] + " |");
						System.out.println("+---+---+---+");
					}
				break;
					
				case 8:
					if (turno %2 == 0) {
						tablero[2][1] = j2;
						System.out.println("+---+---+---+");
						System.out.println("| " + tablero[0][0] + " | " + tablero[0][1] + " | " + tablero[0][2] + " |");
						System.out.println("+---+---+---+");
						System.out.println("| " + tablero[1][0] + " | " + tablero[1][1] + " | " + tablero[1][2] + " |");
						System.out.println("+---+---+---+");
						System.out.println("| " + tablero[2][0] + " | " + tablero[2][1] + " | " + tablero[2][2] + " |");
						System.out.println("+---+---+---+");
					}else {
						tablero[2][1] = j1;
						System.out.println("+---+---+---+");
						System.out.println("| " + tablero[0][0] + " | " + tablero[0][1] + " | " + tablero[0][2] + " |");
						System.out.println("+---+---+---+");
						System.out.println("| " + tablero[1][0] + " | " + tablero[1][1] + " | " + tablero[1][2] + " |");
						System.out.println("+---+---+---+");
						System.out.println("| " + tablero[2][0] + " | " + tablero[2][1] + " | " + tablero[2][2] + " |");
						System.out.println("+---+---+---+");
					}
				break;
					
				case 9:
					if (turno %2 == 0) {
						tablero[2][2] = j2;
						System.out.println("+---+---+---+");
						System.out.println("| " + tablero[0][0] + " | " + tablero[0][1] + " | " + tablero[0][2] + " |");
						System.out.println("+---+---+---+");
						System.out.println("| " + tablero[1][0] + " | " + tablero[1][1] + " | " + tablero[1][2] + " |");
						System.out.println("+---+---+---+");
						System.out.println("| " + tablero[2][0] + " | " + tablero[2][1] + " | " + tablero[2][2] + " |");
						System.out.println("+---+---+---+");
					}else {
						tablero[2][2] = j1;
						System.out.println("+---+---+---+");
						System.out.println("| " + tablero[0][0] + " | " + tablero[0][1] + " | " + tablero[0][2] + " |");
						System.out.println("+---+---+---+");
						System.out.println("| " + tablero[1][0] + " | " + tablero[1][1] + " | " + tablero[1][2] + " |");
						System.out.println("+---+---+---+");
						System.out.println("| " + tablero[2][0] + " | " + tablero[2][1] + " | " + tablero[2][2] + " |");
						System.out.println("+---+---+---+");
					}
				break;
				
				default:
					System.out.println("Tienes que introducir un número del 1 al 9. El 0 es para salir.");
				break;
			}
			
			//Evaluará si se cumple alguna condición de victoria
			Victoria(posicion, tablero, turno, j1, j2);
			turno ++;
				
			//Evalúa de quién es el turno siguiente
			if (turno %2 == 0) {
					System.out.println("\n*********\n -> Turno de " +j2 +" <-");
				}else {
					System.out.println("\n*********\n -> Turno de " +j1+" <-");
			}
				
			//Evalúa que no haya empate (porque se acaben los movimientos) y en caso contrario continúa el juego
			if(turno>9) {
				System.out.println("******\nEmpate!\n******");
				posicion = 0;
			}else {
				System.out.println("\nIntroduce una nueva posición:");
				System.out.println("Para salir del juego introduzca 0");
				posicion = Integer.parseInt(br.readLine());
			}
		}
	}//Fin metodo Juego
	
	
	
	//Metodo por el que se evalúa las condiciones de victoria
	public static void Victoria(int posicion, char [][] tablero, int turno, char j1, char j2) {
			
			if 	   ((tablero[0][0] == j1 && tablero[0][1] == j1 && tablero[0][2] == j1) ||  
					(tablero[1][0] == j1 && tablero[1][1] == j1 && tablero[1][2] == j1) ||  
					(tablero[2][0] == j1 && tablero[2][1] == j1 && tablero[2][2] == j1) ||  
					                                                                       
					(tablero[0][0] == j1 && tablero[1][0] == j1 && tablero[2][0] == j1) ||  
					(tablero[0][1] == j1 && tablero[1][1] == j1 && tablero[2][1] == j1) ||  
					(tablero[0][2] == j1 && tablero[1][2] == j1 && tablero[2][2] == j1) ||  
					                                                                       
					(tablero[0][0] == j1 && tablero[1][1] == j1 && tablero[2][2] == j1) ||  
					(tablero[2][0] == j1 && tablero[1][1] == j1 && tablero[0][2] == j1)){
					
					System.out.println("¡El jugador " + j1 + " ha ganado!");
					System.out.println("¡Fin del juego!");
					System.exit(0); //ya que el juego se acaba y el número reservado para el fin del juego es el 0
					
			}else if((tablero[0][0] == j2 && tablero[0][1] == j2 && tablero[0][2] == j2) ||
	                (tablero[1][0] == j2 && tablero[1][1] == j2 && tablero[1][2] == j2) ||
	                (tablero[2][0] == j2 && tablero[2][1] == j2 && tablero[2][2] == j2) ||
	                                                                                     
	                (tablero[0][0] == j2 && tablero[1][0] == j2 && tablero[2][0] == j2) ||
	                (tablero[0][1] == j2 && tablero[1][1] == j2 && tablero[2][1] == j2) ||
	                (tablero[0][2] == j2 && tablero[1][2] == j2 && tablero[2][2] == j2) ||
	                                                                                     
	                (tablero[0][0] == j2 && tablero[1][1] == j2 && tablero[2][2] == j2) ||
	                (tablero[2][0] == j2 && tablero[1][1] == j2 && tablero[0][2] == j2)){
				
					System.out.println("¡El jugador " + j2 + " ha ganado!");
					System.out.println("¡Fin del juego!");
					System.exit(0); 
				
			}
														/*
															  Condiciones de victoria:
														 tablero[0][0] + tablero[0][1] + tablero[0][2]
														 tablero[1][0] + tablero[1][1] + tablero[1][2]
														 tablero[2][0] + tablero[2][1] + tablero[2][2]
														 
														 tablero[0][0] + tablero[1][0] + tablero[2][0]
														 tablero[0][1] + tablero[1][1] + tablero[2][1]
														 tablero[0][2] + tablero[1][2] + tablero[2][2]
														
														 tablero[0][0] + tablero[1][1] + tablero[2][2]
														 tablero[2][0] + tablero[1][1] + tablero[0][2]
														*/
				
	}//Fin metodo Victoria
		
		
}//Fin Main
