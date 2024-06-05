package figurasGeometricas;

public class FigurasGeometricas {
    private int nlados;
    private String nombre;

    public FigurasGeometricas() {
    }

    public FigurasGeometricas(int nlados, String nombre) {
        this.nlados = nlados;
        this.nombre = nombre;
    }

    public int getNlados() {
        return nlados;
    }

    public void setNlados(int nlados) {
        this.nlados = nlados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void mostrar() {
        System.out.println("El nombre es: " + nombre);
        System.out.println("El nlados es: " + nlados);
    }
}
