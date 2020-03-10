package exercicios;

import com.sun.media.sound.DataPusher;

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
            public double calcularArea(){
                return  this.PI * this.raio * this.raio;
            }

                public double calcularPerimentro(){
                    return  2 * (this.PI * raio);
                }

}
