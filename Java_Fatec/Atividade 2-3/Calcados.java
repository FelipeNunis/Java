package Recurso;

public class Calcados {
	
	/* atributos + método de acesso */
	private double tamanho;
	private String nome;
	private String cor;
	private String categoria;
	private String cheiro;
	
	
	/* getter e setter */
	public double getTamanho() {
		return this.tamanho;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getCor() {
		return this.cor;
	}
	
	public String getCategoria() {
		return this.categoria;
	}
	
	public String getCheiro() {
		return this.cheiro;
	}
	
	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public void setCategoria(String categoria) {
		 this.categoria = categoria;
	}
	
	public void setCheiro(String cheiro) {
		this.cheiro = cheiro;
	}
	
	/* métodos */
	void exibirNome() {
		System.out.println(nome);
	}
	void exibirCor() {
		System.out.println(cor);
	}
	void exibirTamanho() {
		System.out.println(tamanho);
	}
	
	/* construtores */
	
	public Calcados () {
		
	}

	public Calcados(double altura, String nome, String cor){
		
		this.tamanho = altura;
		this.nome = nome;
		this.cor = cor;

	}
	
	public Calcados(double altura, String nome, String cor, String categoria){
		
		this.tamanho = altura;
		this.nome = nome;
		this.cor = cor;
		this.categoria = categoria;
		this.cheiro = "Chulé";
		
	}
}
