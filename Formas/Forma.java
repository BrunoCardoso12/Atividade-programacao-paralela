package Formas;

public abstract class Forma implements Shape{
	
	
	private String nome;
	private int dimensao;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getDimensao() {
		return dimensao;
	}
	public void setDimensao(int dimensao) {
		this.dimensao = dimensao;
	}
	@Override
	public String toString() {
		return "nome=" + nome + ", dimensao=" + dimensao;
	}
	
	
}
