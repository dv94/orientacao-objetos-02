package exercicios;

public class Retangulo {
    public Double base;
    public Double altura;

    public Retangulo(){

    }
        public Double getBase() {
            return base;
        }
        public void setBase(Double base) {
            this.base = base;
        }

        public Double getAltura() {
            return altura;
        }

        public void setAltura(Double altura) {
            this.altura = altura;
        }
            public void calcularArea(Double area){
                area = base * altura;
            }
                public void calcularPerimentro(Double perimetro){
                    perimetro = 2 * (base + altura);
                }

}
