package school.sptech;

public class Quadrado extends Figura {
    private Double lado;

    public Quadrado() {
    }

    public Double getLado() {
        return lado;
    }

    public void setLado(Double lado) {
        this.lado = lado;
    }

    @Override public Double calcularArea(){
        Double area = lado * lado;
        return area;
    }

    @Override
    public String toString() {
        return "Quadrado{" +
                "lado=" + lado +
                '}';
    }
}
