package figurasGeometricas;

import java.util.Scanner;

public class iregulares extends dosD {
    double longitudLados;

    //Constructores sin y con parámetros
    public iregulares() {
    }

    public iregulares(double longitudLados) {
        this.longitudLados = longitudLados;
    }

    public iregulares(int nlados, String nombre, double tamanioLados, double longitudLados) {
        super(nlados, nombre, tamanioLados);
        this.longitudLados = longitudLados;
    }

    //Setters y Getters
    public double getLongitudLados() {
        return longitudLados;
    }
    public void setLongitudLados(double longitudLados) {
        this.longitudLados = longitudLados;
    }
    //Metodos personalizados
    public double calcularPerimetro(){
        double contador = 0;
        System.out.print("Longitud de cada lado");
        for (int i=0; i<=nlados; i++){
            Scanner valores = new Scanner(System.in);
            System.out.println("Ingrese el valor del lado "+i);
            double valor = valores.nextDouble();
            contador+=contador+valor;
        }
        return contador;
    }
}
