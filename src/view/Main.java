package view;

import model.Pessoa;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Pessoa p1, p2;
        p1 = new Pessoa();
        p1.setNome("João da Silva");
        p1.setProfissao("Analista de Dados");
        p1.setDataNascimento(19,11,1999);
        p1.getIdade();

        p2 = new Pessoa();
        p2.setNome("José Carlos");
        p2.setProfissao("Contador");
        p2.setDataNascimento(14,9,1256);
        p2.getIdade();
    }
}
