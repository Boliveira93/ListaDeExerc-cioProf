package br.com.senai.revisao;

import java.util.ArrayList;

public class Aeronave {
	
	private String modelo;
	private String fabricante;
	ArrayList<String>  listaAeronave = new ArrayList();
	
	
	
	public Aeronave(String modelo, String fabricante) {
		super();
		this.modelo = modelo;
		this.fabricante = fabricante;
	}
	
	
	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public String getFabricante() {
		return fabricante;
	}


	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}


	public String mostrarLetreiroDigital() {
		return "VoeAirlines Voando com você";
	}
	

}
