package Recurso;

public class Alunofatec {
	/* atributos + método de acesso */
	private double nota;
	private double faltas;
	private String nome;
	private String tarefa;
	private double altura;
	
	/* getter e setter */
	public double getNota() {
		return this.nota;
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
	
	public void setNota(double nota) {
		this.nota = nota;
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
	void exibirNota() {
		System.out.println(nota);
	}
	void exibirFaltas() {
		System.out.println(faltas);
	}
	
/* construtores */
	
	public Alunofatec () {
		
	}

	public Alunofatec(double nota, String nome, double faltas){
		
		this.nota = nota;
		this.nome = nome;
		this.faltas = faltas;

	}
	
	public Alunofatec(double nota, String nome, String tarefa, double faltas){
		
		this.nota = nota;
		this.nome = nome;
		this.tarefa = tarefa;
		this.faltas = faltas;
		this.altura = 1.60;
		
	}
}
