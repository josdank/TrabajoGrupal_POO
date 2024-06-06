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
        setApotema(tamanio_lados/(2*Math.tan((double) 360 /2*nlados)));
    }
    @Override
    public double calcularArea() {
        //calculo del area de un poligono regular de mas de 5 lados y menos de 12 lados
        return apotema * (tamanioLados * nlados);
    }
    @Override
    public double calcularPerimetro() {
        return tamanioLados * nlados;
    }
    @Override
    public void mostrar() {
        //Metodo generico
    }
}
