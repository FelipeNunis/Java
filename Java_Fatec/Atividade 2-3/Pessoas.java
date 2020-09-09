package Recurso;

public class Pessoas {
	
	/* atributos + método de acesso */
	private double altura;
	private String nome;
	private String cor;
	private String sexo;
	private String profissao;
	
	
	/* getter e setter */
	public double getAltura() {
		return this.altura;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getCor() {
		return this.cor;
	}
	
	public String getSexo() {
		return this.sexo;
	}
	
	public String getProfissao() {
		return this.profissao;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public void setSexo(String sexo) {
		 this.sexo = sexo;
	}
	
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	
	/* métodos */
	void exibirNome() {
		System.out.println(nome);
	}
	void exibirAltura() {
		System.out.println(altura);
	}
	void exibirCor() {
		System.out.println(cor);
	}
	
	/* construtores */
	
	public Pessoas () {
		
	}

	public Pessoas(double altura, String nome, String cor){
		
		this.altura = altura;
		this.nome = nome;
		this.cor = cor;

	}
	
	public Pessoas(double altura, String nome, String cor, String sexo){
		
		this.altura = altura;
		this.nome = nome;
		this.cor = cor;
		this.sexo = sexo;
		this.profissao = "Estudante";
		
	}
	
	
}