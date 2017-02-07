
public class Monomio {
	private Integer coeficiente;
	private Integer exponente;
	
	
	public Integer getCoeficiente() {
		return coeficiente;
	}

	public void setCoeficiente(Integer coeficiente) {
		this.coeficiente = coeficiente;
	}


	public Integer getExponente() {
		return exponente;
	}

	public void setExponente(Integer exponente) {
		this.exponente = exponente;
	}
	
	
	public String toString(){
		return coeficiente + "x^" + exponente;
	}



	
	
	
}
