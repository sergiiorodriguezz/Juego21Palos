package Juego;

import java.util.Scanner;


public class JuegoDeLosPalos {

    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);

        System.out.println("Comienza el juego.");
        
        int palos = 21;

        while (palos > 0) {
        	
            int palosCogidos = 0;

            while (palosCogidos < 1 || palosCogidos > 4) {
            	
                System.out.print("Elige cuántos palos tomar entre 1 y 4: ");
                
                palosCogidos = scanner.nextInt();

                if (palosCogidos < 1 || palosCogidos > 4) {
                	
                    System.out.println("Tienes que elegir obligatoriamente un número entre 1 y 4");
                }
            }

            palos -= palosCogidos;
            
            System.out.println("Palos restantes: " + palos);

            if (palos == 0) {
            	
                System.out.println("Has perdido");
                
                break;
            }

            int palosIA = 5 - palosCogidos;
            
            System.out.println("La IA elige  " + palosIA + " palos.");

            palos -= palosIA;
            
            System.out.println("Palos restantes: " + palos);

            if (palos == 0) {
            	
                System.out.println("La IA ha ganado.");
                
                break;
            }
        }
    }
}

