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
		
		//área y perímetro del círculo
		System.out.println("Introduce el radio de la circunferencia: ");
		int radio = entrada.nextInt();
		System.out.println("el area de la circunferencia es: "+calaACirc(radio));
		System.out.println("el perimetro de la circunferencia es : "+perimetroACirc(radio));
		
		//area cilindro
		System.out.println("Introduce la altura para el cilindro: ");
		int alturaCil = entrada.nextInt();
		
		System.out.println("Introduce la radio para el cilindro: ");
		int radioCil = entrada.nextInt();
		System.out.println("El área del cilindro es: " + areaCilindro(alturaCil, radioCil));
	
		//área del rectángulo
		System.out.println("introduce el lado 1 del rectangulo");
		int lado1rec=entrada.nextInt();
		System.out.println("introduce el lado 2 del rectangulo");
		int lado2rec=entrada.nextInt();
		System.out.println("El área del rectángulo es: " + areaRectangulo(lado1rec, lado2rec));
	}
	//funcion de triangulo
	public static double calcularArea(int base, int altura) {
		return base * altura / 2;

	//Alumno 2 calcula el área y el perímetro del círculo
    }public static double calaACirc(int radio) {
		double area = 3.14*(radio^2);
		return area;
		
	}public static double perimetroACirc(int radio) {
		double perimetro=2*(3.14*radio);
		return perimetro;
		
	}public static double areaCilindro(int alturaCil, int radioCil) {
		return 2*3.14* alturaCil + 2*3.14* radioCil;
		
	}public static double areaRectangulo(int lado1rec,int lado2rec) {
		return ((lado1rec*2) + (lado2rec*2));
	}

}
