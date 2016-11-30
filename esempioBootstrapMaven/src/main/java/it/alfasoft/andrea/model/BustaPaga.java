package it.alfasoft.andrea.model;

import java.util.Date;

public class BustaPaga {
	
	private String nome;
	private String cognome;
	private Date dataEmissione;
	private double importo;
	
	public BustaPaga() {
		
	}
	
	

	public BustaPaga(String nome, String cognome, Date dataEmissione,
			double importo) {
		this.nome = nome;
		this.cognome = cognome;
		this.dataEmissione = dataEmissione;
		this.importo = importo;
	}



	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public Date getDataEmissione() {
		return dataEmissione;
	}

	public void setDataEmissione(Date dataEmissione) {
		this.dataEmissione = dataEmissione;
	}

	public double getImporto() {
		return importo;
	}

	public void setImporto(double importo) {
		this.importo = importo;
	}
	
	
	
	
	

}
