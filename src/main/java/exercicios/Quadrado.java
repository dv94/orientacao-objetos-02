package exercicios;

public class Quadrado {
    public Double lado;

    public Quadrado(Double lado){
        this.lado = lado;
    }

    public Quadrado() {

    }

    public Double getLado() {
            return lado;
        }

            public void setLado(Double lado) {
                this.lado = lado;
            }
                public double calcularArea(){
                    return lado * lado;
                }
                    public double calcularPerimetro(){
                        return  4 * lado;
                    }


}
