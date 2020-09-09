package Recurso;

public class Lugares {
	
	/* atributos + método de acesso */
	private double temperatura;
	private String pontoturistico;
	private String nome;
	private String conforto;
	private double tamanho;
	
	/* getter e setter */
	public double getTemperatura() {
		return this.temperatura;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getPontoturistico() {
		return this.pontoturistico;
	}
	
	public String getConforto() {
		return this.conforto;
	}
	
	public double getTamanho() {
		return this.tamanho;
	}
	
	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setPontoturistico(String pontoturistico) {
		this.pontoturistico = pontoturistico;
	}
	
	public void setConforto(String conforto) {
		 this.conforto = conforto;
	}
	
	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}
	
	/* métodos */
	void exibirNome() {
		System.out.println(nome);
	}
	void exibirConforto() {
		System.out.println(conforto);
	}
	void exibirTemperatura() {
		System.out.println(temperatura);
	}
	
/* construtores */
	
	public Lugares () {
		
	}

	public Lugares(double temperatura, String nome, String conforto){
		
		this.temperatura = temperatura;
		this.nome = nome;
		this.conforto = conforto;

	}
	
	public Lugares(double temperatura, String nome, String conforto, String pontoturistico){
		
		this.temperatura = temperatura;
		this.nome = nome;
		this.conforto = conforto;
		this.pontoturistico = pontoturistico;
		this.tamanho = 30000;
		
	}
}
