package br.senac.rn;

public class Lampada {

    public final Integer FREQUENCIA = 60; //Toda constante é escrito em maiúsculo

    public String cor; //Atributos ou Propriedades
    public Integer potencia; //Atributos ou Propriedades
    public Integer tensao; //Atributos ou Propriedades
    public Float comprimento; //Atributos ou Propriedades
    private Boolean estado = false; //Estado da lâmpada

    //Construtor vazio
    public Lampada() {
    }

    //Construtor cor
    public Lampada(String cor) {
        this.cor = cor;
    }

    //Contrutor cor e potência
    public Lampada(String cor, Integer potencia) {
        this.cor = cor;
        this.potencia = potencia;
    }


    public void acende() {
        estado = true;
    } //Todo método tem que ter (parentese e chaves)

     public void apaga() {
        estado = false;
     } //Todo método tem que ter (parentese e chaves)

    public String statusLampada() {
        if (estado == true) {
            return "LIGADO";
        }
        return "DESLIGADO";
    }

    @Override
    public String toString() {
        return "Lampada{" +
                "cor='" + cor + '\'' +
                ", estado=" + statusLampada() +
                '}';
    }
}
//void (não devolve o retorno).
// String (devolve o retorno).