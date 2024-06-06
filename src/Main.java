import java.util.Scanner;
import figurasGeometricas.PrismaRectangular_3D;
import figurasGeometricas.Cubo_3D;
import figurasGeometricas.Cilindro_3D;
import figurasGeometricas.nlados;
import figurasGeometricas.circulos;
import figurasGeometricas.cuadrilateros;
import figurasGeometricas.triangulos;
import figurasGeometricas.iregulares;
public class Main {
    public static void main(String[] args) {
        String respuesta;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("------------------------------------------------------------");
            System.out.println("|         Sistema de calculo de Figuras Geométricas        |");
            System.out.println("------------------------------------------------------------");
            System.out.println("¿La figura a calcular es de dos (2D) o tres (3D) dimensiones?");
            System.out.print("Ingrese su respuesta (Ingrese 'exit' para salir) : ");
            respuesta = sc.nextLine().toLowerCase();
            while (!(respuesta.equals("dosd") || respuesta.equals("2d") || respuesta.equals("tresd") || respuesta.equals("3d") || respuesta.equals("exit"))){
                System.out.println("¡Ingrese una opcion valida! ");
                respuesta = sc.nextLine().toLowerCase();
                System.out.println("------------------------------------------------------------");
            }
            if (respuesta.equals("dosd") || respuesta.equals("2d")) {
                System.out.println("¿La figura a calcular es regular o irregular?");
                System.out.print("Ingrese su respuesta: ");
                respuesta = sc.nextLine().toLowerCase();
                System.out.println();
                while (!(respuesta.equals("regular") || respuesta.equals("irregular"))) {
                    System.out.println("¡Ingrese una opción válida!");
                    System.out.print("Ingrese su respuesta: ");
                    respuesta = sc.nextLine().toLowerCase();
                    System.out.println("------------------------------------------------------");
                }

                if (respuesta.equals("regular")) {
                    System.out.println("\tCirculo");
                    System.out.println("\tTriangulo");
                    System.out.println("\tCuadrado");
                    System.out.println("\tnlados (Hasta el Dodecagono)");
                    System.out.print("Ingrese el nombre de la figura que desea calcular: ");
                    respuesta = sc.nextLine().toLowerCase();
                    System.out.println("---------------------------------------------------");
                    if (respuesta.equals("circulo")) {
                        System.out.print("Ingrese el radio del círculo: ");
                        double radio = sc.nextDouble();
                        circulos circulo = new circulos();
                        circulo.setNombre("Circulo");
                        circulo.setRadio(radio);
                        sc.nextLine();
                        circulo.mostrar();
                        System.out.println("---------------------------------------------------");
                    } else if (respuesta.equals("triangulo")) {
                        triangulos triangulo = new triangulos();
                        System.out.print("Ingrese el tamaño/longitud de los lados del triangulo: ");
                        double tamanioLados = sc.nextDouble();
                        sc.nextLine();
                        triangulo.setTamanioLados(tamanioLados);
                        triangulo.setNombre("Triangulo");
                        triangulo.setNlados(3);
                        triangulo.mostrar();
                        System.out.println("----------------------------------------------------");
                    } else if (respuesta.equals("cuadrado")) {
                        cuadrilateros cuadrado = new cuadrilateros();
                        System.out.print("Ingrese el tamaño/longitud de los lados del cuadrado: ");
                        double tamanioLados = sc.nextDouble();
                        sc.nextLine();
                        cuadrado.setTamanioLados(tamanioLados);
                        cuadrado.setNombre("Cuadrado");
                        cuadrado.setNlados(4);
                        cuadrado.mostrar();
                        System.out.println("----------------------------------------------------");
                    } else if (respuesta.equals("nlados")) {
                        String nombreFigura = "";
                        System.out.print("Ingrese el número de lados del polígono: ");
                        int nlados = sc.nextInt();
                        if (nlados == 5){
                            nombreFigura = "Pentágono";
                        }else if (nlados == 6){
                            nombreFigura = "Hexágono";
                        }else if (nlados == 7){
                            nombreFigura = "Heptágono";
                        }else if (nlados == 8){
                            nombreFigura = "Octágono";
                        }else if (nlados == 9){
                            nombreFigura = "Nonágono";
                        }else if (nlados == 10){
                            nombreFigura = "Decágono";
                        }else if (nlados == 11){
                            nombreFigura = "Endecágono";
                        }else if (nlados == 12){
                            nombreFigura = "Dodecágono";
                        }
                        System.out.print("Ingrese el tamaño/longitud de los lados del polígono: ");
                        double tamanioLados = sc.nextDouble();
                        sc.nextLine();
                        nlados poligono = new nlados(nlados,nombreFigura, tamanioLados, 0);
                        poligono.calcularApotema(nlados, tamanioLados);
                        poligono.mostrar();
                        System.out.println("----------------------------------------------------");
                    } else {
                        System.out.println("¡Figura no reconocida!");
                    }
                }
                if (respuesta.equals("irregular")) {
                    System.out.println("Cálculo del perimetro de las figuras irregulares");
                    System.out.println("Ingrese el numero de lados de la figura:");
                    int lados = sc.nextInt();
                    //Instancia irregulares
                    iregulares iregulares01 = new iregulares();
                    iregulares01.setNlados(lados);
                    iregulares01.calcularPerimetro();
                    iregulares01.mostrar();
                    sc.nextLine();
                }

            } else if (respuesta.equals("3d") || respuesta.equals("tresd")) {
                System.out.println("Opciones disponibles:");
                System.out.println("1. Prisma Rectangular");
                System.out.println("2. Cubo");
                System.out.println("3. Cilindro");
                System.out.print("Ingrese el nombre de la figura que desea calcular: ");
                respuesta = sc.nextLine().toLowerCase();
                System.out.println();

                switch (respuesta) {
                    case "1":
                    case "prisma rectangular":
                        System.out.print("Ingrese el largo del prisma: ");
                        double largoPrisma = sc.nextDouble();
                        System.out.print("Ingrese el ancho del prisma: ");
                        double anchoPrisma = sc.nextDouble();
                        System.out.print("Ingrese la altura del prisma: ");
                        double alturaPrisma = sc.nextDouble();
                        sc.nextLine();
                        PrismaRectangular_3D prisma = new PrismaRectangular_3D("Prisma Rectangular", 0, 0, 6, largoPrisma, anchoPrisma, alturaPrisma);
                        prisma.mostrar();
                        System.out.println(" ");
                        break;
                    case "2":
                    case "cubo":
                        System.out.print("Ingrese la longitud del lado del cubo: ");
                        double ladoCubo = sc.nextDouble();
                        sc.nextLine();
                        Cubo_3D cubo = new Cubo_3D("Cubo", 0, 0, 6, ladoCubo);
                        cubo.mostrar();
                        System.out.println(" ");
                        break;
                    case "3":
                    case "cilindro":
                        System.out.print("Ingrese el radio del cilindro: ");
                        double radioCilindro = sc.nextDouble();
                        System.out.print("Ingrese la altura del cilindro: ");
                        double alturaCilindro = sc.nextDouble();
                        sc.nextLine();
                        Cilindro_3D cilindro = new Cilindro_3D("Cilindro", 0, 0, 2, radioCilindro, 3.141592, alturaCilindro);
                        cilindro.mostrar();
                        System.out.println(" ");
                        break;
                    default:
                        System.out.println("¡Figura no reconocida!");
                }
            }
            //comentario
        } while (!respuesta.equals("exit"));{
            System.out.println("Relizado por: \n1. Garcia Mireya\n2. Guerra Josué\n3. Gutierrez Alejandro\n4. Lincango Jose\n5. Marquez Christian\n6. Vilatuña Anderson");
        }

        sc.close();
    }
}