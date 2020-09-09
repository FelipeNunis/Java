package Recurso;

public class Instrumentos {

	/* atributos + método de acesso */
	private double preco;
	private String nome; 
	private String cor;
	private String categoria;
	private String afinacao;
	
	
	/* getter e setter */
	public double getPreco() {
		return this.preco;
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
	
	public String getAfinacao() {
		return this.afinacao;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
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
	
	public void setProfissao(String afinacao) {
		this.afinacao = afinacao;
	}
	
	/* métodos */
	void exibirNome() {
		System.out.println(nome);
	}
	void exibirAltura() {
		System.out.println(preco);
	}
	void exibirCor() {
		System.out.println(cor);
	}
	
	/* construtores */
	
	public Instrumentos () {
		
	}

	public Instrumentos(double preco, String nome, String cor){
		
		this.preco = preco;
		this.nome = nome;
		this.cor = cor;

	}
	
	public Instrumentos(double preco, String nome, String cor, String categoria){
		
		this.preco = preco;
		this.nome = nome;
		this.cor = cor;
		this.categoria = categoria;
		this.afinacao = "Afinado";
		
	}
	
}
