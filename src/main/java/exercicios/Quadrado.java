package exercicios;

public class Quadrado {
    public Double lado;

    public Quadrado(){

    }
    public Quadrado(Double lado){
        this.lado = lado;
    }

        public Double getLado() {
            return lado;
        }

            public void setLado(Double lado) {
                this.lado = lado;
            }
                public void calcularArea(Double lado){
                    this.lado = lado * lado;
                }
                    public void calcularPerimetro(Double lado){
                        this.lado = 4 * lado;
                    }


}
