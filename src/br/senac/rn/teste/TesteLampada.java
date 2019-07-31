package br.senac.rn.teste;


import br.senac.rn.Lampada;

public class TesteLampada {

    public static void main(String[] args) {

        Lampada lampada = new Lampada("Preto", 50);

        //lampada.cor = "Branco"; //esta é outra forma de fazer.
        //lampada.potencia = 80; //esta é outra forma de fazer.

        lampada.acende();

        System.out.println(lampada);

    }
}
