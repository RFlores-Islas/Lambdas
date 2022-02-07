package numerosiguales;

public class Comparacion {
	
	public static void main(String []args) {
		Funcion comparacion = ((int a, int b) -> {
			if (a == b) {
				return true;
			}
			return false;
		});
		System.out.println(comparacion.comparar(5, 6));
	}//FIN METODO
	
}//FIN CLASE
