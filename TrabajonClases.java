package apuntesdeclase;
import java.util.Scanner;

class FiguraGeometrica {
    protected double alto;
    protected double ancho;

    public FiguraGeometrica(double alto, double ancho) {
        this.alto = alto;
        this.ancho = ancho;
    }


    public double calcularArea() {
        return alto * ancho;
    }


    public double calcularPerimetro() {
        return 2 * (alto + ancho);
    }


    public double calcularHipotenusa() {
        return Math.sqrt(alto * alto + ancho * ancho);
    }
}


class Rectangulo extends FiguraGeometrica {

    public Rectangulo(double alto, double ancho) {
        super(alto, ancho);
    }
}


class Cuadrado extends FiguraGeometrica {

    public Cuadrado(double lado) {
        super(lado, lado);
    }
}


public class TrabajonClases {

    public static void main(String[] args) {

            double[][] resultados = new double[2][3];
            Scanner scanner = new Scanner(System.in);

            String usuarioCorrecto = "mateo";
            String contrasenaCorrecta = "se merece un 5";


            String usuarioIngresado;
            String contrasenaIngresada;


            System.out.println("Bienvenido");
            System.out.print("Ingrese su nombre de usuario: ");
            usuarioIngresado = scanner.nextLine();
            System.out.print("Ingrese su contraseña: ");
            contrasenaIngresada = scanner.nextLine();

            if (usuarioIngresado.equals(usuarioCorrecto) && contrasenaIngresada.equals(contrasenaCorrecta)) {
                System.out.println("Inicio de sesión exitoso.\n");


                int opcion;
                while (true) {
                    System.out.println("\nMenú:");
                    System.out.println("1. Rectángulo");
                    System.out.println("2. Cuadrado");
                    System.out.println("3. Salir");
                    System.out.println("Seleccione una opción:");
                    opcion = scanner.nextInt();

                    switch (opcion) {
                        case 1:
                            System.out.println("\nIngrese el alto del rectángulo:");
                            double altoRectangulo = scanner.nextDouble();
                            System.out.println("Ingrese el ancho del rectángulo:");
                            double anchoRectangulo = scanner.nextDouble();
                            Rectangulo rectangulo = new Rectangulo(altoRectangulo, anchoRectangulo);
                            resultados[0][0] = rectangulo.calcularArea();
                            resultados[0][1] = rectangulo.calcularPerimetro();
                            resultados[0][2] = rectangulo.calcularHipotenusa();
                            break;
                        case 2:
                            System.out.println("\nIngrese el lado del cuadrado:");
                            double ladoCuadrado = scanner.nextDouble();
                            Cuadrado cuadrado = new Cuadrado(ladoCuadrado);
                            resultados[1][0] = cuadrado.calcularArea();
                            resultados[1][1] = cuadrado.calcularPerimetro();
                            resultados[1][2] = cuadrado.calcularHipotenusa();
                            break;
                        case 3:
                            System.out.println("Saliendo...");
                            break;
                        default:
                            System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                    }
                    if (opcion != 3) {
                        break;
                    }
                }
                System.out.println("\nResultados:");
                for (int i = 0 ;i < 1; ++i) {
                    System.out.println("Figura " + (i + 1) + ":");
                    System.out.println("Área: " + resultados[i][0]);
                    System.out.println("Perímetro: " + resultados[i][1]);
                    System.out.println("Hipotenusa: " + resultados[i][2]);
                    System.out.println();
                }
                scanner.close();
            } else {
                System.out.println("Nombre de usuario o contraseña incorrectos. Por favor, inténtelo de nuevo.");
            }
        }
    }

