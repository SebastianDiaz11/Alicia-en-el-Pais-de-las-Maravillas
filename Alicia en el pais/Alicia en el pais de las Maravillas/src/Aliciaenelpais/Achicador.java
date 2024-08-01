package Aliciaenelpais;

public class Achicador extends Alimento {
    public Achicador(String nombre, double precio) {
        super(nombre, precio);
    }

    @Override
    public int getEfectoAltura() {
        return -50;
    }
}
