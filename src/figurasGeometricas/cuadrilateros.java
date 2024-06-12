package figurasGeometricas;

public class cuadrilateros extends regulares {

    public cuadrilateros() {
    }

    public cuadrilateros(int nlados, String nombre, double tamanioLados) {
        super(nlados, nombre, tamanioLados);
    }

    @Override
    public double calcularArea() {
        // Para un cuadrilátero regular (cuadrado), el área es lado * lado
        double lado = getTamanioLados();
        return lado * lado;
    }

    @Override
    public double calcularPerimetro() {
        // Para un cuadrilátero regular (cuadrado), el perímetro es 4 * lado
        return 4 * getTamanioLados();
    }
    public void mostrar() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Número de Lados: " + nlados);
        System.out.println("Tamaño de los Lados: " + tamanioLados);
        System.out.println("Área: " + Math.round(calcularArea() * 100.0) / 100.0);
        System.out.println("Perímetro: " + Math.round(calcularPerimetro() * 100.0) / 100.0);
    }
}
