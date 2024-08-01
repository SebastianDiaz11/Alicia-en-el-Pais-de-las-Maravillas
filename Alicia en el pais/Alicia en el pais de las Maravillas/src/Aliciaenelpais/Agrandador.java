package Aliciaenelpais;

public class Agrandador extends Alimento {
    public Agrandador(String nombre, double precio) {
        super(nombre, precio);
    }

    @Override
    public int getEfectoAltura() {
        return 40;
    }
}
