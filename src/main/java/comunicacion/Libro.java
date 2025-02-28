package comunicacion;

import comunicacion.Escrito;
import comunicacion.Pictograma;

public class Libro extends Escrito {
    private String coAutor;
    private String editorial;
    private String edicion;
    private String interpretacion;

    public Libro(String origen,String titulo, String autor, int paginas, String coAutor, String editorial, String edicion, String interpretacion) {
        super(origen, titulo, autor, paginas);
        this.coAutor = coAutor;
        this.editorial = editorial;
        this.edicion = edicion;
        this.interpretacion = interpretacion;
    }

    public String getCo_autor() {
        return coAutor;
    }

    public void setCoAutor(String coAutor) {
        this.coAutor = coAutor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    @Override
    public String interpretacion() {
        return interpretacion;
    }

    @Override
    public int palabrasTotales(int factor) {
        return getPaginas() * factor * 2;
    }

    @Override
    public String toString() {
        return getOrigen() + "\n"+ getTitulo() + "\n"+ getAutor() + "\n"+ getPaginas() + "\n" + coAutor + "\n" + editorial + "\n" + edicion;
    }
}