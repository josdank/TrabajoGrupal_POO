package figurasGeometricas;

public class triangulos extends regulares {

    public triangulos() {
    }

    public triangulos(int nlados, String nombre, double tamanioLados) {
        super(nlados, nombre, tamanioLados);
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
    @Override
    public void mostrar() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Número de Lados: " + nlados);
        System.out.println("Tamaño de los Lados: " + tamanioLados);
        System.out.println("Área: " + Math.round(calcularArea() * 100.0) / 100.0);
        System.out.println("Perímetro: " + Math.round(calcularPerimetro() * 100.0) / 100.0);
    }
}
