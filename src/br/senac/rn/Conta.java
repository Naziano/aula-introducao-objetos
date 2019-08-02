package br.senac.rn;

// O (publico) deixa para que todos tenham acesso.
// O (privado) ele priva de todas as classes, só pode mexer nela.
// O (protected) ele dar o acesso as classes filhos, ou seja, as sub-classes tem total acesso.
// O (abstract) ele vai ser só um modelo para as outras contas criadas, ela só é usada  para herança.

public abstract class Conta {

    protected String agencia;
    protected String numero;
    protected Double saldo = 0.0;
    protected String titular;

    public String getAgencia() {
        return agencia;
    }

    public String getNumero() {
        return numero;
    }

    public Double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

//    public Conta() {}
//
//    public Conta(Double saldo) {
//        setSaldo(saldo);
//    }

//    public void setSaldo(Double valor) {
//        if (valor >= 0) {
//            this.saldo = saldo;
//        } else {
//            this.saldo = 0.0;
//        }
//    }



    public  void deposita(Double valor) {
        saldo += valor;

    }

    public void saca(double valor) {
        saldo -= valor;
    }

//    public Double consulta() {
//        return  saldo;
//    }

    public void transfere(Conta contaDestino, Double valor) {
        saca(valor);
        contaDestino.deposita(valor);
    }

    @Override
    public String toString() {
        return "Conta{" +
                "saldo=" + saldo +
                ", titular='" + titular + '\'' +
                '}';
    }

}
