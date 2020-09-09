package Recurso;

public class Teste {

	public static void main(String[] args) {
		
		Pessoas [] pessoa = new Pessoas[5];
		pessoa[0] = new Pessoas(1.73 , "Maria", "Preto");
		pessoa[1] = new Pessoas(0.75, "Júlio", "Pardo");
		pessoa[2] = new Pessoas(2.90, "Amanda", "Amarelo");
		pessoa[3] = new Pessoas(1.85,"Marcio", "Branco", "M");
		pessoa[4] = new Pessoas();
		
		Lugares [] lugar = new Lugares[5];
		lugar[0] = new Lugares(17.3 , "Alemanha", "Confortavel");
		lugar[1] = new Lugares(75, "São Paulo", "Confortavel");
		lugar[2] = new Lugares(290, "Santo André", "Desconfortavel");
		lugar[3] = new Lugares(15,"Nova Iorque", "Desconfotavel", "Estátua da liberdade");
		lugar[4] = new Lugares();
		
		Alunofatec [] aluno = new Alunofatec[5];
		aluno[0] = new Alunofatec(17.3 , "Carlos", 4);
		aluno[1] = new Alunofatec(75, "Patricia", 8);
		aluno[2] = new Alunofatec(290, "Julia", 8);
		aluno[3] = new Alunofatec(15,"Mônica", "Matemática", 7);
		aluno[4] = new Alunofatec();
		
		Instrumentos [] instrumento = new Instrumentos[5];
		instrumento[0] = new Instrumentos(173 , "Violino", "Branco");
		instrumento[1] = new Instrumentos(75, "Oboé", "Rosa");
		instrumento[2] = new Instrumentos(290, "Guitarra", "Marrom");
		instrumento[3] = new Instrumentos(1587,"Piano", "Roxo", "Cordas Percussivas");
		instrumento[4] = new Instrumentos();
		
		Calcados [] calcado = new Calcados[5];
		calcado[0] = new Calcados(17 , "Crocs", "Branco");
		calcado[1] = new Calcados(75, "Allstar", "Rosa");
		calcado[2] = new Calcados(20, "Salto alto", "Marrom");
		calcado[3] = new Calcados(87,"Chinelo", "Roxo", "Chinelo");
		calcado[4] = new Calcados();
		
		Profissional [] funcionario = new Profissional[5];
		funcionario[0] = new Profissional(17213 , "Carlos", 4);
		funcionario[1] = new Profissional(725, "Patricia", 84);
		funcionario[2] = new Profissional(290, "Julia", 8);
		funcionario[3] = new Profissional(15,"Mônica", "Demitir", 7);
		funcionario[4] = new Profissional();
		
		
		
		for(int i=0; i < 5; i++) {
			System.out.println("nome:"+" \t" + pessoa[i].getNome() +" \t" + "Altura:" +" \t" + pessoa[i].getAltura() + " \t" + "Sexo:" +" \t" + pessoa[i].getSexo() + " \t" + "Profissão:" +" \t" + pessoa[i].getProfissao() +" \t" + "Cor:" + pessoa[i].getCor());
			System.out.println("nome:"+" \t" + lugar[i].getNome() +" \t" + "Temperatura:" +" \t" + lugar[i].getTemperatura() + " \t" + "Conforto:" +" \t" + lugar[i].getConforto() + " \t" + "Ponto Turístico:" +" \t" + lugar[i].getPontoturistico());
			System.out.println("nome:"+" \t" + aluno[i].getNome() +" \t" + "Faltas:" +" \t" + aluno[i].getFaltas() + " \t" + "Tarefa:" +" \t" + aluno[i].getTarefa() + " \t" + "Altura:" +" \t" + aluno[i].getAltura());
			System.out.println("nome:"+" \t" + instrumento[i].getNome() +" \t" + "Cor:" +" \t" + instrumento[i].getCor() + " \t" + "Preço:" +" \t" + instrumento[i].getPreco() + " \t" + "Categoria:" +" \t" + instrumento[i].getCategoria() + " \t" + "Afinação:" +" \t" + instrumento[i].getAfinacao());
			System.out.println("nome:"+" \t" + calcado[i].getNome() +" \t" + "Cor:" +" \t" + calcado[i].getCor() + " \t" + "Tamanho:" +" \t" + calcado[i].getTamanho() + " \t" + "Categoria:" +" \t" + calcado[i].getCategoria() + " \t" + "Cheiro:" +" \t" + calcado[i].getCheiro());
			System.out.println("nome:"+" \t" + funcionario[i].getNome() +" \t" + "Faltas:" +" \t" + funcionario[i].getFaltas() + " \t" + "Tarefa:" +" \t" + funcionario[i].getTarefa() + " \t" + "Altura:" +" \t" + funcionario[i].getAltura() + " \t" + "Salario:" +" \t" + funcionario[i].getSalario());
			System.out.println("-------------------------------------------------------------------------------------------------------------------------------");
		}

	}

}

