package model;

import java.time.LocalDate;

public class Pessoa {
    private String nome;
    private LocalDate dataNascimento;
    private String profissao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(int dia, int mes, int ano) {
        this.dataNascimento = LocalDate.of(ano,mes,dia);
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public void getIdade() {
        LocalDate hoje = LocalDate.now();
        int anoAtual = hoje.getYear();
        int anoNascimento = dataNascimento.getYear();
        int idade = anoAtual - anoNascimento;

        if (idade > 150) {
            System.out.println("Nenhum ser vivente pode ter mais de 150 anos, cadastro inválido.");
        }else if(idade < 0) {
            System.out.println("Nenhum ser vivente pode ter idade negativa, cadastro inválido.");
        }else{
            System.out.println(idade);
        }
    }
}
