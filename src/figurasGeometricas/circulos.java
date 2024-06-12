package figurasGeometricas;

public class circulos extends regulares {
    // Atributos
    private double radio;

    // Constructor sin parámetros
    public circulos() {

    }

    // Constructor con parámetros
    public circulos(double radio ,int nlados, String nombre, double tamanioLados) {
        super(nlados, nombre, tamanioLados);
        this.radio = radio;
    }

    // Getter para el radio
    public double getRadio() {
        return radio;
    }

    // Setter para el radio
    public void setRadio(double radio) {
        this.radio = radio;
    }

    // Método para calcular el área
    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }
    @Override
    // Método para calcular el perímetro
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }
    @Override
    // Método para mostrar los detalles del círculo
    public void mostrar() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Radio: " + radio);
        System.out.println("Área: " + Math.round(calcularArea() * 100.0) / 100.0);
        System.out.println("Perímetro: " + Math.round(calcularPerimetro() * 100.0) / 100.0);
    }
}

