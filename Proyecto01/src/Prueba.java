
public class Prueba {
	public static void main(String ...  args) throws ListaVaciaException {
		Lista lista = new Lista();
		Lista lista2 = new Lista();
		Lista lisAux1 = new Lista();
		Lista lisAux2 = new Lista();
		//Lista lista5 = new Lista();
		Monomio mon = new Monomio();
	//	Lista res = new Lista();
	
		lista.insertar(12, 2);
		lista.insertar(-5, 1);
		lista.insertar(2, 1);
		lista.insertar(10, 3);
		
		lista2.insertar(-1, 2);
		lista2.insertar(8, 3);
		lista2.insertar(-13, 1);
		lista2.insertar(-5, 2);

		//lista2.insertar(coef, exp);

		System.out.printf("\n Polinomio1: ");
		
		lista.mostrar();
		System.out.printf("\n Polinomio2: ");
		lista2.mostrar();
		
		System.out.printf("\n Simplificacion ");
		
		try {
			lisAux1 = lisAux1.copiar(lista);
		//	
			lisAux1.simplificar();
			lisAux1.mostrar();
			//lisAux1.ordenarPolinomio();
			
		//	lista.mostrar();
		} catch (ElementoNoEncontradoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.printf("\n Resta: ");
		try {
			lisAux1= lisAux1.copiar(lista);
			lisAux2 = lisAux2.copiar(lista2);
			lisAux1.resta(lisAux1, lisAux2);
			//lista.simplificar();
			//lista.ordenarPolinomio();
			//lista.mostrar();*/
		} catch (ElementoNoEncontradoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		System.out.printf("\n Suma: ");
		try {
			lisAux1 = lisAux1.copiar(lista);
			lisAux2 = lisAux2.copiar(lista2);
			lisAux1.sumar(lisAux1, lisAux2);
			lisAux1.mostrar();
			String n = lisAux1.convertir(lisAux1);
			System.out.printf("cadena: %s ", n);
			
		} catch (ElementoNoEncontradoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.printf("\n Multiplicacion: ");
		try {
			lisAux1.copiar(lista);
			lisAux2.copiar(lista2);
			//lista.mostrar();
			lisAux1.multiplicar(lista, lista2);
			//lista.simplificar();
			//lista.ordenarPolinomio();
			//lista.mostrar();
		} catch (ElementoNoEncontradoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	}
}