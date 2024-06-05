package figurasGeometricas;

public class dosD extends FigurasGeometricas {
    private double tamanioLados;

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

    public void calcularAreaRegulares() {
        if (getNombre().equals("Cuadrado")) {
            double area = tamanioLados * tamanioLados;
            System.out.println("El area del cuadrado es: " + area);
        } else if (getNombre().equals("Triangulo")) {
            double base = 0;
            double altura = 0;
            double area = (base * altura) / 2;
            System.out.println("El area del triangulo es: " + area);
        } else if (getNombre().equals("Circulo")) {
            double pi = Math.PI;
            double radio = 0;
            double area = pi * (radio * radio);
            System.out.println("El area del circulo es: " + area);
        } else {
            System.out.println("Figura no apta para calculo de area");
        }
    }

    public void calcularPerimetroRegulares() {
        if (getNombre().equals("Cuadrado")) {
            double perimetro = 4 * tamanioLados;
            System.out.println("El perímetro del cuadrado es: " + perimetro);
        } else if (getNombre().equals("TrianguloEquilatero")) {

        } else if (getNombre().equals("Circulo")) {

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
