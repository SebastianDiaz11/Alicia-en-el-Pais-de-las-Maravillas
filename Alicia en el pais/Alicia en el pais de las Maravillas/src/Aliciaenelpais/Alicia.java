package Aliciaenelpais;

public class Alicia {
    private String nombre;
    private int altura;
    private double peso;
    private int edad;
    private double dinero;

    public Alicia(String nombre, int altura, double peso, int edad, double dinero) {
        this.nombre = nombre;
        this.altura = altura;
        this.peso = peso;
        this.edad = edad;
        this.dinero = dinero;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }

    public boolean puedeComprar(double precio) {
        return this.dinero >= precio;
    }

    public void comprar(double precio) {
        if (puedeComprar(precio)) {
            this.dinero -= precio;
        }
    }

    public void consumir(Alimento alimento) {
        int nuevaAltura = this.altura + alimento.getEfectoAltura();
        if (nuevaAltura >= 50 && nuevaAltura <= 280) {
            this.altura = nuevaAltura;
        }
    }
}
