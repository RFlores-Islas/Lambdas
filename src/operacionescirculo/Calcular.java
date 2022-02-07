package operacionescirculo;

public abstract class Calcular {
	//PROPIEDADES
	private Double radio;

	public Double getRadio() {
		return radio;
	}//FIN METODO

	public void setRadio(Double radio) {
		this.radio = radio;
	}//FIN METODO
	
	public abstract double calcular();

}//FIN CLASE
