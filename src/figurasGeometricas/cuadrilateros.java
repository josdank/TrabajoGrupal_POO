package figurasGeometricas;

public class cuadrilateros extends regulares {

    public cuadrilateros(int nlados, String nombre, double longitudLado) {
        super(nlados, nombre, longitudLado);
    }

    @Override
    public double calcularArea() {
        // Para un cuadrilátero regular (cuadrado), el área es lado * lado
        double lado = getLongitudLado();
        return lado * lado;
    }

    @Override
    public double calcularPerimetro() {
        // Para un cuadrilátero regular (cuadrado), el perímetro es 4 * lado
        return 4 * getLongitudLado();
    }
}
