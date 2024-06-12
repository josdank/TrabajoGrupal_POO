package figurasGeometricas;

public class nlados extends regulares {
    double apotema;

    public nlados() {
    }

    public nlados(int nlados, String nombre, double tamanio_lados, double apotema) {
        super(nlados, nombre, tamanio_lados);
        this.apotema = apotema;
    }

    public double getApotema() {
        return apotema;
    }

    public void setApotema(double apotema) {
        this.apotema = apotema;
    }

    public void calcularApotema(int nlados, double tamanio_lados) {
        setApotema(tamanio_lados / (2 * Math.tan(Math.PI / nlados)));
    }

    @Override
    public double calcularArea() {
        //calculo del area de un poligono regular de mas de 5 lados y menos de 12 lados
        return (calcularPerimetro() * apotema) / 2;
    }

    @Override
    public double calcularPerimetro() {
        return tamanioLados * nlados;
    }

    @Override
    public void mostrar() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Número de Lados: " + nlados);
        System.out.println("Tamaño de los Lados: " + tamanioLados);
        System.out.println("Apotema: " + Math.round(apotema * 100.0) / 100.0);
        System.out.println("Área: " + Math.round(calcularArea() * 100.0) / 100.0);
        System.out.println("Perímetro: " + Math.round(calcularPerimetro() * 100.0) / 100.0);
    }
}
