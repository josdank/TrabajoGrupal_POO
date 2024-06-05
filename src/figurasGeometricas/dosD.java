package figurasGeometricas;
import figurasGeometricas.FigurasGeometricas;
public class dosD extends FigurasGeometricas {
    double tamanio_lados;

    public dosD() {
    }

    public dosD(int nlados, String nombre, double tamanio_lados) {
        super(nlados, nombre);
        this.tamanio_lados = tamanio_lados;
    }

    public double getTamanio_lados() {
        return tamanio_lados;
    }

    public void setTamanio_lados(double tamanio_lados) {
        this.tamanio_lados = tamanio_lados;
    }

    public void calcularAreaRegulares() {
        if (nombre.equals("Cuadrado")) {
            double area = tamanio_lados * tamanio_lados;
            System.out.println("El area del cuadrado es: "+area);
        } else if (nombre.equals("Triangulo")) {
            double area = (base*altura)/2;
            System.out.println("El area del triangulo es: "+area);
        } else if (nombre.equals("Circulo")) {
            double area = pi * (radio*radio);
        }else {
            System.out.println("Figura no apta para calculo de area");
        }
    }

    public void calcularPerimetroRegulares() {
        if (nombre.equals("Cuadrado")) {
            double perimetro = 4 * tamanio_lados;
            System.out.println("El perímetro del cuadrado es: " + perimetro);
        } else if (nombre.equals("TrianguloEquilatero")) {
            // Implementa el cálculo del perímetro del triángulo equilátero aquí
        } else if (nombre.equals("Circulo")) {
            // Implementa el cálculo del perímetro del círculo aquí
        } else {
            System.out.println("Figura no soportada para cálculo de perímetro.");
        }
    }

    public void calcularAreaIrregulares() {

    }

    public void calcularPerimetroIrregulares() {

    }

    public void calcularVolumenIrregulares() {

    }
}