import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Estudiante {
    public static List<Estudiante> listaEstudiantes=new ArrayList<>();
    private String nombre;
    private int calificacion;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public Estudiante(String nombre, int calificacion) {
        this.nombre = nombre;
        this.calificacion = calificacion;
    }
    public Estudiante() {

    }
    public static void crearEstudiante() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <= 5; i++) {
            System.out.println("Ingrese el nombre del estudiante: ");
            String nombre = sc.nextLine();
            System.out.println("Ingrese el calificacion del estudiante: ");
            int calificacion = sc.nextInt();
            Estudiante estudiante = new Estudiante(nombre, calificacion);
            listaEstudiantes.add(estudiante);
        }
    }
    public static void mostrarEstudiantes(List<Estudiante> estudiantes) {
        for (Estudiante estudiante : estudiantes) {
            System.out.println("Nombre:"+estudiante.nombre+"\n" +
                    "Calificacion: "+estudiante.calificacion);
        }

    }
}
