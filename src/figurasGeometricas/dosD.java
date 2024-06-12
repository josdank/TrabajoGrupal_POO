package figurasGeometricas;

public class dosD extends FigurasGeometricas {
    double tamanioLados;

    public dosD() {
    }

    public dosD(int nlados, String nombre, double tamanioLados) {
        super(nlados, nombre);
        this.tamanioLados = tamanioLados;
    }

    public double getTamanioLados() {
        return tamanioLados;
    }

    public void setTamanioLados(double tamanioLados) {
        this.tamanioLados = tamanioLados;
    }
    public double calcularArea() {
        return 0; // Método genérico, sobrescrito en las subclases
    }

    public double calcularPerimetro() {
        return 0; // Método genérico, sobrescrito en las subclases
    }
    @Override
    public void mostrar() {
        //Metodo generico
    }
}
