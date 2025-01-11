package comunicacion;
public class Alfabeto extends Pictograma {
    private String[] letras;

    public Alfabeto(String origen, String interpretacion, String[] letras) {
        super(origen, interpretacion);
        this.letras = letras;
    }

    public String[] getLetras() {
        return letras;
    }

    public void setLetras(String[] letras) {
        this.letras = letras;
    }

    public int cantidadLetras() {
        return letras.length;
    }

    @Override
    public String toString() {
        return String.join(", ", letras);
    }
}