package ecuacionsegundogrado;

import java.util.Scanner;

public class EcuacionSegundoGrado {
	static Double a;
	static Double b;
	static Double c;
	static Double raiz;
	static Double resultadoPositivo;
	static Double resultadoNegativo;
	
	public static void valoresEcuacion(Double a, Double b, Double c) {
		
		raiz = (Math.sqrt(Math.pow(b, 2) - 4 * a * c));
		
		if (raiz < 0) {
			System.out.println("La ecuacion no tiene solución");
		} else {
			resultadoPositivo = (((b) * -1.0) + raiz) / (2*a);
			resultadoNegativo = (((b) * -1.0) - raiz) / (2*a);
			System.out.println("x1: " + resultadoPositivo);
			System.out.println("x2: " + resultadoNegativo);
		}//FIN ELSE 
	}//FIN METODO
		
	public static void main (String []args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresa el valor para a: ");
		a = entrada.nextDouble();
		System.out.println("Ingresa el valor para b: ");
		b = entrada.nextDouble();
		System.out.println("Ingresa el valor para c: ");
		c = entrada.nextDouble();
		
		valoresEcuacion(a, b, c);
	}//FIN METODO
}//FIN CLASE
