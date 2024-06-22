import java.util.Scanner;

public class ExamenFinalVarianteA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

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
            calculadora();
        break;
        case 2:
            Estudiante.crearEstudiante();
        break;
        case 3:
            Estudiante.mostrarEstudiantes(Estudiante.listaEstudiantes);
        break;
        case 4:
            System.out.println("Saliendo del programa");
        break;
        default:
            System.out.println("Opcion no valida seleccione una opcion del 1 al 4 por favor");
    }
        }while (opcion!=4);
    }
    public static void calculadora(){
        int num1, num2, resultado=0;
        Scanner sc = new Scanner(System.in);
        char operador;
        System.out.println("Ingrese el primer numero");
        num1=sc.nextInt();
        System.out.println("Ingrese el segundo numero");
        num2=sc.nextInt();
        System.out.println("""
                Que operacion desea hacer
                + Sumar
                - Restar
                * Multiplicar
                / Dividir
                \s""");
        operador=sc.next().charAt(0);
        switch (operador) {
            case '+':
                resultado=num1+num2;
                System.out.println("El resultado de la suma es: "+resultado);
                break;
            case '-':
                resultado=num1-num2;
                System.out.println("El resultado de la resta es: "+resultado);
                break;
            case '*':
                resultado=num1*num2;
                System.out.println("El resultado de la multiplicacion es: "+resultado);
                break;
            case '/':
                resultado=num1/num2;
                System.out.println("El resultado de la division es: "+resultado);
                break;
            default:
                System.out.println("Operacion invalida");
                break;
        }
    }
}