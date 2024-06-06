package figurasGeometricas;

public class Cilindro_3D extends tresD{
    double radio;
    double pi;
    double altura;

    public Cilindro_3D(String nombre_figura, double area, double volumen, int numero_caras, double radio, double pi, double altura) {
        super(nombre_figura, area, volumen, numero_caras);
        this.radio = radio;
        this.pi = 3.141592;
        this.altura = altura;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPi() {
        return pi;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }

    @Override
    public double calcular_area(){
        double area = 2*pi*radio*(radio*altura);
        return area;
    }

    @Override
    public double calcular_volumen(){
        double volumen = pi * (radio*radio)*altura;
        return volumen;
    }
    @Override
    public void mostrar(){
        super.mostrar();
        System.out.println("Área: " + Math.round(calcular_area() * 100.0) / 100.0);
        System.out.println("Volumen: " + Math.round(calcular_volumen() * 100.0) / 100.0);
    }
}
