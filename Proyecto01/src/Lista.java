
public class Lista {
	private Nodo inicio;
	private Nodo multi;

	public String resultadoSuma(Lista a, Lista b) throws ListaVaciaException{
		Lista aux1 = new Lista();
		Lista aux2 = new Lista();
		String aux = " ";
		try {
			aux1= aux1.copiar(a);
			aux2 = aux2.copiar(b);
			aux1.sumar(aux1, aux2);
			
			aux = aux1.convertir(aux1);
		} catch (ElementoNoEncontradoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return aux;
		
	}

	public String resultadoResta(Lista a, Lista b) throws ListaVaciaException{
		Lista aux1 = new Lista();
		Lista aux2 = new Lista();
		String aux = " ";
		try {
			aux1= aux1.copiar(a);
			aux2 = aux2.copiar(b);
			aux1.resta(aux1, aux2);
			
			aux = aux1.convertir(aux1);
		} catch (ElementoNoEncontradoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return aux;
		
	}

	
	public String resultadoMulti(Lista a, Lista b) throws ListaVaciaException{
		Lista aux1 = new Lista();
		Lista aux2 = new Lista();
	//	Lista aux3 = new Lista();
		String aux = " ";
		try {
			Lista aux3 = new Lista();
			aux1= aux1.copiar(a);
			aux1.mostrar();
			aux2 = aux2.copiar(b);
			aux2.mostrar();
			aux2.multiplicar(aux1, aux2);
			aux3 = aux2;
			aux = aux3.convertir(aux3);
			System.out.printf("%s", aux);
		} catch (ElementoNoEncontradoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return aux;
		
	}
	
	public void insertar(Integer coef, Integer exp){
		Nodo nuevo = new Nodo();
		Monomio monomio = new Monomio();
		monomio.setCoeficiente(coef);
		monomio.setExponente(exp);
		nuevo.setDato(monomio);			
		
		if(inicio == null){
			inicio=nuevo;
		}	
		else{
			nuevo.setSiguiente(inicio);
			inicio=nuevo;
		}	
	}
	
	
	public Lista copiar(Lista a) throws ListaVaciaException {
		//inicio = null;
		Nodo aux = a.inicio;
		Lista lis = new Lista();
		if(aux==null)throw new ListaVaciaException();
			while(aux != null){		
				if(aux.getDato().getCoeficiente()!=0){
					Monomio auxMon = new Monomio();
					
					auxMon.setCoeficiente(aux.getDato().getCoeficiente());
					auxMon.setExponente(aux.getDato().getExponente());
					
					Integer coef = auxMon.getCoeficiente();
					Integer expo = auxMon.getExponente();
				
					lis.insertar(coef, expo);		
				}
				
				aux=aux.getSiguiente();
			}
			//lis.mostrar();
			return lis;
	}
	
	
	
	
	public void simplificar() throws ListaVaciaException, ElementoNoEncontradoException{
		Nodo aux = inicio;
		Monomio resultado = new Monomio();
		Lista res = new Lista();
		Nodo actual = new Nodo();
		actual = aux;
		if(inicio == null) throw new ListaVaciaException();
		
		while(actual!=null){			
			aux = actual.getSiguiente();
			while (aux!=null){
				if (actual.getDato().getExponente() == aux.getDato().getExponente()){
					actual.getDato().setCoeficiente(aux.getDato().getCoeficiente() + actual.getDato().getCoeficiente());
					aux.getDato().setCoeficiente(0);
					
										
				}
				aux = aux.getSiguiente();				
			}			
				actual = actual.getSiguiente();
					
		}	
			
	}
	
	
	public void sumar(Lista a1, Lista b1) throws ListaVaciaException, ElementoNoEncontradoException{
		
		
		Nodo aux = a1.inicio;
		Nodo aux2 = b1.inicio;
		Lista lisAux = new Lista();
		
		if(a1.inicio == null) throw new ListaVaciaException();
		if(b1.inicio == null) throw new ListaVaciaException();
		
		while(aux!=null){
			while(aux2!=null){
				if(aux.getDato().getExponente() == aux2.getDato().getExponente()){
					aux.getDato().setCoeficiente(aux2.getDato().getCoeficiente() + aux.getDato().getCoeficiente());
					aux2.getDato().setCoeficiente(0);
				}
				aux2 = aux2.getSiguiente();
			}
			aux2=b1.inicio;
			aux = aux.getSiguiente();
		}

		lisAux = a1;
		lisAux.simplificar();
		lisAux.ordenarPolinomio();
		//lisAux.mostrar();
		
	}
	
	public void resta(Lista a1, Lista b1) throws ListaVaciaException, ElementoNoEncontradoException{
		
		Nodo aux = a1.inicio;
		Nodo aux2 = b1.inicio;
		Lista lisAux = new Lista();
		
		if(a1.inicio == null) throw new ListaVaciaException();
		if(b1.inicio == null) throw new ListaVaciaException();
		
		while(aux!=null){
			while(aux2!=null){
				if(aux.getDato().getExponente() == aux2.getDato().getExponente()){
					aux2.getDato().setCoeficiente(aux2.getDato().getCoeficiente()*-1);
					
					aux.getDato().setCoeficiente(aux.getDato().getCoeficiente() + aux2.getDato().getCoeficiente());
					
					aux2.getDato().setCoeficiente(0);
				}
				
				aux2 = aux2.getSiguiente();
			}
			aux2=b1.inicio;
			aux = aux.getSiguiente();			
		}
		lisAux = a1;
		lisAux.simplificar();
		lisAux.ordenarPolinomio();
		lisAux.mostrar();
	}
	
	public String multiplicar(Lista a1 , Lista b1) throws ListaVaciaException, ElementoNoEncontradoException{
		
		Nodo aux = a1.inicio;
		Nodo aux2 = b1.inicio;
		
		Lista lisAux = new Lista();
		Lista lis2 = new Lista();
		//Nodo aux3 = new Nodo();
		if(a1.inicio == null) throw new ListaVaciaException();
		if(b1.inicio == null) throw new ListaVaciaException();
		while(aux!=null){
			while(aux2!=null){
				
				Monomio auxMon = new Monomio();
				
				auxMon.setCoeficiente(aux.getDato().getCoeficiente() * aux2.getDato().getCoeficiente());
				auxMon.setExponente(aux.getDato().getExponente() + aux2.getDato().getExponente());
				
				Integer coef = auxMon.getCoeficiente();
				Integer expo = auxMon.getExponente();
			
				lis2.insertar(coef, expo);			
				aux2 = aux2.getSiguiente();
				
			}
			aux2= b1.inicio;
			aux = aux.getSiguiente();
		}
		lisAux =lis2;
		lisAux.simplificar();
		lisAux.ordenarPolinomio();
		return lisAux.mostrar2();
		//lisAux.convertir(lisAux);

	}
		
	
	public String mostrar2() throws ListaVaciaException {
		String all="";;
		Nodo aux = inicio;
		if(aux==null) throw new ListaVaciaException();
			while(aux != null){		
				if(aux.getDato().getCoeficiente()!=0){
				//	System.out.printf("%s, ", aux.getDato());
					all +=", "+  String.valueOf(aux.getDato());
				}
				
				aux=aux.getSiguiente();
			}
		return all;	
	}
	
	public void mostrar() throws ListaVaciaException {
		
		Nodo aux = inicio;
		if(aux==null) throw new ListaVaciaException();
			while(aux != null){		
				if(aux.getDato().getCoeficiente()!=0){
					System.out.printf("%s, ", aux.getDato());
				}
				
				aux=aux.getSiguiente();
			}
	}
	
	
	public void ordenarPolinomio() throws ListaVaciaException {
		if (inicio == null) {
			throw new ListaVaciaException();

		}

		Nodo aux = inicio;
		Nodo aux2 = null;
		Integer auxCoeficiente = 0;
		Integer auxExponente = 0;

		while (aux != null) {
			aux2 = aux.getSiguiente();
			while (aux2 != null) {

				if (aux.getDato().getExponente() < aux2.getDato().getExponente()) {
					auxCoeficiente = aux.getDato().getCoeficiente();
					auxExponente = aux.getDato().getExponente();
					aux.getDato().setCoeficiente(aux2.getDato().getCoeficiente());
					aux.getDato().setExponente(aux2.getDato().getExponente());
					aux2.getDato().setCoeficiente(auxCoeficiente);
					aux2.getDato().setExponente(auxExponente);

				}
				aux2 = aux2.getSiguiente();
			}
			aux = aux.getSiguiente();
		}

	}
	
	public String convertir(Lista a) throws ListaVaciaException{
		
		Nodo aux = a.inicio;
		String res ="";
	//	int x;
		if(aux==null) throw new ListaVaciaException();
			while(aux != null){		
				if(aux.getDato().getCoeficiente()!=0){
					aux.getDato();
					res = res +", "+ aux.getDato();
					//System.out.printf("%s, ", aux.getDato());
				}
				
				aux=aux.getSiguiente();
			}
		return res;
		
	}
}
