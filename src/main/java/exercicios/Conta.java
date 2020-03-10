package exercicios;

public class Conta {
    public Integer numero;
    public Double saldo;
    public Double limite;

    public Double getSaldo(){
        return this.saldo;
    }
    public Double getSaldoLimite(){
        return this.saldo + this.getLimite();
    }


    public void depositar(Double valor) {
            saldo = saldo + valor;
        }

    public void sacar(Double valor) {
        if (valor <= (saldo + limite)) {
            saldo = saldo - valor;
        }
    }

    public void transferir(Conta conta, Double valor) {
        Double teste = this.getSaldo();
        teste = this.getLimite();
        if (valor <= this.getSaldoLimite()) {
            this.setSaldo(this.getSaldo() - valor);
            conta.setSaldo(conta.getSaldo() + valor);
        }
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Double getLimite() {
        return limite;
    }
}
