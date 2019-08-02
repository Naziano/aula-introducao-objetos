package br.senac.rn.teste;

import br.senac.rn.Conta;
import br.senac.rn.ContaCorrente;

public class TestaConta {

    public static void main(String[] args) {

        Conta contaFelipe = new ContaCorrente();

        contaFelipe.setAgencia("0001-0");
        contaFelipe.setNumero("1239-4");
        contaFelipe.setTitular("Felipe Vasco");

        contaFelipe.deposita(80.0);

//        contaFelipe.numero = "0010-5";
//        contaFelipe.agencia = "0001-0";
//        contaFelipe.titular = "Felipe Vasco";
//        contaFelipe.saldo = 200.0;

        System.out.println(contaFelipe);


        Conta contaJota = new ContaCorrente();

        contaJota.setAgencia("0003-2");
        contaJota.setNumero("5214-5");
        contaJota.setTitular("Jota Lopes");

        contaJota.deposita(200.0);

        System.out.println(contaJota);

        contaJota.transfere(contaFelipe, 50.0);

        System.out.println(contaFelipe);
        System.out.println(contaJota);

//        contaFelipe.deposita(300.0);
//
//        System.out.println(contaFelipe);
//
//        contaFelipe.saca(100.0);
//
//        System.out.println(contaFelipe);

    }



}
