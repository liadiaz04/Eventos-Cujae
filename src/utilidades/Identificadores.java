package utilidades;

public class Identificadores {
	
	private final String cadCientifico = "CI";
	private final String cadCultural = "CU";
	private final String cadDeportivo = "DE";
	private final String cadPolitico = "PO";
	private final String cadRecreativo = "RE";
	private final String cadOtro = "O";
	private int numCien;
	private int numCult;
	private int numDep;
	private int numPol;
	private int numRecre;
	private int numOtro;
	private static Identificadores idens;
	
	private Identificadores(){
		this.numCien=0;
		this.numCult=0;
		this.numDep=0;
		this.numPol=0;
		this.numRecre=0;
		this.numOtro=0;
	}
	
	public static Identificadores getIdens(){
		if(idens==null)
		{
			idens = new Identificadores();
		}
		return idens;
	}
	
	public String hacerId(String tipo){
		String x=null;
		
		 if(tipo.equals("Cientifico")){
			x=cadCientifico + (getNumCien()+1);
			setNumCien((getNumCien()+1));
		 }
		 else
			 if(tipo.equals("Cultural")){
				 x=cadCultural + (getNumCult()+1);
				 setNumCult((getNumCien()+1));
			 	}
			 else
				 if(tipo.equals("Deportivo")){
					 x=cadDeportivo + (getNumDep()+1);
					 setNumDep((getNumDep()+1));
				 }
				 else
					 if(tipo.equals("Politico")){
						 x=cadPolitico + (getNumPol()+1);
						 setNumPol((getNumPol()+1));
					 }
					 else
						 if(tipo.equals("Recreativo")){
							 x=cadRecreativo + (getNumRecre()+1);
							 setNumRecre(getNumRecre()+1);
						 }
						 else
						 {
							 x=cadOtro + (getNumOtro()+1);
							 setNumOtro((getNumOtro()+1));
						 }
		
		
		return x;
	}

	public int getNumCien() {
		return numCien;
	}

	public void setNumCien(int numCien) {
		this.numCien = numCien;
	}

	public int getNumDep() {
		return numDep;
	}

	public void setNumDep(int numDep) {
		this.numDep = numDep;
	}

	public int getNumPol() {
		return numPol;
	}

	public void setNumPol(int numPol) {
		this.numPol = numPol;
	}

	public int getNumRecre() {
		return numRecre;
	}

	public void setNumRecre(int numRecre) {
		this.numRecre = numRecre;
	}

	public int getNumCult() {
		return numCult;
	}

	public void setNumCult(int numCult) {
		this.numCult = numCult;
	}

	public int getNumOtro() {
		return numOtro;
	}

	public void setNumOtro(int numOtro) {
		this.numOtro = numOtro;
	}
}
