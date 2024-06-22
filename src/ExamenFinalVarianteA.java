import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class ExamenFinalVarianteA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Estudiantes> listaEstudiantes=new ArraList<>();

int opcion;

do {
    System.out.println("""
            Bienvenido seleccione dentro de las opciones que desea hacer
            1.Calculadora
            2.Crear lista de estudiantes
            3.Mostrar lista de estudiantes
            4.salir
            \s""");
    opcion=sc.nextInt();
    switch (opcion) {
        case 1:
        break;
        case 2:
        break;
        case 3:
        break;
        case 4:
            System.out.println("Saliendo del programa");
        break;
        default:
            System.out.println("Opcion no valida seleccione una opcion del 1 al 4 por favor");
    }
        }while (opcion!=4);
    }

}