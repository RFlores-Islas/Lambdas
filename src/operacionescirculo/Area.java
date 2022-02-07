package operacionescirculo;

public class Area extends Calcular{
	//PROPIEDADES
	private Double area;

	@Override
	public double calcular() {
		area = Math.PI * Math.pow(getRadio(), 2);
		return area;
	}//FIN METODO
}//FIN CLASE
