package exercicios;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CorrentistaTeste {
    private Correntista co1;

    @BeforeEach
    public void beforeEach(){
        Correntista con1 = new Correntista();
        co1.codigo ="1";
        co1.nome = "Raimundo";
        co1.email = "Raimundo@Raimundo.com";
        co1.telefone ="111111111111";
    }
    @AfterEach
    public void afterEach(){
        co1 = null;
    }

    @Test
    public void criarObjetoCorrentista(){
        assertNotNull(co1);
    }
    @Test
    public void criarAtributos(){
        assertNotNull(co1.getCodigoCliente());

    }
}
