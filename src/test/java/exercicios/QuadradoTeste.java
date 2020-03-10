package exercicios;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class QuadradoTeste {

    private Quadrado q1;

    @BeforeEach
    public void beforeEach(){
        q1 = new Quadrado();
        q1.lado = 10.0;
    }

    @AfterEach
    public void afterEach(){
        q1 = null;
    }
    @Test
    public void criarObjetoConta(){
        assertNotNull(q1);
    }
    @Test
    public void presencaAtributos(){
        assertNotNull(q1.lado);
    }
    @Test
    public void metodoCalculoArea(){
        Double valorEsperado = 100.0;
        Double valorObtido = q1.calcularArea(); // verificar erro
        assertEquals(valorEsperado,valorObtido);
    }
    @Test
    public void metodoCalcularPerimetro(){
        Double valorEsperado = 10.0;
        Double valorObtido = q1.calcularPerimetro(); // verificar erro
        assertEquals(valorEsperado,valorObtido);
    }
}
