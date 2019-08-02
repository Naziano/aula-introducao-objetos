package br.senac.rn;

// O (super) ele puxa sempre o titular da classe pai.
// Para se criar uma conta corrente ela tem que ser uma extensão da conta principal, usamos (extends).
// O (override) sobrescreve um já existente, da classe pai.
public class ContaCorrente extends Conta {

    private Double taxa;

    public void setTaxa(Double taxa) {
        this.taxa = taxa;
    }

    public Double getTaxa() {
        return taxa;
    }

//    @Override
//    public String toString() {
//        return "ContaCorrente{" +
//                "saldo=" + saldo +
//                ", titular='" + titular + '\'' +
//                '}';
//    }


    @Override
    public String toString() {
        return "ContaCorrente{" + super.toString() + "}";
    }

}
