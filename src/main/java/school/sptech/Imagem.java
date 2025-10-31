package school.sptech;

import java.util.ArrayList;
import java.util.List;

public class Imagem {
    private List<Figura> figuras = new ArrayList<>();

    public Imagem() {
    }

    public void adicionar(Figura figura){
        figuras.add(figura);
    }

    public Double calcularSomaDasAreas(){
        Double valor = 0.0;
        for (Figura fig : figuras){
            valor += fig.calcularArea();
        }
        return valor;
    }

    public List<Figura> buscarPorAreaMaiorQue20(){
        List<Figura> figurasmaior = new ArrayList<>();
        Double valor = 0.0;
        for (Figura fig : figuras){
            valor = fig.calcularArea();
            if (valor > 20){
                figurasmaior.add(fig);
            }
        }
        return figurasmaior;
    }

    public List<Figura> buscarQuadrados(){
        List<Figura> quadrados = new ArrayList<>();
        for (Figura fig : figuras){
            if (fig instanceof Quadrado){
                quadrados.add(fig);
            }
        }
        return quadrados;
    }
}
