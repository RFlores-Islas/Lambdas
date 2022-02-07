package interfazfuncional;

public class TestLambdas {
	public static void main(String []args) {
		int x = 10;
		int y = 15;
		IFuncionLambda iFuncionLambda = (a, b) -> {System.out.println(a + b);};
		iFuncionLambda.suma(x, y);
	}//FIN METODO

}//FIN CLASE
