package Aliciaenelpais;

public abstract class Alimento {
    private String nombre;
    private double precio;

    public Alimento(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public abstract int getEfectoAltura();
}


