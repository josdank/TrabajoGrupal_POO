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

    }

    public void calcularPerimetroRegulares() {

    }

    public void calcularVolumenRegulares() {

    }

    public void calcularAreaIrregulares() {

    }

    public void calcularPerimetroIrregulares() {

    }

    public void calcularVolumenIrregulares() {

    }
}