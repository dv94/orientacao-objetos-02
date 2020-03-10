package exercicios;

public class Conta {
    public Integer numero;
    public Double saldo;                            //Continuar depois adicionando o solicitado no exercicio.
    public Double limite;

    public Double getSaldo(){
        return saldo + limite;
    }

    public void depositar(Double valor) {
            saldo = saldo + valor;
        }

    public void sacar(Double valor) {
        if (valor <= (saldo + limite)) {
            saldo = saldo - valor;
        }
    }

    public void transferir(exemplos.Conta conta, Double valor) {
        if (valor <= (saldo + limite)) {
            saldo = saldo - valor;
            conta.saldo = conta.saldo + valor;
        }
    }
}
