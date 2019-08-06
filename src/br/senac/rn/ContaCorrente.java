package br.senac.rn;

// O (super) ele puxa sempre o titular da classe pai.
// Para se criar uma conta corrente ela tem que ser uma extensão da conta principal, usamos (extends).
// O (override) sobrescreve um já existente, da classe pai.
public class ContaCorrente extends Conta {

    private final Double TAXA = 1.0;

    private Double limite = 0.0;

    public void setLimite(Double limite) {
        this.limite = limite;
    }

    public Double getLimite() {
        return limite;
    }

    public Double gettaxa() {
        return TAXA;
    }

//    @Override
//    public String toString() {
//        return "ContaCorrente{" +
//                "saldo=" + saldo +
//                ", titular='" + titular + '\'' +
//                '}';
//    }


    @Override
    public Boolean saca(Double valor) {
        Double valorComTaxa = valor + TAXA;
        Double saldoComLimite = saldo + limite;
        if (valorComTaxa <= saldoComLimite) {
            saldo -= valorComTaxa;
            return true;
        }
        System.out.println("SALDO INSUFICIENTE");
        return false;
    }

    @Override
    public String toString() {
        return "ContaCorrente{" + super.toString() + "}";
    }

}
