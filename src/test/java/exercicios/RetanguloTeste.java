package exercicios;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class RetanguloTeste {
    private Retangulo r1;

    @BeforeEach
    public void beforeEach(){
        r1 = new Retangulo();
        r1.base = 10.0;
        r1.altura = 20.0;
    }

    @AfterEach
    public void afterEach(){
        r1 = null;
    }
    @Test
    public void criarObjetoConta(){
        assertNotNull(r1);
    }
    @Test
    public void presencaAtributos(){
        assertNotNull(r1.base);
        assertNotNull(r1.altura);
    }
    @Test
    public void metodoCalculoArea(){
        Double valorEsperado = 200.0;
        Double valorObtido = r1.calcularArea();
        assertEquals(valorEsperado,valorObtido);
    }
    @Test
    public void metodoCalcularPerimetro(){
        Double valorEsperado = 60.0;
        Double valorObtido = r1.calcularPerimentro();
        assertEquals(valorEsperado,valorObtido);
    }
}
