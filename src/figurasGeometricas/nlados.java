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

}
