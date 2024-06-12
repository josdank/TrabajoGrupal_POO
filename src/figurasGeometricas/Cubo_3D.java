package figurasGeometricas;

public class Cubo_3D extends tresD{
    double tamanio_lado;

    public Cubo_3D() {}

    public Cubo_3D(String nombre_figura, double area, double volumen, int numero_caras, double tamanio_lado) {
        super(nombre_figura, area, volumen, numero_caras);
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
        System.out.println("Área: " + Math.round(calcular_area() * 100.0) / 100.0);
        System.out.println("Volumen: " + Math.round(calcular_volumen() * 100.0) / 100.0);
    }
}
