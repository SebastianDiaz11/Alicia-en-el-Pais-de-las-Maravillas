package Aliciaenelpais;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Supermercado {
    private List<Alimento> alimentos;

    public Supermercado() {
        alimentos = new ArrayList<>();
    }

    public void agregarAlimento(Alimento alimento) {
        alimentos.add(alimento);
    }

    public List<Alimento> getAlimentos() {
        return alimentos;
    }

    public void ordenarAlimentosPorNombreDescendente() {
        alimentos.sort(Comparator.comparing(Alimento::getNombre).reversed());
    }
}