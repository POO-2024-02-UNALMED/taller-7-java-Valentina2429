package comunicacion;

import comunicacion.Pictograma;

public abstract class Alfabeto extends Pictograma {
    private String[] letras;
    private String interpretacion;

    public Alfabeto(String origen, String interpretacion, String[] letras) {
        super(origen);
        this.interpretacion = interpretacion;
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