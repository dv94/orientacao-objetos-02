package exercicios;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ContaTeste {
    private Conta c1;

    @BeforeEach
    public void beforeEach(){
        c1 = new Conta();
        c1.numero = 1;
        c1.saldo = 500.00;
        c1.limite = 1000.00;
    }
    @AfterEach
    public void afterEach(){
        c1.numero = null;
    }
    @Test
    public void criarObjetoConta(){
        assertNotNull(c1);
    }
    @Test
    public void presencaAtributoConta(){
        assertNotNull(c1.numero);
        assertNotNull(c1.saldo);
        assertNotNull(c1.limite);
    }
    @Test
    public void metodoDepositar(){
        Double valorDepositado = 200.00;
        Double valorEsperado = c1.getSaldo() + valorDepositado;
        c1.depositar(valorDepositado);
        assertEquals(valorEsperado,c1.getSaldo());
    }
    @Test
    public void metodoSacar(){
        Double valorSacado = 100.00;
        Double valorEsperado = c1.getSaldo() - valorSacado;
        c1.sacar(valorSacado);
        assertEquals(valorEsperado,c1.getSaldo());
    }
    @Test
    public void metodoSacarSaldoSuficiente() {

    }
    @Test
    public void metodoSacarSaldoInsuficiente() {
    }
    //-----------------------------

    @Test
    public void metodoTransferir(){
        Double valorTranferido = 300.00;
       // Double valorEsperado = c1.getSaldo() - valorTranferido;
        Conta c2 = new Conta();
        c2.setSaldo(0.00);
        c1.transferir(c2,valorTranferido);

        System.out.println( c2.getSaldo());
        assertEquals(valorTranferido, c2.getSaldo());
    }
    @Test
    public void metodoTransferirValorValido() {
    }
    @Test
    public void metodoTransferirValorInvalido() {
    }
    //------------------------------------------
    @Test
    public void metodoDepositarValorInvalido() {
    }


}
