package figurasGeometricas;

public class tresD extends FigurasGeometricas {
    String nombre_figura;
    int numero_caras;
    double area;
    double volumen;
    public tresD() {}

    public tresD(String nombre_figura, double area, double volumen, int numero_caras) {
        this.nombre_figura = nombre_figura;
        this.area = area;
        this.volumen = volumen;
        this.numero_caras = numero_caras;
    }

    public String getNombre_figura() {
        return nombre_figura;
    }

    public void setNombre_figura(String nombre_figura) {
        this.nombre_figura = nombre_figura;
    }

    public double getVolumen() {
        return volumen;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getNumero_caras() {
        return numero_caras;
    }

    public void setNumero_caras(int numero_caras) {
        this.numero_caras = numero_caras;
    }
    public double calcular_area(){
        return area;
    }
    public double calcular_volumen(){
        return volumen;
    }
    @Override
    public void mostrar() {
        System.out.println("Nombre del figura: " + nombre_figura);
        System.out.println("Numero de caras: " + numero_caras);
    }
}
