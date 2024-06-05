package figurasGeometricas;

public class regulares extends FigurasGeometricas {
    private double longitudLado;

    public regulares() {
    }

    public regulares(int nlados, String nombre, double longitudLado) {
        super(nlados, nombre);
        this.longitudLado = longitudLado;
    }

    public double getLongitudLado() {
        return longitudLado;
    }

    public void setLongitudLado(double longitudLado) {
        this.longitudLado = longitudLado;
    }

    public double calcularArea() {
        return 0; // Método genérico, sobrescrito en las subclases
    }

    public double calcularPerimetro() {
        return 0; // Método genérico, sobrescrito en las subclases
    }
}
