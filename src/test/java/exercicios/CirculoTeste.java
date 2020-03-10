package exercicios;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CirculoTeste {
        private Circulo c1;

        @BeforeEach
        public void beforeEach(){
            c1 = new Circulo();
            c1.raio = 15.0;
        }

        @AfterEach
        public void afterEach(){
            c1 = null;
        }
        @Test
        public void criarObjetoConta(){
            assertNotNull(c1);
        }
        @Test
        public void presencaAtributos(){
            assertNotNull(c1.raio);
        }
        @Test
        public void metodoCalculoArea(){
            Double valorEsperado = 706.841100;
            Double valorObtido = c1.calcularArea();
            assertEquals(valorEsperado,valorObtido);
        }
        @Test
        public void metodoCalcularPerimetro(){
            Double valorEsperado = 94.245480;
            Double valorObtido = c1.calcularPerimentro();
            assertEquals(valorEsperado,valorObtido);
        }

}
