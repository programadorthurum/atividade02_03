package atividade02_03;

public class Terrrestre extends MeioDeTransporte {

	private int qtdeRodas;
	private double potencia;

	public Terrrestre() {

	}

	public Terrrestre(int id, short ano, String modelo, double carga_Maxima) {

	}

	public int getQtdeRodas() {
		return qtdeRodas;
	}

	public void setQtdeRodas(int qtdeRodas) {
		this.qtdeRodas = qtdeRodas;
	}

	public double getPotencia() {
		return potencia;
	}

	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}

	@Override
	public double consumo() {
		return this.potencia * this.getCargaMaxima() * 100;
	}

}
