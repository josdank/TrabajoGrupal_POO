package figurasGeometricas;

public class Cubo_3D extends tresD{
    double tamanio_lado;

    public Cubo_3D() {}

    public Cubo_3D(double tamanio_lado) {
        this.tamanio_lado = tamanio_lado;
    }
    @Override
    public double calcular_area(){
        double area = 6*(tamanio_lado * tamanio_lado);
        return area;
    }
    @Override
    public double calcular_volumen(){
        double volumen = tamanio_lado * tamanio_lado * tamanio_lado;
        return volumen;
    }
    @Override
    public void mostrar(){
        super.mostrar();
        System.out.println("Tamanio Lado: " + tamanio_lado);
        System.out.println("Area: " + calcular_area());
        System.out.println("Volumen: " + calcular_volumen());
    }
}
