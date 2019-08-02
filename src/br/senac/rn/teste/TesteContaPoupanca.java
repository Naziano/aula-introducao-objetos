package br.senac.rn.teste;

import br.senac.rn.ContaPoupanca;

public class TesteContaPoupanca {

    public static void main(String[] args) {

        ContaPoupanca contaJeferson = new ContaPoupanca();

        contaJeferson.setTitular("Jeferson Felipe");
        contaJeferson.deposita(1000.0);

        System.out.println(contaJeferson);

        for (int i = 0; i < 2; i++) {
            contaJeferson.rende();

            System.out.println(contaJeferson);
        }

    }
}
