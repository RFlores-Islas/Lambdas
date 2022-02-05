package ecuacionsegundogrado;

import javax.swing.JOptionPane;

public class EcuacionSegundoGrado {
	static Double a;
	static Double b;
	static Double c;
	static Double raiz;
	static Double determinante;
	static Double resultadoPositivo;
	static Double resultadoNegativo;
	
	public static boolean determinante() {
		determinante = Math.pow(b, 2) - 4 * a * c;
		boolean valor = (determinante < 0) ? false : true;
		return valor;
	}//FIN METODO
	
	public static void valoresEcuacion(Double a, Double b, Double c) {
		if (!determinante()) {
			System.out.println("La ecuacion no tiene solución");
		} else {
			resultadoPositivo = (((b) * -1.0) + Math.sqrt(determinante)) / (2*a);
			resultadoNegativo = (((b) * -1.0) - Math.sqrt(determinante)) / (2*a);
			System.out.println("x1: " + resultadoPositivo);
			System.out.println("x2: " + resultadoNegativo);
		}//FIN ELSE

	}//FIN METODO
		
	public static void main (String []args) {
		a = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor para a: "));
		b = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor para b: "));
		c = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor para c: "));
		valoresEcuacion(a, b, c);
	}//FIN METODO
}//FIN CLASE
