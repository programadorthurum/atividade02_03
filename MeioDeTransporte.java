package atividade02_03;

public abstract class MeioDeTransporte {

	private int id;
	private short ano;
	private String modelo;
	private double carga_Maxima;

	public MeioDeTransporte() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public short getAno() {
		return ano;
	}

	public void setAno(short ano) {
		this.ano = ano;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getCargaMaxima() {
		return carga_Maxima;
	}

	public void setCarga_Maxima(double carga_Maxima) {
		this.carga_Maxima = carga_Maxima;
	}

	
	public abstract double consumo();

}
