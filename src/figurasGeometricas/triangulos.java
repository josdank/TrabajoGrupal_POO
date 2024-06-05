package figurasGeometricas;

public class triangulos extends regulares {

    public triangulos(int nlados, String nombre, double longitudLado) {
        super(nlados, nombre, longitudLado);
    }

    @Override
    public double calcularArea() {
        // Para un triángulo equilátero, el área es (sqrt(3) / 4) * lado^2
        double lado = getTamanioLados();
        return (Math.sqrt(3) / 4) * lado * lado;
    }

    @Override
    public double calcularPerimetro() {
        // Para un triángulo equilátero, el perímetro es 3 * lado
        return 3 * getTamanioLados();
    }
}
