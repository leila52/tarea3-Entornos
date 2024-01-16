package entornosTarea3;

import java.util.Scanner;

public class ejercicio {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		//pedimos la altura y la base del triangulo
		System.out.println("Introduce un altura: ");
		int altura = entrada.nextInt();
		System.out.println("Introduce otro base: ");
		int base = entrada.nextInt();
		System.out.println("el area del triangulo es : "+calcularArea(base,altura));
	}
	//funcion de triangulo
	public static double calcularArea(int base, int altura) {
		return base * altura / 2;
		}

}
