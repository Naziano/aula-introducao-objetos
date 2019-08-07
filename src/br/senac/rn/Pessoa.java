package br.senac.rn;

import sun.text.normalizer.UCharacter;

public class Pessoa {

    private String nome;
    private String cpf;
    private Sexo sexo;
    private String fone;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getFone() {
        return fone;
    }


    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", sexo=" + sexo +
                '}';
    }


}
