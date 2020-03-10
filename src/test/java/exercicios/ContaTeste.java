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
        Double valorEsperado = c1.depositar();   // verificar erro
        assertEquals(valorDepositado,valorEsperado);
    }
    @Test
    public void metodoSacar(){
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
    }
    @Test
    public void metodoTransferirValorValido() {
    }
    @Test
    public void metodoTransferirValorInvalido() {
    }
    //------------------------------------------
    @Test
    public void metodoDepositar(){
    }

    @Test
    public void metodoDepositarValorInvalido() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> c1.depositar(-200.0));
        assertEquals("Valor deve ser maior que zero.", exception.getMessage());
    }


}
