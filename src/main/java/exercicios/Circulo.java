package exercicios;

public class Circulo {

    public Double raio;
    private Double PI = 3.141516;

    public Circulo(){

    }
        public Double getPI(){
        return PI;
        }

        public Double getRaio() {
            return raio;
        }

        public void setRaio(Double raio) {
            this.raio = raio;
        }
            public void calcularArea(Double raio){
                this.raio = this.PI * raio * raio;
            }

                public void calcularPerimentro(Double raio){
                    this.raio = 2 * (this.PI * raio);
                }

}
