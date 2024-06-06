import java.util.Scanner;
import figurasGeometricas.PrismaRectangular_3D;
import figurasGeometricas.Cubo_3D;
import figurasGeometricas.Cilindro_3D;
import figurasGeometricas.nlados;
import figurasGeometricas.circulos;
import figurasGeometricas.cuadrilateros;
import figurasGeometricas.triangulos;
public class Main {
    public static void main(String[] args) {
        String respuesta;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("¿La figura a calcular es de dos (2D) o tres (3D) dimensiones?");
            System.out.print("Ingrese su respuesta (Ingrese 'exit' para salir) : ");
            respuesta = sc.nextLine().toLowerCase();
            while (!(respuesta.equals("dosd") || respuesta.equals("2d") || respuesta.equals("tresd") || respuesta.equals("3d") || respuesta.equals("exit"))){
                System.out.println("¡Ingrese una opcion valida!");
                System.out.println("¿La figura a calcular es de dos o tres dimensiones?");
                System.out.print("Ingrese su respuesta (Ingrese 'exit' para salir) : ");
                respuesta = sc.nextLine().toLowerCase();
            }
            if (respuesta.equals("dosd") || respuesta.equals("2d")){
                System.out.println("¿La figura a calcular es regular o irregular?");
                System.out.print("Ingrese su respuesta");
                respuesta = sc.nextLine().toLowerCase();
                while (!(respuesta.equals("regular") || respuesta.equals("irregular"))){
                    System.out.println("¡Ingrese una opcion valida!");
                    System.out.println("¿La figura a calcular es regular o irregular?");
                    System.out.print("Ingrese su respuesta:  ");
                    respuesta = sc.nextLine().toLowerCase();
                }
                if (respuesta.equals("regular")){
                    System.out.println("Circulo");
                    System.out.println("Triangulo");
                    System.out.println("Cuadrado");
                    System.out.println("Otros Poligonos (Hasta el Dodecagono)");
                    System.out.print("Ingrese el nombre de la figura que desea calcular: ");
                    respuesta = sc.nextLine().toLowerCase();
                    if (respuesta.equals("circulo")){
                        //logica para el circulo
                    }
                    if (respuesta.equals("triangulo")){
                        triangulos triangulo = new triangulos();
                        System.out.print("Ingrese el tamaño/longitud de los lados del triangulo: ");
                        triangulo.setTamanioLados(sc.nextDouble());
                        System.out.println("El area es de: " + triangulo.calcularArea());
                        System.out.println("El perimetro es de: " + triangulo.calcularPerimetro());
                    }
                    if (respuesta.equals("cuadrado")){
                        //logica ciadrado
                    }
                    if (respuesta.equals("pentagono")){
                        nlados pentagono = new nlados();

                    }
                }
                else if (respuesta.equals("irregular")) {
                    System.out.println("prueba");

                }
            }
            else if (respuesta.equals("tresd") || respuesta.equals("3d")){
                System.out.println("prueba");
            }
        }while (!(respuesta.equals("exit")));
    }
}