package piramide;

public class Piramide {
	
	private int altura;
	private char simbolo;
	
	public Piramide(int altura, char simbolo) {
		this.altura = altura;
		this.simbolo = simbolo;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public char getSimbolo() {
		return simbolo;
	}

	public void setSimbolo(char simbolo) {
		this.simbolo = simbolo;
	}

	@Override
	public String toString() {
		return "Piramide [altura=" + altura + ", simbolo=" + simbolo + "]";
	}

	
}
