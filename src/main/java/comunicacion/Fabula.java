package comunicacion;
public class Fabula extends Escrito {
    private String ensenanza;
    private String interpretacion;

    public Fabula(String titulo, String autor, int paginas, String resumen, String ensenanza, String interpretacion) {
        super(titulo, autor, paginas, resumen);
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
        return super.toString() + "\n" + ensenanza;
    }
}