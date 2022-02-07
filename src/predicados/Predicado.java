package predicados;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Predicado {
	
	public static void evaluar(List<Integer> listaNumeros, Predicate<Integer> predicado) {
		for(Integer numero: listaNumeros) {
			if (predicado.test(numero)) {
				System.out.println(numero + " ");
			}//FIN IF
		}//FIN FOR
	}//FIN METODO
	
	public static void main(String []args) {
		List<Integer> listaNumeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		System.out.println("Numeros pares");
		evaluar(listaNumeros, (numero)-> numero % 2 == 0);
		
		System.out.println("Numeros impares");
		evaluar(listaNumeros, (numero)-> numero % 2 == 1);
		
		System.out.println("Numeros mayores a 5");
		evaluar(listaNumeros, (numero)-> numero > 5);
	}//FIN METODO

}//FIN CLASE
