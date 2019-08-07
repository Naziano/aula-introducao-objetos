package br.senac.rn.teste;

import br.senac.rn.Conta;
import br.senac.rn.ContaCorrente;
import br.senac.rn.Pessoa;
import br.senac.rn.Sexo;

public class TesteContaCorrente {

    public static void main(String[] args) {

        // Conta Flavio
        ContaCorrente contaFlavio = new ContaCorrente();

        Pessoa flavio = new Pessoa();

        flavio.setNome("Flavio Araujo");
        flavio.setSexo(Sexo.MASCULINO);

        contaFlavio.setTitular(flavio);
        contaFlavio.setAgencia("1234-8");
        //contaFlavio.setNumero("4564-4");


        contaFlavio.deposita(800.0);

        System.out.println(contaFlavio);


        // Conta Caio
        // Polimorfismo é quando um classe assume o comportamento de outra classe.
        ContaCorrente contaCaio = new ContaCorrente();

        Pessoa caio = new Pessoa();

        caio.setNome("Caio Cesar");
        caio.setSexo(Sexo.MASCULINO);

        contaCaio.setTitular(caio);
        //contaCaio.setNumero("4568-7");
        contaCaio.setAgencia("1478-3");
        contaCaio.setLimite(500.0);

        // Depósito conta Caio.
        contaCaio.deposita(1000.0);

        // Resposta conta Caio.
        System.out.println(contaCaio);

        // Transferência conta Caio para conta Flavio.
        contaCaio.transfere(contaFlavio, 1200.0);

        // Resposta Transferência conta Flavio.
        System.out.println(contaFlavio);

        // Resposta Transferência conta Caio.
        System.out.println(contaCaio);


    }
}
