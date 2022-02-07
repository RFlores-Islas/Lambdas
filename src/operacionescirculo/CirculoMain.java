package operacionescirculo;

public class CirculoMain {
	
	public static void main(String []args) {
		Calcular area = new Area();
		Calcular longitud = new Longitud();
		
		area.setRadio(6.0);
		System.out.println("El area del circulo es: " + area.calcular());
		longitud.setRadio(6.0);
		System.out.println("La longitud del circulo es: " + longitud.calcular());
		
	}//FIN METODO

}//FIN CLASE
