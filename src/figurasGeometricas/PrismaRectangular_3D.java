package figurasGeometricas;

public class PrismaRectangular_3D extends tresD{
    double base;
    double altura;
    double profundidad;

    public PrismaRectangular_3D(String nombre_figura, double area, double volumen, int numero_caras, double base, double profundidad, double altura) {
        super(nombre_figura, area, volumen, numero_caras);
        this.base = base;
        this.profundidad = profundidad;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getProfundidad() {
        return profundidad;
    }

    public void setProfundidad(double profundidad) {
        this.profundidad = profundidad;
    }
    @Override
    public double calcular_area(){
        double area_base = base*profundidad;
        double area_altura = base*altura;
        double area = 2 * altura * (base + profundidad) + 2 * (area_base + area_altura);
        return area;
    }
    @Override
    public double calcular_volumen(){
        double area_base = base*profundidad;
        double volumen = area_base*altura;
        return volumen;
    }
    @Override
    public void mostrar(){
        super.mostrar();
        System.out.println("Profundidad: " + Math.round(profundidad*100.0)/100.0);
        System.out.println("Área: " + Math.round(calcular_area() * 100.0) / 100.0);
        System.out.println("Volumen: " + Math.round(calcular_volumen() * 100.0) / 100.0);
    }
}
