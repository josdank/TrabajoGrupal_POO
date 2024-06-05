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
}
