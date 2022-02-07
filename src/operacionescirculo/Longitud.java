package operacionescirculo;

public class Longitud extends Calcular{
	//PROPIEDADES
	private Double longitud;
	
	@Override
	public double calcular() {
		longitud = 2 * Math.PI * getRadio();
		return longitud;
	}//FIN METODO

}//FIN CLASE
