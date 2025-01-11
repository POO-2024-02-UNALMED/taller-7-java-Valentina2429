package comunicacion;

import comunicacion.Escrito;
import comunicacion.Pictograma;

public class Fabula extends Escrito {
    private String ensenanza;
    private String interpretacion;

    public Fabula(String origen, String titulo, String autor, int paginas, String resumen, String ensenanza, String interpretacion) {
        super(origen, titulo, autor, paginas);
        this.ensenanza = ensenanza;
        this.interpretacion = interpretacion;
    }

    public String getEnsenanza() {
        return ensenanza;
    }

    public void setEnsenanza(String ensenanza) {
        this.ensenanza = ensenanza;
    }

    @Override
    public String interpretacion() {
        return interpretacion;
    }

    @Override
    public int palabrasTotales(int factor) {
        return getPaginas() * factor;
    }

    @Override
    public String toString() {
        return getOrigen() + "\n"+ getTitulo() + "\n"+ getAutor() + "\n"+ getPaginas() + "\n" + "\n" + ensenanza;
    }
}