package figurasGeometricas;

public class regulares extends dosD {
    public regulares() {
    }

    public regulares(int nlados, String nombre, double tamanioLados) {
        super(nlados, nombre, tamanioLados);

    }
    @Override
    public double calcularArea() {
        return 0; // Método genérico, sobrescrito en las subclases
    }
    @Override
    public double calcularPerimetro() {
        return 0; // Método genérico, sobrescrito en las subclases
    }
    @Override
    public void mostrar() {
        //Metodo generico
    }
}
