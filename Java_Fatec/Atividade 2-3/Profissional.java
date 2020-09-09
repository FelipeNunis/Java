package Recurso;

public class Profissional {
	
	/* atributos + método de acesso */
	private double salario;
	private double faltas;
	private String nome;
	private String tarefa;
	private double altura;
	
	/* getter e setter */
	public double getSalario() {
		return this.salario;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getTarefa() {
		return this.tarefa;
	}
	
	public double getFaltas() {
		return this.faltas;
	}
	
	public double getAltura() {
		return this.altura;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setFaltas(double faltas) {
		this.faltas = faltas;
	}
	
	public void setTarefa(String tarefa) {
		 this.tarefa = tarefa;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	/* métodos */
	void exibirNome() {
		System.out.println(nome);
	}
	void exibirSalario() {
		System.out.println(salario);
	}
	void exibirFaltas() {
		System.out.println(faltas);
	}
	
/* construtores */
	
	public Profissional () {
		
	}

	public Profissional(double salario, String nome, double faltas){
		
		this.salario = salario;
		this.nome = nome;
		this.faltas = faltas;

	}
	
	public Profissional(double salario, String nome, String tarefa, double faltas){
		
		this.salario = salario;
		this.nome = nome;
		this.tarefa = tarefa;
		this.faltas = faltas;
		this.altura = 1.60;
		
	}

}
