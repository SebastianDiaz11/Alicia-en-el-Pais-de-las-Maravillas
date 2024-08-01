package Aliciaenelpais;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class AliciaTest {
    private Alicia alicia;
    private Supermercado supermercado;

    @Before
    public void setUp() {
        alicia = new Alicia("Alicia", 180, 60.0, 18, 100.0);
        supermercado = new Supermercado();
    }

    @Test
    public void testComprarAlimentoDescuentaDinero() {
        double precio = 10.0;
        alicia.comprar(precio);
        assertEquals(90.0, alicia.getDinero(), 0.01);
    }

    @Test
    public void testNoExcederDineroDisponible() {
        double precio = 110.0;
        alicia.comprar(precio);
        assertEquals(100.0, alicia.getDinero(), 0.01);
    }

    @Test
    public void testConsumirAgrandador() {
        Alimento agrandador = new Agrandador("Caramelo", 5.0);
        alicia.consumir(agrandador);
        assertEquals(220, alicia.getAltura());
    }

    @Test
    public void testConsumirAchicador() {
        Alimento achicador = new Achicador("Masita", 5.0);
        alicia.consumir(achicador);
        assertEquals(130, alicia.getAltura());
    }

    @Test
    public void testNoAgrandarMasDe280() {
        Alimento agrandador = new Agrandador("Caramelo", 5.0);
        alicia.setAltura(260);
        alicia.consumir(agrandador);
        assertEquals(260, alicia.getAltura());
    }

    @Test
    public void testNoAchicarMenosDe50() {
        Alimento achicador = new Achicador("Masita", 5.0);
        alicia.setAltura(60);
        alicia.consumir(achicador);
        assertEquals(60, alicia.getAltura());
    }

    @Test
    public void testOrdenarAlimentosPorNombreDescendente() {
    	Alimento alimento1 = new Agrandador("Gomita", 5.0);
    	Alimento alimento2 = new Achicador("Bagel", 3.0);
    	Alimento alimento3 = new Agrandador("Caramelo", 2.0);
    	supermercado.agregarAlimento(alimento1);
    	supermercado.agregarAlimento(alimento2);
    	supermercado.agregarAlimento(alimento3);
    	supermercado.ordenarAlimentosPorNombreDescendente();
    	List<Alimento> alimentos = supermercado.getAlimentos();
    	assertEquals("Gomita", alimentos.get(0).getNombre());
    	assertEquals("Caramelo", alimentos.get(1).getNombre());
    	assertEquals("Bagel", alimentos.get(2).getNombre());
    }
}
